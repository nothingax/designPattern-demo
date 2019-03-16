package com.example.demo.strategy;

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
    public Integer acceptCash(Integer money) {
        return money * moneyRebate / 100;
    }
}
