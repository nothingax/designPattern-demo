package com.work.strategy;

import com.work.strategy.context.CashContext;

import java.util.List;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 1:37 AM
 */
public class MainStrategy {
    public static void main(String[] args) throws Exception {
        CashContext cashContext = new CashContext("满300减100");

        List<Object> payDetail = cashContext.getPayDetail("order", "coupon");

        // 优惠详情:是一个父订单中，各个子订单最终的支付金额
        System.out.println("优惠详情：" + payDetail.toString());


    }
}
