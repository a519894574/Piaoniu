package com.lkx.show.dao.show;

import com.comm.comm.entity.ShowType;
import com.comm.comm.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShowDao {
    //获取演出类型
    List<ShowType> getShowType();

    //获取演出节目
    List<Show> getShow(@Param("show_type") int show_type,@Param("show_date01") String show_date01,@Param("show_date02") String show_date02,@Param("show_name") String show_name,@Param("show_city") int show_city);

    //获取单个演出节目详情
    Show_info getShowInfo(@Param("show_id") int show_id);

    //获取演出价位
    List<Show_price> getPrice(@Param("show_id") int show_id);
}
