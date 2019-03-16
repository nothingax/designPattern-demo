package com.practice.demo.strategy.contextsub;

import com.practice.demo.strategy.concretestategy.WechatContent;
import com.practice.demo.strategy.concretestategy.WechatImageUrl;
import com.practice.demo.strategy.concretestategy.WechatShareLink;
import com.practice.demo.strategy.concretestategy.WechatTitle;
import com.practice.demo.strategy.context.ShareContext;
import com.practice.demo.strategy.strategy.ShareTitle;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 上下文的子类
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 2:23 PM
 */
public class WechatShare extends ShareContext {
    public WechatShare() {
        // wechatshare  是一组策略的集合，在其初始化的时候，构造方法将赋值上下文内的策略属性
        // 与书上的简易策略模式相比多了这一部分，对一组策略的封装

        super.shareTitle = new WechatTitle();
        super.shareContent = new WechatContent();
        super.shareImageUrl = new WechatImageUrl();
        super.shareLink = new WechatShareLink();
    }
}
