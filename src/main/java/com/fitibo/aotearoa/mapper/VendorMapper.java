package com.fitibo.aotearoa.mapper;

import com.fitibo.aotearoa.model.Vendor;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * Created by qianhao.zhou on 7/24/16.
 */
public interface VendorMapper {

    @Select("select * from vendor where id = #{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "email", property = "email"),
    })
    Vendor findById(int id);

    @Select("select * from vendor")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "email", property = "email"),
    })
    List<Vendor> findAll();

    @Insert("insert into vendor(name, email) values(#{name}, #{email})")
    @SelectKey(statement = "select last_insert_id() as id", keyProperty = "id", keyColumn = "id", before = false, resultType = Integer.class)
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id", flushCache = Options.FlushCachePolicy.DEFAULT)
    int create(Vendor vendor);
}
