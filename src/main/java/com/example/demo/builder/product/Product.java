package com.example.demo.builder.product;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: builder创建的产品
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/17 1:12 PM
 */
public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建：===========");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
