package com.example.demo.builder.builder;

import com.example.demo.builder.product.Product;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/17 1:13 PM
 */
public abstract class BaseBuilder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
