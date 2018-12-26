package com.pgj.demo.controller;

import com.comm.comm.entity.Discount;
import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.pgj.demo.service.DiscountService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "discount")
public class DiscountController {

    @Autowired
    DiscountService discountService;
    @RequestMapping(value = "insertDiscount",method = RequestMethod.GET)
    @ApiOperation(value = "添加优惠券",notes="添加优惠券")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser(@ModelAttribute Discount discount) {
       if(discountService.insertDiscount(discount)>0){
            return Status.getStatus(0);
       }else {
           return Status.getStatus(1);
       }
    }

    @RequestMapping(value = "selectByUidAndSid",method = RequestMethod.GET)
    @ApiOperation(value = "查询优惠券",notes="查询优惠券")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser1(@ModelAttribute Discount discount) {
        if(discountService.selectByUidAndSid(discount).size()>0){
            return Status.getStatus(0,discountService.selectByUidAndSid(discount));
        }else {
            return Status.getStatus(1);
        }
    }

    @RequestMapping(value = "selectByUidAndShowid",method = RequestMethod.GET)
    @ApiOperation(value = "下订单时查询对应优惠券",notes="下订单时查询对应优惠券")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser2(@ModelAttribute Discount discount) {
        if(discountService.selectByUidAndShowid(discount).size()>0){
            return Status.getStatus(0,discountService.selectByUidAndShowid(discount));
        }else {
            return Status.getStatus(1);
        }
    }

    @Scheduled(cron = "0 0 0 * * ?") // [秒] [分] [小时] [日] [月] [周] [年]
//    @RequestMapping(value = "genxin",method = RequestMethod.GET)
//    @ApiOperation(value = "更新",notes="更新")
//    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json Dtime(){
        /**
         * 查询未使用券的结束时间 == 当天时间  获取优惠券ID     if ==  update
          */
        discountService.updateByDid();
        return Status.getStatus(0);
    }



    @RequestMapping(value = "updateByUid",method = RequestMethod.GET)
    @ApiOperation(value = "使用时修改优惠券状态",notes="使用时修改优惠券状态")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
    public Json getUser4(@ModelAttribute Discount discount) {
        System.out.println(discountService.updateByDids(discount));
        return Status.getStatus(0);
    }
}
