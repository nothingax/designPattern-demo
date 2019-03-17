package com.example.demo.builder;

import com.example.demo.builder.concretebuilder.ConcreteBuilder1;
import com.example.demo.builder.concretebuilder.ConcreteBuilder2;
import com.example.demo.builder.director.Director;
import com.example.demo.builder.product.Product;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 建造者模式demo
 * 个人理解：建造者模式不需要接收参数，是程序内部比较固定的永远存在的
 * 比如游戏中的地图，有低画质与高画质两种建造
 *
 * 在本例中，我们建造的产品只关注到部件A、部件B的存在，而不会更进一步关注部件A、B的尺寸、颜色等。
 * 理解这些很重要，避免陷入对【我该如何传递参数进来？】的纠结。
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
