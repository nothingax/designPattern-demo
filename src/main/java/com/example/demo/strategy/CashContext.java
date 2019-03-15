package com.example.demo.strategy;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 上下文，维护对一个策略对象的引用
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 1:20 AM
 */
public class CashContext {

    private CashSuper concreteCashSuper;

    /**
     * 参数是一个字符串，表示收费类型，此处与简单工厂模式结合
     * @param type
     */
    public CashContext(String type) throws Exception {

        // 分支判断放在context里，而不是放在客户端里，不需要由客户端来生成具体策略
        // 减轻了客户端的判断的压力
        switch (type){
            case "normal":
                concreteCashSuper = new CashNormal();
                break;
            case "打9折":
                concreteCashSuper = new CashRebate(9);
                break;
            case "满300减100":
                concreteCashSuper = new CashReturn(300,100);
                break;
            default:
                throw new Exception("未知的策略类型");

        }
    }

    /**
     * 通过具体的策略来计算支付金额
     */
    public Integer getResult(Integer money) {
        return concreteCashSuper.acceptCash(money);
    }
}
