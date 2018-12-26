package com.mgs.comment.service;

import com.comm.comm.entity.Comment;
import com.comm.comm.model.Comments;
import com.mgs.comment.util.Pagecount;

import java.util.List;

public interface CommentService {
    int findAllCount();
    List<Comments> findAllLimnt(Pagecount pagecount);
    List<Comments> findOneByACid(int show_id);

    int add(Comment comment);
    int updata(Comment comment);

    List<Comments> findbyUidandAid(Comment comment);

}
