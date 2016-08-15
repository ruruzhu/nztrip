package com.fitibo.aotearoa.mapper;

import com.fitibo.aotearoa.model.Order;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by qianhao.zhou on 7/24/16.
 */
public interface OrderMapper {

    @Select("select o.id, sku_id, o.uuid, s.name as sku, agent_id, remark, status, create_time, " +
            "update_time, price, gathering_info, primary_contact, primary_contact_email, " +
            "primary_contact_phone, primary_contact_wechat, secondary_contact, " +
            "secondary_contact_email, secondary_contact_phone, secondary_contact_wechat," +
            "reference_number" +
            " from `order` o left join `sku` s on o.sku_id = s.id where o.id = #{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "uuid", property = "uuid"),
            @Result(column = "agent_id", property = "agentId"),
            @Result(column = "remark", property = "remark"),
            @Result(column = "status", property = "status"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_info", property = "gatheringInfo"),
            @Result(column = "primary_contact", property = "primaryContact"),
            @Result(column = "primary_contact_email", property = "primaryContactEmail"),
            @Result(column = "primary_contact_phone", property = "primaryContactPhone"),
            @Result(column = "primary_contact_wechat", property = "primaryContactWechat"),
            @Result(column = "secondary_contact", property = "secondaryContact"),
            @Result(column = "secondary_contact_email", property = "secondaryContactEmail"),
            @Result(column = "secondary_contact_phone", property = "secondaryContactPhone"),
            @Result(column = "secondary_contact_wechat", property = "secondaryContactWechat"),
            @Result(column = "reference_number", property = "referenceNumber"),
    })
    Order findById(int id);

    @Select("select o.id, o.sku_id, o.uuid, o.agent_id, o.remark, o.status, o.create_time, o.update_time," +
            "o.price, o.gathering_info, o.primary_contact, o.primary_contact_email, o.primary_contact_phone," +
            "o.primary_contact_wechat, o.secondary_contact, o.secondary_contact_email, o.secondary_contact_phone," +
            "o.secondary_contact_wechat, o.reference_number, s.name " +
            "from `order` o left join `sku` s on o.sku_id = s.id " +
            "where agent_id = #{agentId}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "uuid", property = "uuid"),
            @Result(column = "agent_id", property = "agentId"),
            @Result(column = "remark", property = "remark"),
            @Result(column = "status", property = "status"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_info", property = "gatheringInfo"),
            @Result(column = "primary_contact", property = "primaryContact"),
            @Result(column = "primary_contact_email", property = "primaryContactEmail"),
            @Result(column = "primary_contact_phone", property = "primaryContactPhone"),
            @Result(column = "primary_contact_wechat", property = "primaryContactWechat"),
            @Result(column = "secondary_contact", property = "secondaryContact"),
            @Result(column = "secondary_contact_email", property = "secondaryContactEmail"),
            @Result(column = "secondary_contact_phone", property = "secondaryContactPhone"),
            @Result(column = "secondary_contact_wechat", property = "secondaryContactWechat"),
            @Result(column = "reference_number", property = "referenceNumber"),
            @Result(column = "name", property = "sku"),
    })
    List<Order> findByAgentId(@Param("agentId") int agentId, RowBounds rowBounds);

