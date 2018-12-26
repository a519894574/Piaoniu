package com.lkx.show.service.seat;

import com.lkx.show.tolls.SeatStatus;

import java.util.List;

public interface SeatService {
    //已订座位
    List<Integer> getSeat(int show_id);

    List<SeatStatus> getStatus(int show_id,int g_id);
}
