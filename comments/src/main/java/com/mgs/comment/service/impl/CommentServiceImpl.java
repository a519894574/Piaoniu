package com.mgs.comment.service.impl;

import com.comm.comm.entity.Comment;
import com.comm.comm.model.Comments;
import com.mgs.comment.dao.CommentDao;
import com.mgs.comment.service.CommentService;
import com.mgs.comment.service.migan.SensitiveService;
import com.mgs.comment.util.Pagecount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentDao commentDao;

    @Override
    public int findAllCount() {
        return commentDao.findAllCount();
    }

    @Override
    public List<Comments> findAllLimnt(Pagecount pagecount) {
        SensitiveService sensitiveService = new SensitiveService();
        try {
            sensitiveService.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Comments>list=commentDao.findAllLimnt(pagecount);
        List<Comments>list1=new ArrayList<>();
        for (Comments s:list) {
            s.setContent(sensitiveService.filter(s.getContent()));
            list1.add(s);
        }
        return list1;
//        return commentDao.findAllLimnt(pagecount);
    }

    @Override
    public List<Comments> findOneByACid(int  show_id) {
        SensitiveService sensitiveService = new SensitiveService();
        try {
            sensitiveService.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Comments>list=commentDao.findOneByACid(show_id);
        List<Comments>list1=new ArrayList<>();
        for (Comments s:list) {
            s.setContent(sensitiveService.filter(s.getContent()));
            list1.add(s);
        }
        return list1;
    //return commentDao.findOneByACid(show_id);
    }

    @Override
    public int add(Comment comment) {
        return commentDao.add(comment);
    }

    @Override
    public int updata(Comment comment) {
        return commentDao.updata(comment);
    }

    @Override
    public List<Comments> findbyUidandAid(Comment comment) {
        SensitiveService sensitiveService = new SensitiveService();
        try {
            sensitiveService.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Comments>list=commentDao.findbyUidandAid(comment);
        List<Comments>list1=new ArrayList<>();
        for (Comments s:list) {
            s.setContent(sensitiveService.filter(s.getContent()));
            list1.add(s);
        }
        return list1;
       // return commentDao.findbyUidandAid(comment);
    }

    public int pageAll(int size){
        int pageAll=findAllCount()/size;
        if(findAllCount()%size>0){
            return pageAll+1;
        }
        return  pageAll;
    }
}
