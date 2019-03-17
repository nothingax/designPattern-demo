package com.example.demo.builder;

import com.example.demo.builder.concretebuilder.ConcreteBuilder1;
import com.example.demo.builder.concretebuilder.ConcreteBuilder2;
import com.example.demo.builder.director.Director;
import com.example.demo.builder.product.Product;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 建造者模式demo
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/17 1:22 PM
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();


    }
}
