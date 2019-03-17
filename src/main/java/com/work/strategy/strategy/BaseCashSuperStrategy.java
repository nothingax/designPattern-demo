package com.work.strategy.strategy;

import java.util.List;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 1:00 AM
 */
public abstract class BaseCashSuperStrategy {

    /**
     * 抽象，子类实现，订单对象和优惠券对象获得优惠详情
     */
    public abstract List<Object> getPayDetail(Object order, Object coupon);


    /**
     * 具体，统一实现，所有策略中的相同的部分
     */
    public  List<Object> getPayDetailCommon(Object order, Object coupon){

        return null;
    }

}
