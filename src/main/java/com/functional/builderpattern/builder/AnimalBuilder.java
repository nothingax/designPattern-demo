package com.functional.builderpattern.builder;

import com.functional.builderpattern.director.AnimalBuildDirect;
import com.functional.builderpattern.entity.Animal;
import com.functional.builderpattern.materials.AnimalMaterials;

/**
 * @Author xiongyx
 * @Date 2019/3/20
 */
public class AnimalBuilder {
    public static Animal build(AnimalMaterials animalMaterials, AnimalBuildDirect animalBuildDirect){
        return animalBuildDirect.build(animalMaterials);
    }
}
