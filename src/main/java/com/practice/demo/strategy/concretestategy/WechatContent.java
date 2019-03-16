package com.practice.demo.strategy.concretestategy;

import com.practice.demo.strategy.strategy.ShareContent;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/16 2:21 PM
 */
public class WechatContent implements ShareContent {
    @Override
    public String showContent() {
        return "从配置为文件获取的Content";
    }
}
