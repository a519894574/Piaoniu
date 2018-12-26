package com.lkx.show.service.show;

import com.comm.comm.entity.ShowType;
import com.comm.comm.model.*;

import java.util.List;

public interface ShowService {
    List<ShowType> getShowType();

    List<Show> getShow(int type,int city,String name,String date01,String date02);

    Show_info getShowInfo(int id);

}
