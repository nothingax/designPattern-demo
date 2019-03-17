package com.work.strategy.context;

import com.work.strategy.concretestrategy.CashNormalStrategy;
import com.work.strategy.concretestrategy.CashRebateStrategy;
import com.work.strategy.concretestrategy.CashReturnStrategy;
import com.work.strategy.strategy.BaseCashSuperStrategy;

import java.util.List;
import java.util.Map;

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

    private BaseCashSuperStrategy concreteBaseCashSuperStrategy;

    /**
     * 参数是一个字符串，表示收费类型，此处与简单工厂模式结合
     * @param type
     */
    public CashContext(String type) throws Exception {

        // 分支判断放在context里，而不是放在客户端里，不需要由客户端来生成具体策略
        // 减轻了客户端的判断的压力

        // TODO 这里可以用上反射
        switch (type){
            case "normal":
                concreteBaseCashSuperStrategy = new CashNormalStrategy();
                break;
            case "打9折":
                concreteBaseCashSuperStrategy = new CashRebateStrategy(9);
                break;
            case "满300减100":
                concreteBaseCashSuperStrategy = new CashReturnStrategy(300,100);
                break;
            default:
                throw new Exception("未知的策略类型");

        }
    }


    /**
     * 传入一个父订单，和优惠券，计算每个商品上支付金额
     */
    public List<Object> getPayDetail(Object order,Object coupon) {

        return concreteBaseCashSuperStrategy.getPayDetail(order, coupon);

    }

    /**
     * 返回 每一件商品上使用的优惠券额度
     *
     * @return
     */
    public List<Map<String, Integer>> getProductFeeResult() {

        return null;
    }
}
