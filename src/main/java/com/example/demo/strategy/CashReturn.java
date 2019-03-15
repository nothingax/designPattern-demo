package com.example.demo.strategy;

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
public class CashReturn extends CashSuper {

    // 满减条件
    private Integer moneyCondition;

    // 满减额度
    private Integer moneyReturn;

    public CashReturn(Integer moneyCondition, Integer moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public Integer acceptCash(Integer money) {

        if (money >= moneyCondition) {
            return money - moneyReturn;
        }

        return money;
    }
}
