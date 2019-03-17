package com.example.demo.builder.director;

import com.example.demo.builder.builder.BaseBuilder;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

/**
 * Program Name: designpattern-demo
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/3/17 1:19 PM
 */
public class Director {

    public void construct(BaseBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
