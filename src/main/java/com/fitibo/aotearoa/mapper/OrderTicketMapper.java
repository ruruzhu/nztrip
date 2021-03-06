package com.fitibo.aotearoa.mapper;

import com.fitibo.aotearoa.model.OrderTicket;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Created by qianhao.zhou on 8/5/16.
 */
public interface OrderTicketMapper {

    @Insert("insert into order_ticket(`sku_id`, `sku_ticket_id`, `order_id`, `sku_ticket_name`, " +
            "`count_constraint`, `age_constraint`, `weight_constraint`, `ticket_description`, " +
            "`ticket_price_id`, `ticket_date`, `ticket_time`, `sale_price`, `cost_price`, `price_description`, `price`, `gathering_place`, `gathering_time`) "
            +
            "values(#{skuId}, #{skuTicketId}, #{orderId}, #{skuTicket}, " +
            "#{countConstraint}, #{ageConstraint}, #{weightConstraint}, #{ticketDescription}, " +
            "#{ticketPriceId}, #{ticketDate}, #{ticketTime}, #{salePrice}, #{costPrice}, #{priceDescription}, #{price}, #{gatheringPlace}, #{gatheringTime})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id", flushCache = Options.FlushCachePolicy.DEFAULT)
    int create(OrderTicket orderTicket);

    @Update("update order_ticket " +
            "set gathering_time = #{gatheringTime}," +
            "gathering_place = #{gatheringPlace} " +
            "where id = #{id}")
    int update(OrderTicket orderTicket);

    @Select("select id, sku_id, sku_ticket_id, order_id, sku_ticket_name, " +
            "count_constraint, age_constraint, weight_constraint, ticket_description, " +
            "ticket_price_id, ticket_date, ticket_time, sale_price, cost_price, " +
            "price_description, price, gathering_place, gathering_time " +
            "from order_ticket where id = #{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "sku_ticket_id", property = "skuTicketId"),
            @Result(column = "order_id", property = "orderId"),
            @Result(column = "sku_ticket_name", property = "skuTicket"),
            @Result(column = "count_constraint", property = "countConstraint"),
            @Result(column = "age_constraint", property = "ageConstraint"),
            @Result(column = "weight_constraint", property = "weightConstraint"),
            @Result(column = "ticket_description", property = "ticketDescription"),
            @Result(column = "ticket_price_id", property = "ticketPriceId"),
            @Result(column = "ticket_date", property = "ticketDate"),
            @Result(column = "ticket_time", property = "ticketTime"),
            @Result(column = "sale_price", property = "salePrice"),
            @Result(column = "cost_price", property = "costPrice"),
            @Result(column = "price_description", property = "priceDescription"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_place", property = "gatheringPlace"),
            @Result(column = "gathering_time", property = "gatheringTime"),
            @Result(column = "id", property = "users", javaType = List.class, many
                    = @Many(select = "com.fitibo.aotearoa.mapper.OrderTicketUserMapper.findByOrderTicketId"))
    })
    OrderTicket findById(int id);

    @Select("select id, sku_id, sku_ticket_id, order_id, sku_ticket_name, " +
            "count_constraint, age_constraint, weight_constraint, ticket_description, " +
            "ticket_price_id, ticket_date, ticket_time, sale_price, cost_price, " +
            "price_description, price, gathering_place, gathering_time " +
            "from order_ticket where order_id = #{orderId}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "sku_ticket_id", property = "skuTicketId"),
            @Result(column = "order_id", property = "orderId"),
            @Result(column = "sku_ticket_name", property = "skuTicket"),
            @Result(column = "count_constraint", property = "countConstraint"),
            @Result(column = "age_constraint", property = "ageConstraint"),
            @Result(column = "weight_constraint", property = "weightConstraint"),
            @Result(column = "ticket_description", property = "ticketDescription"),
            @Result(column = "ticket_price_id", property = "ticketPriceId"),
            @Result(column = "ticket_date", property = "ticketDate"),
            @Result(column = "ticket_time", property = "ticketTime"),
            @Result(column = "sale_price", property = "salePrice"),
            @Result(column = "cost_price", property = "costPrice"),
            @Result(column = "price_description", property = "priceDescription"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_place", property = "gatheringPlace"),
            @Result(column = "gathering_time", property = "gatheringTime"),
            @Result(column = "id", property = "users", javaType = List.class, many
                    = @Many(select = "com.fitibo.aotearoa.mapper.OrderTicketUserMapper.findByOrderTicketId"))
    })
    List<OrderTicket> findByOrderId(int orderId);

