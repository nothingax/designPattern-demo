package com.practice.demo.strategy.concretestategy;

import com.practice.demo.strategy.strategy.ShareImageUrl;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 2:23 PM
 */
public class WechatImageUrl implements ShareImageUrl {
    @Override
    public String showImageUrl(String platform) {
        return "从配置获取的Image: " + platform;
    }
}
