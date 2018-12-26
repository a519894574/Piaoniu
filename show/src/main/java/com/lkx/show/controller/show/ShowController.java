package com.lkx.show.controller.show;

import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.lkx.show.service.show.ShowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "演出节目",tags = {"节目功能接口"})
@RequestMapping("/show")
public class ShowController {
    @Autowired
    private ShowService showService;

    @RequestMapping(value = "/getShowType",method = RequestMethod.GET)
    @ApiOperation(value = "获取演出类型",nickname = "操作成功")
    public Json getShowType(){
        return Status.getStatus(0,showService.getShowType());
    }

    @RequestMapping(value = "/getShow",method = RequestMethod.GET)
    @ApiOperation(value = "获取演出节目列表",nickname = "操作成功")
    public Json getShow(String type,String city,String date01,String date02,String name){
        int t=0;
        int c=0;
        if (type!=null){
            t= Integer.parseInt(type);
        }
        if (city!=null){
            c= Integer.parseInt(city);
        }
        return Status.getStatus(0,showService.getShow(t,c,date01,date02,name));
    }

    @RequestMapping(value = "/getShowInfo",method = RequestMethod.GET)
    @ApiOperation(value = "获取单个演出节目详情",nickname = "操作成功")
    public Json getShowInfo(String showid){
        int a=0;
        if (showid!=null){
            a= Integer.parseInt(showid);
        }
        return Status.getStatus(0,showService.getShowInfo(a));
    }
}
