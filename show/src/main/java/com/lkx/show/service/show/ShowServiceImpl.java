package com.lkx.show.service.show;

import com.comm.comm.entity.ShowType;
import com.comm.comm.model.*;
import com.lkx.show.dao.show.ShowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private ShowDao showDao;

    @Override
    public List<ShowType> getShowType() {
        return showDao.getShowType();
    }

    @Override
    public List<Show> getShow(int type,int city,String name,String date01,String date02) {
        return showDao.getShow(type,date01,date02,name,city);
    }

    @Override
    public Show_info getShowInfo(int id) {
        List<Show_price> list=showDao.getPrice(id);
        Show_info show=showDao.getShowInfo(id);
        show.setShow_prices(list);
        return show;
    }


}
