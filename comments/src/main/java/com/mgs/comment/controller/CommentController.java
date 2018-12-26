package com.mgs.comment.controller;


import com.comm.comm.entity.Comment;
import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.mgs.comment.service.impl.CommentServiceImpl;
import com.mgs.comment.service.migan.SensitiveService;
import com.mgs.comment.util.Pagecount;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Resource
    private CommentServiceImpl commentService;
    @Autowired
    private SensitiveService sensitiveService;
//    @Autowired
//    private Comment comment;

   @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public int getAll(){
        return commentService.findAllCount();
    }

    @RequestMapping(value = "/getAll0",method = RequestMethod.GET)
    @ApiOperation(value = "分页显示",notes = "分页评论查询-依据演出id分页")
    @ApiResponses({@ApiResponse(code= 1,message = "操作成功" ),
            @ApiResponse(code = 0 ,message = "操作失败，服务器内部异常") ,
            @ApiResponse(code = 303, message = "权限不足")})
    public Json getAll0(int page,int size, int show_id){
        Pagecount pagecount = new Pagecount();
        pagecount.setPage(page);
        pagecount.setSize(size);
        pagecount.setShow_id(show_id);
       return Status.getStatus(0, commentService.findAllLimnt(pagecount));
    }

    @RequestMapping(value = "/getAll1",method = RequestMethod.GET)
    @ApiOperation(value = "分页显示",notes = "分页评论查询==演出详情的分页查询 15条")
    @ApiResponses({@ApiResponse(code= 1,message = "操作成功" ),
            @ApiResponse(code = 0 ,message = "操作失败，服务器内部异常") ,
            @ApiResponse(code = 303, message = "权限不足")})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "show_id",value = "演出的id",required = false, dataType= "String")
    })
    public Json getAll1(int show_id){
        System.out.println(show_id);
        return Status.getStatus(0, commentService.findOneByACid(show_id));
    }

    @RequestMapping(value = "/getMy",method = RequestMethod.GET)
    @ApiOperation(value = "分页显示",notes = "分页评论查询==演出详情的分页查询 3条")
    @ApiResponses({@ApiResponse(code= 1,message = "操作成功" ),
            @ApiResponse(code = 0 ,message = "操作失败，服务器内部异常") ,
            @ApiResponse(code = 303, message = "权限不足")})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_id",value = "用户id",required = false, dataType= "int"),
            @ApiImplicitParam(name = "show_id",value = "演出id",required = false, dataType= "int")
    })
    public Json getmY(int user_id ,int show_id){
       Comment comment = new Comment();
       comment.setUser_id(user_id);
       comment.setShow_id(show_id);
        return Status.getStatus(0, commentService.findbyUidandAid(comment));
    }


    @RequestMapping(value = "/add",method = RequestMethod.GET)
    @ApiOperation(value = "添加评论",notes = "添加评论")
    @ApiResponses({@ApiResponse(code= 1,message = "操作成功" ),
            @ApiResponse(code = 0 ,message = "操作失败，服务器内部异常") ,
            @ApiResponse(code = 303, message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "comment",value = "评论的实体",required = false, dataType= "Comment")
//    })
    public Json getAdd(String content,int show_id,int user_id){
       Comment comment = new Comment();
        comment.setContent(content);
        comment.setShow_id(show_id);
        comment.setUser_id(user_id);
        comment.setComtime(new Date());
        /**
         * 添加判断，如果已对该演出发表评论，无法进行添加
         * 添加过滤，出现敏感词汇，提示，无法发送==替换为*--取
         */
        if(commentService.findbyUidandAid(comment).size()>0){
            return Status.getStatus(0, "已存在评论");
        }
        try {
            sensitiveService.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        commentService.add(comment);
        comment.setContent(sensitiveService.filter(comment.getContent()));
        return Status.getStatus(0, comment);
    }


    @RequestMapping(value = "/update",method = RequestMethod.GET)
    @ApiOperation(value = "修改评论",notes = "修改评论")
    @ApiResponses({@ApiResponse(code= 1,message = "操作成功" ),
            @ApiResponse(code = 0 ,message = "操作失败，服务器内部异常") ,
            @ApiResponse(code = 303, message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "comment",value = "评论的实体",required = false, dataType= "Comment")
//    })
    public Json getUpdata(int c_id,String conntent){
       Comment comment = new Comment();
       comment.setC_id(c_id);
       comment.setContent(conntent);
        commentService.updata(comment);
        comment.setContent(sensitiveService.filter(comment.getContent()));
       return Status.getStatus(0, commentService.updata(comment));
    }

}
