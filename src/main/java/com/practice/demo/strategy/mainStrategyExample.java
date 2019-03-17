package com.practice.demo.strategy;

import com.practice.demo.strategy.context.ShareContext;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 简书上的一个例子分享功能使用策略模式
 *  https://www.jianshu.com/p/7b7de81cdfbe
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 2:37 PM
 */
public class mainStrategyExample {
    public static void main(String[] args) throws Exception {
        ShareContext context = ShareContext.getConcrete(1);
        String title = context.showTitle();
        System.out.println("获取策略1的title是："+title);

        String image = context.showImageUrl("ios 平台");
        System.out.println(image);
    }
}
