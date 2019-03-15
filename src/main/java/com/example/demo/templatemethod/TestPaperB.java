package com.example.demo.templatemethod;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 模板方法模式子类B
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/15 1:21 PM
 */
public class TestPaperB extends TestPager {

    @Override
    String answer1() {
        return " B answer1 ";
    }

    @Override
    String answer2() {
        return " B answer2 ";
    }

    @Override
    String answer3() {
        return " B answer3 ";
    }
}
