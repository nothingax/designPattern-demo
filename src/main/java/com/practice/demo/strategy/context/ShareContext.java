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

    // 思考这里可以定义微信策略属性，微信策略里有多个方法，而没有必要将每一个方法都抽成一个策略
    // 因为这样会制造过多的类，导致臃肿不堪，比如增加了QQ分享，就要增加4个策略实现类，一个QQContext
    protected ShareTitle shareTitle;

    protected ShareContent shareContent;

    protected ShareImageUrl shareImageUrl;

    protected ShareLink shareLink;


    // TODO 以微信、QQ为单位创建策略，而不是以某个行为创建策略
    private Object wechatStrategy; //

    public static ShareContext getConcrete(Integer type) throws Exception {

        // TODO 这里的逻辑可以用反射，获取具体的策略，
        // 因为使用了子类上下文，上下文里包含策略，返回上下文。

        switch (type) {
            case 1:
                return new WechatShare();
            default:
                throw new Exception("");
        }
    }


    /**
     * 上下文的方法，让自己的属性类调用
     */
    public String showTitle() {
        return shareTitle.showTitle();
    }

    public String showContent() {
        return shareContent.showContent();
    }

    public String showImageUrl(final String platform) {
        return shareImageUrl.showImageUrl(platform);
    }

    public String showLink(final String platform, final String userToken) {
        return shareLink.getShareLink(platform, userToken);
    }


}