    @Select("<script>" +
            "select o.id, o.sku_id, o.uuid, o.agent_id, o.remark, o.status, o.create_time, o.update_time," +
            "o.price, o.gathering_info, o.primary_contact, o.primary_contact_email, o.primary_contact_phone," +
            "o.primary_contact_wechat, o.secondary_contact, o.secondary_contact_email, o.secondary_contact_phone," +
            "o.secondary_contact_wechat, o.reference_number, s.name " +
            "from `order` o left join `sku` s on o.sku_id = s.id " +
            "where agent_id = #{agentId} " +
            "<if test =\"keyword != null and keyword != ''\">and s.name like CONCAT('%',#{keyword},'%') </if> " +
            "<if test =\"uuid != null and uuid != ''\">and o.uuid = #{uuid} </if> " +
            "<if test =\"referenceNumber != null and referenceNumber != ''\">and o.reference_number = #{referenceNumber} </if> " +
            "</script>")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "uuid", property = "uuid"),
            @Result(column = "agent_id", property = "agentId"),
            @Result(column = "remark", property = "remark"),
            @Result(column = "status", property = "status"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_info", property = "gatheringInfo"),
            @Result(column = "primary_contact", property = "primaryContact"),
            @Result(column = "primary_contact_email", property = "primaryContactEmail"),
            @Result(column = "primary_contact_phone", property = "primaryContactPhone"),
            @Result(column = "primary_contact_wechat", property = "primaryContactWechat"),
            @Result(column = "secondary_contact", property = "secondaryContact"),
            @Result(column = "secondary_contact_email", property = "secondaryContactEmail"),
            @Result(column = "secondary_contact_phone", property = "secondaryContactPhone"),
            @Result(column = "secondary_contact_wechat", property = "secondaryContactWechat"),
            @Result(column = "reference_number", property = "referenceNumber"),
            @Result(column = "name", property = "sku"),
    })
    List<Order> findByAgentIdAndMultiFields(@Param("agentId") int agentId,
                                            @Param("uuid") String uuid,
                                            @Param("keyword") String keyword,
                                            @Param("referenceNumber") String referenceNumber,
                                            RowBounds rowBounds);


    @Select("select o.id, o.sku_id, o.uuid, o.agent_id, o.remark, o.status, o.create_time, o.update_time," +
            "o.price, o.gathering_info, o.primary_contact, o.primary_contact_email, o.primary_contact_phone," +
            "o.primary_contact_wechat, o.secondary_contact, o.secondary_contact_email, o.secondary_contact_phone," +
            "o.secondary_contact_wechat, o.reference_number, s.name " +
            "from `order` o left join `sku` s on o.sku_id = s.id ")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "uuid", property = "uuid"),
            @Result(column = "agent_id", property = "agentId"),
            @Result(column = "remark", property = "remark"),
            @Result(column = "status", property = "status"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_info", property = "gatheringInfo"),
            @Result(column = "primary_contact", property = "primaryContact"),
            @Result(column = "primary_contact_email", property = "primaryContactEmail"),
            @Result(column = "primary_contact_phone", property = "primaryContactPhone"),
            @Result(column = "primary_contact_wechat", property = "primaryContactWechat"),
            @Result(column = "secondary_contact", property = "secondaryContact"),
            @Result(column = "secondary_contact_email", property = "secondaryContactEmail"),
            @Result(column = "secondary_contact_phone", property = "secondaryContactPhone"),
            @Result(column = "secondary_contact_wechat", property = "secondaryContactWechat"),
            @Result(column = "reference_number", property = "referenceNumber"),
            @Result(column = "name", property = "sku"),
    })
    List<Order> findAll(RowBounds rowBounds);

    @Select("<script>" +
            "select o.id, o.sku_id, o.uuid, o.agent_id, o.remark, o.status, o.create_time, o.update_time," +
            "o.price, o.gathering_info, o.primary_contact, o.primary_contact_email, o.primary_contact_phone," +
            "o.primary_contact_wechat, o.secondary_contact, o.secondary_contact_email, o.secondary_contact_phone," +
            "o.secondary_contact_wechat, o.reference_number, s.name " +
            "from `order` o left join `sku` s on o.sku_id = s.id " +
            "where 1 = 1 " +
            "<if test =\"keyword != null and keyword != ''\">and s.name like CONCAT('%',#{keyword},'%') </if> " +
            "<if test =\"uuid != null and uuid != ''\">and o.uuid = #{uuid} </if> " +
            "<if test =\"referenceNumber != null and referenceNumber != ''\">and o.reference_number = #{referenceNumber} </if> " +
            "</script>")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "uuid", property = "uuid"),
            @Result(column = "agent_id", property = "agentId"),
            @Result(column = "remark", property = "remark"),
            @Result(column = "status", property = "status"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_info", property = "gatheringInfo"),
            @Result(column = "primary_contact", property = "primaryContact"),
            @Result(column = "primary_contact_email", property = "primaryContactEmail"),
            @Result(column = "primary_contact_phone", property = "primaryContactPhone"),
            @Result(column = "primary_contact_wechat", property = "primaryContactWechat"),
            @Result(column = "secondary_contact", property = "secondaryContact"),
            @Result(column = "secondary_contact_email", property = "secondaryContactEmail"),
            @Result(column = "secondary_contact_phone", property = "secondaryContactPhone"),
            @Result(column = "secondary_contact_wechat", property = "secondaryContactWechat"),
            @Result(column = "reference_number", property = "referenceNumber"),
            @Result(column = "name", property = "sku"),
    })
    List<Order> findAllByMultiFields(@Param("uuid") String uuid,
                                     @Param("keyword") String keyword,
                                     @Param("referenceNumber") String referenceNumber,
                                     RowBounds rowBounds);

    @Select("select count(1) from `order` where agent_id = #{agentId}")
    int countByAgentId(int agentId);

    @Select("select * from `order` where agent_id = #{agentId} and status = #{status}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "uuid", property = "uuid"),
            @Result(column = "agent_id", property = "agentId"),
            @Result(column = "remark", property = "remark"),
            @Result(column = "status", property = "status"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_info", property = "gatheringInfo"),
            @Result(column = "primary_contact", property = "primaryContact"),
            @Result(column = "primary_contact_email", property = "primaryContactEmail"),
            @Result(column = "primary_contact_phone", property = "primaryContactPhone"),
            @Result(column = "primary_contact_wechat", property = "primaryContactWechat"),
            @Result(column = "secondary_contact", property = "secondaryContact"),
            @Result(column = "secondary_contact_email", property = "secondaryContactEmail"),
            @Result(column = "secondary_contact_phone", property = "secondaryContactPhone"),
            @Result(column = "secondary_contact_wechat", property = "secondaryContactWechat"),
            @Result(column = "reference_number", property = "referenceNumber"),
    })
    List<Order> findByAgentIdAndStatus(@Param("agentId") int agentId, @Param("status") int status, RowBounds rowBounds);

    @Insert("insert into `order` (sku_id, uuid, agent_id, remark, status, price, gathering_info, " +
            "primary_contact, primary_contact_email, primary_contact_phone, primary_contact_wechat, " +
            "secondary_contact, secondary_contact_email, secondary_contact_phone, " +
            "secondary_contact_wechat, reference_number) " +
            "values(#{skuId}, #{uuid}, #{agentId}, #{remark}, #{status}, #{price}, #{gatheringInfo}, " +
            "#{primaryContact}, #{primaryContactEmail}, #{primaryContactPhone}, #{primaryContactWechat}, " +
            "#{secondaryContact}, #{secondaryContactEmail}, #{secondaryContactPhone}, " +
            "#{secondaryContactWechat}, #{referenceNumber})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id", flushCache = Options.FlushCachePolicy.DEFAULT)
    int create(Order order);

    @Update("update `order` set primary_contact = #{primaryContact}, "+
            "primary_contact_email = #{primaryContactEmail}, " +
            "primary_contact_phone = #{primaryContactPhone}, " +
            "primary_contact_wechat = #{primaryContactWechat}, " +
            "secondary_contact = #{secondaryContact}, " +
            "secondary_contact_email = #{secondaryContactEmail}, " +
            "secondary_contact_phone = #{secondaryContactPhone}, " +
            "secondary_contact_wechat = #{secondaryContactWechat}" +
            "where id = #{id}")
    int updateOrderInfo(Order order);
}
