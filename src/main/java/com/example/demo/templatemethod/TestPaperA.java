package com.example.demo.templatemethod;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 模板方法模式子类A
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/15 1:21 PM
 */
public class TestPaperA extends TestPager {

    @Override
    String answer1() {
        return " A answer1 ";
    }

    @Override
    String answer2() {
        return " A answer2 ";
    }

    @Override
    String answer3() {
        return " A answer3 ";
    }
}
