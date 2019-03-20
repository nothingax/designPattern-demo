package com.functional.builderpattern.materials;

/**
 * @Author xiongyx
 * @Date 2019/3/20
 */
public class AnimalMaterialsUtil {

    public static AnimalMaterials getHumanMaterials(){
        return new AnimalMaterials() {
            @Override
            public String getHead() {
                return "human head";
            }

            @Override
            public String getBody() {
                return  "human body";
            }

            @Override
            public String getHand() {
                return  "human hand";
            }

            @Override
            public String getFoot() {
                return "human foot";
            }
        };
    }
}
