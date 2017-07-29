package com.fitibo.aotearoa.service;

import com.fitibo.aotearoa.dto.SkuInventoryDto;
import com.fitibo.aotearoa.dto.Transition;

import java.util.Date;
import java.util.List;

/**
 * Created by qianhao.zhou on 8/25/16.
 */

public interface OrderService {

    List<Transition> getAvailableTransitions(int status);

    SkuInventoryDto countTotalUsers(int skuId, Date date, String time);

}
