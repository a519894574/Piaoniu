package com.lkx.show.service.seat;

import com.comm.comm.model.Seat_info;
import com.lkx.show.dao.seat.SeatDao;
import com.lkx.show.tolls.SeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    private SeatDao seatDao;

    @Override
    public List<Integer> getSeat(int show_id) {
        return seatDao.getSeat(show_id);
    }

    @Override
    public List<SeatStatus> getStatus(int show_id,int g_id) {
        //获取场馆座位
        int seatNum=seatDao.getSeatNum(g_id);

        //座位详情
        List<Seat_info> seat_infos=seatDao.getSeatInfo(show_id);

        List<Integer> getSeat =seatDao.getSeat(show_id);
        List<SeatStatus> getStatus=new ArrayList<>();
        int size=getSeat.size();
        for (int i=0;i<seatNum;i++){
            SeatStatus seatStatus=new SeatStatus();
            //座位号
            seatStatus.setSeatId(i+1);
            seatStatus.setSeat_info(seat_infos.get(i));
            //状态(1为已预订)
            if (size>0) {
                if (getSeat.contains(i + 1)) {
                    seatStatus.setSeatStatus(1);
                    size--;
                } else {
                    seatStatus.setSeatStatus(0);
                }
            }else {
                seatStatus.setSeatStatus(0);
            }
            getStatus.add(seatStatus);
        }
        return getStatus;
    }
}
