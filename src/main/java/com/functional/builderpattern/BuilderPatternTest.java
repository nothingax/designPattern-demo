package com.functional.builderpattern;

import com.functional.builderpattern.builder.AnimalBuilder;
import com.functional.builderpattern.director.AnimalBuildDirectUtil;
import com.functional.builderpattern.entity.Animal;
import com.functional.builderpattern.materials.AnimalMaterialsUtil;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @Author xiongyx
 * @Date 2019/3/20
 */
public class BuilderPatternTest {

    public static void main(String[] args){
        Animal normalHuman = AnimalBuilder.build(
            AnimalMaterialsUtil.getHumanMaterials(),
            AnimalBuildDirectUtil.getNormalAnimal()
        );

        System.out.println(normalHuman);

        new ArrayList<>().stream().collect(Collectors.toList());
    }
}