    @Select("select id, sku_id, sku_ticket_id, order_id, sku_ticket_name, " +
            "count_constraint, age_constraint, weight_constraint, ticket_description, " +
            "ticket_price_id, ticket_date, ticket_time, sale_price, cost_price, " +
            "price_description, price, gathering_place, gathering_time " +
            "from order_ticket where sku_id = #{skuId} and ticket_date = #{date}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "sku_ticket_id", property = "skuTicketId"),
            @Result(column = "order_id", property = "orderId"),
            @Result(column = "sku_ticket_name", property = "skuTicket"),
            @Result(column = "count_constraint", property = "countConstraint"),
            @Result(column = "age_constraint", property = "ageConstraint"),
            @Result(column = "weight_constraint", property = "weightConstraint"),
            @Result(column = "ticket_description", property = "ticketDescription"),
            @Result(column = "ticket_price_id", property = "ticketPriceId"),
            @Result(column = "ticket_date", property = "ticketDate"),
            @Result(column = "ticket_time", property = "ticketTime"),
            @Result(column = "sale_price", property = "salePrice"),
            @Result(column = "cost_price", property = "costPrice"),
            @Result(column = "price_description", property = "priceDescription"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_place", property = "gatheringPlace"),
            @Result(column = "gathering_time", property = "gatheringTime"),
            @Result(column = "id", property = "users", javaType = List.class, many
                    = @Many(select = "com.fitibo.aotearoa.mapper.OrderTicketUserMapper.findByOrderTicketId"))
    })
    List<OrderTicket> findBySkuIdAndDate(@Param("skuId") int skuId, @Param("date") Date date);

    @Select("select id, sku_id, sku_ticket_id, order_id, sku_ticket_name, " +
            "count_constraint, age_constraint, weight_constraint, ticket_description, " +
            "ticket_price_id, ticket_date, ticket_time, sale_price, cost_price, " +
            "price_description, price, gathering_place, gathering_time " +
            "from order_ticket where sku_id = #{skuId} and ticket_date >= #{from} and ticket_date < #{to}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "sku_id", property = "skuId"),
            @Result(column = "sku_ticket_id", property = "skuTicketId"),
            @Result(column = "order_id", property = "orderId"),
            @Result(column = "sku_ticket_name", property = "skuTicket"),
            @Result(column = "count_constraint", property = "countConstraint"),
            @Result(column = "age_constraint", property = "ageConstraint"),
            @Result(column = "weight_constraint", property = "weightConstraint"),
            @Result(column = "ticket_description", property = "ticketDescription"),
            @Result(column = "ticket_price_id", property = "ticketPriceId"),
            @Result(column = "ticket_date", property = "ticketDate"),
            @Result(column = "ticket_time", property = "ticketTime"),
            @Result(column = "sale_price", property = "salePrice"),
            @Result(column = "cost_price", property = "costPrice"),
            @Result(column = "price_description", property = "priceDescription"),
            @Result(column = "price", property = "price"),
            @Result(column = "gathering_place", property = "gatheringPlace"),
            @Result(column = "gathering_time", property = "gatheringTime"),
            @Result(column = "id", property = "users", javaType = List.class, many
                    = @Many(select = "com.fitibo.aotearoa.mapper.OrderTicketUserMapper.findByOrderTicketId"))
    })
    List<OrderTicket> findBySkuIdAndDuration(@Param("skuId") int skuId, @Param("from") Date from, @Param("to") Date to);

    @Select("select order_id " +
            "from order_ticket where id = #{id}")
    int findOrderId(int id);

    @Delete("delete from order_ticket where id = #{id} and order_id = #{orderId}")
    int deleteTicket(@Param("id") int id, @Param("orderId") int orderId);


    @Select({
            "<script>",
            "select order_id, min(ticket_date) as ticket_date from order_ticket ",
            "<if test='list.size() > 0'>",
            "where order_id in ",
            "<foreach collection='list' open = '(' close = ')' item='item' separator=','>",
            "#{item}",
            "</foreach>",
            "</if>",
            " group by order_id ",
            "</script>"}
    )
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "order_id", property = "orderId"),
            @Result(column = "ticket_date", property = "ticketDate"),
    })
    List<OrderTicket> findOrderTicketDate(@Param("list") List<Integer> orderIds);


    @Select("select ot.id from order_ticket ot left join `order` o on ot.order_id = o.id " +
            "where ot.sku_id = #{skuId} and ticket_date = #{date} and ticket_time = #{time} and o.status = #{status}")
    List<Integer> findIdsByDateTimeAndOrderStatus(@Param("skuId") int skuId,
                                                  @Param("date") Date date,
                                                  @Param("time") String time,
                                                  @Param("status") int status);
}
