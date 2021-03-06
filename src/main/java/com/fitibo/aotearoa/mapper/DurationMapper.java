package com.fitibo.aotearoa.mapper;

import com.fitibo.aotearoa.model.Duration;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by qianhao.zhou on 8/19/16.
 */
public interface DurationMapper {

    @Select("select * from duration")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Duration> findAll();

    @Select("select * from duration where id = #{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    Duration findById(int durationId);


    @Select({
            "<script>",
            "select * from duration where false",
            "<if test='list.size() > 0'>",
            "or id in ",
            "<foreach collection='list' open = '(' close = ')' item='item' separator=','>",
            "#{item}",
            "</foreach>",
            "</if>",
            "</script>"
    })
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Duration> findByIds(List<Integer> ids);
}
