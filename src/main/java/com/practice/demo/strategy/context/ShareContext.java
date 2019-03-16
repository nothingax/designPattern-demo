package com.practice.demo.strategy.context;

import com.practice.demo.strategy.contextsub.WechatShare;
import com.practice.demo.strategy.strategy.ShareContent;
import com.practice.demo.strategy.strategy.ShareImageUrl;
import com.practice.demo.strategy.strategy.ShareLink;
import com.practice.demo.strategy.strategy.ShareTitle;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 上下文
 * 上下文里放置具体策略
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 2:26 PM
 */
public class ShareContext {
    protected ShareTitle shareTitle;

    protected ShareContent shareContent;

    protected ShareImageUrl shareImageUrl;

    protected ShareLink shareLink;


    public static ShareContext getConcrete(Integer type) {

        // TODO 这里的逻辑可以用反射，获取具体的策略，
        // 因为使用了子类上下文，上下文里包含策略，返回上下文。

        return new WechatShare();
    }


    /**
     * 上下文的方法，让自己的属性类调用
     */
    public  String showTitle() {
        return shareTitle.showTitle();
    }

}
