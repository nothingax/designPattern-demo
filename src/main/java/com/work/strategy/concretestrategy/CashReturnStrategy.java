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
 * @date 2019/3/16 1:08 AM
 */
public class CashReturnStrategy extends BaseCashSuperStrategy {

    // 满减条件
    private Integer moneyCondition;

    // 满减额度
    private Integer moneyReturn;

    public CashReturnStrategy(Integer moneyCondition, Integer moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public List<Object> getPayDetail(Object order, Object coupon) {
        return null;
    }
}
