package com.work.strategy.concretestrategy;

import com.work.strategy.strategy.BaseCashSuperStrategy;

import java.util.List;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 折扣
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 1:03 AM
 */
public class CashRebateStrategy extends BaseCashSuperStrategy {

    // 折扣率
    private Integer moneyRebate = 50 ;

    public CashRebateStrategy(Integer moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public List<Object> getPayDetail(Object order, Object coupon) {
        return null;
    }
}
