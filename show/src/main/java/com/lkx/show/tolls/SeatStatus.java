package com.lkx.show.tolls;

import com.comm.comm.model.Seat_info;

public class SeatStatus {
    private int seatId;
    private Seat_info seat_info;
    private int seatStatus;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(int seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Seat_info getSeat_info() {
        return seat_info;
    }

    public void setSeat_info(Seat_info seat_info) {
        this.seat_info = seat_info;
    }
}
