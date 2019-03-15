package com.example.demo.templatemethod;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description: 模板方法demo
 *
 * 父类建立一个模板，子类实现细节，这些细节在每个子类中是不同的
 * 代码实现：父类是一个抽象类，框架是具体实现，框架里调用细节的实现，
 * 细节的实现是抽象类，留给子类来实现。
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/15 5:50 PM
 */
public class MainTemplateMethod {
    public static void main(String[] args) {

        TestPager testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        TestPager testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();

    }
}
