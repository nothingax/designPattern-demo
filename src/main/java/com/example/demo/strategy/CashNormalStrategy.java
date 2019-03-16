package com.example.demo.strategy;

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

    /**
     * 正常收费,原价返回
     * @return
     */
    @Override
    public Integer acceptCash(Integer money) {
        return money;
    }
}
