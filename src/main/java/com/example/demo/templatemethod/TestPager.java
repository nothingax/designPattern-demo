package com.example.demo.templatemethod;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 模板方法模式父类
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/15 1:17 PM
 */
public abstract class TestPager {

    public void testQuestion1(){
        System.out.println("testQuestion1：");
        System.out.println("答案是：" + answer1());
    }

    public void testQuestion2(){
        System.out.println("testQuestion2：");
        System.out.println("答案是：" + answer2());
    }

    public void testQuestion3(){
        System.out.println("testQuestion3：");
        System.out.println("答案是：" + answer3());
    }

    abstract String answer1();
    abstract String answer2();
    abstract String answer3();
}
