package com.functional.builderpattern.director;

import com.functional.builderpattern.entity.Animal;

/**
 * @Author xiongyx
 * @Date 2019/3/20
 */
public class AnimalBuildDirectUtil {
    public static AnimalBuildDirect getNormalAnimal(){
        return animalMaterials -> {
            Animal animal = new Animal();

            animal.setHead(animalMaterials.getHead());
            animal.setBody(animalMaterials.getBody());
            animal.setHand(animalMaterials.getHand());
            animal.setFoot(animalMaterials.getFoot());

            return animal;
        };
    }
}
