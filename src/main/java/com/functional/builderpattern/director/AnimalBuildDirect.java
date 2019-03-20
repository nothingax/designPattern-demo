package com.functional.builderpattern.director;

import com.functional.builderpattern.entity.Animal;
import com.functional.builderpattern.materials.AnimalMaterials;

/**
 * @Author xiongyx
 * @Date 2019/3/20
 */
@FunctionalInterface
public interface AnimalBuildDirect {
    Animal build(AnimalMaterials animalMaterials);
}
