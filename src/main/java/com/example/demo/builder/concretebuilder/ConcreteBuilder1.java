package com.example.demo.builder.concretebuilder;

import com.example.demo.builder.builder.BaseBuilder;
import com.example.demo.builder.product.Product;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/17 1:15 PM
 */
public class ConcreteBuilder1 extends BaseBuilder {

    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件 A");
    }

    @Override
    public void buildPartB() {
        product.add("部件 B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
