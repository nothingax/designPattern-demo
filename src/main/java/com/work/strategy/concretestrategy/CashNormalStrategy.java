package com.work.strategy.concretestrategy;

import com.work.strategy.strategy.BaseCashSuperStrategy;

import java.util.List;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 1:01 AM
 */
public class CashNormalStrategy extends BaseCashSuperStrategy {

    @Override
    public List<Object> getPayDetail(Object order, Object coupon) {
        return null;
    }
}
