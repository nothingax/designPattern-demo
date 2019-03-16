package com.practice.demo.strategy.concretestategy;

import com.practice.demo.strategy.strategy.ShareLink;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 2:22 PM
 */
public class WechatShareLink implements ShareLink {
    @Override
    public String getShareLink(String platform, String userToken) {
        return "从配置为文件获取的link";
    }
}
