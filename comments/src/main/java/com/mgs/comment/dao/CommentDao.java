package com.mgs.comment.dao;

import com.comm.comm.entity.Comment;
import com.comm.comm.model.Comments;
import com.mgs.comment.util.Pagecount;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 评论的接口设计
 * 0.首页==展示5条，包括用户名，点评内容，演出名
 * 1.只要登录即可进行评价
 * 2.评价可增，改，查===不可进行删
 * 3.精彩影评，全部评论，评论详情，票友评论
 * 4.同一场演出只能进行一次评论，不可以多次评论，可以多次修改，修改后会遍历该演出的所有评论（3）
 * 5.添加评论后，遍历3条评论进行展示
 *
 * 接口中有七个方法==0.查询所有条数    1.查询所有评论（分页，15条） 2.查询对应演出的所有评论（分页，15条）
 *   3.查询对应演出的所有评论（最近3条，时间排序）  4.查询对应演出下的所有条数   5.添加评论  6.编辑评论
 */
@Repository
public interface CommentDao {
    //0.查询所有条数
    int findAllCount();
    //1.分页查询所有评论=（对应的演出id）
    List<Comments> findAllLimnt(Pagecount pagecount);
    //2.查询对应演出下的所有条数
    int findCountByAid( @Param("show_id")Integer show_id);

    //3.查询对应演出的评论
    List<Comments> findOneByACid(@Param("show_id") Integer show_id);

    //4.添加评论
    int add(Comment comment);

    //5.修改评论
    int updata(Comment comment);

    //6.依据用户id与演出id获取评论数===我的评论
     List<Comments> findbyUidandAid(Comment comment);




}
