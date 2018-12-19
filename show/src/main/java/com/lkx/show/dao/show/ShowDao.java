package com.lkx.show.dao.show;

import com.comm.comm.entity.ShowType;
import com.comm.comm.model.Show;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShowDao {
    //获取演出类型
    List<ShowType> getShowType();

    //获取演出节目
    List<Show> getShow(@Param(""));
}
