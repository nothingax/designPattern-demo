package com.example.demo.strategy;

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
        Integer result = cashContext.getResult(400);
        System.out.println("最终支付金额是：" + result);

    }
}
