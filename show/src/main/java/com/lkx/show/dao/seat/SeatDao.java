package com.lkx.show.dao.seat;

import com.comm.comm.model.Seat_info;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatDao {
    //已坐的座位
    List<Integer> getSeat(@Param("show_id") int show_id);

    //会馆座位数
    int getSeatNum(@Param("g_id") int g_id);

    List<Seat_info> getSeatInfo(@Param("show_id") int show_id);
}
