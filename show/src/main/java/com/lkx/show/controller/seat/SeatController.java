package com.lkx.show.controller.seat;

import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.lkx.show.service.seat.SeatService;
import com.lkx.show.tolls.SeatStatus;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "座位",tags = {"座位功能接口"})
@RequestMapping("/seat")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @RequestMapping(value = "/seatNum",method = RequestMethod.GET)
    public Json getSeatInfo(String show_id,String g_id){
        int s= Integer.parseInt(show_id);
        int g= Integer.parseInt(g_id);

        List<SeatStatus> list=seatService.getStatus(s,g);
        return Status.getStatus(0,list);
    }
}
