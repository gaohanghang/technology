package java知识.effctive_java_3.a2;


import java知识.effctive_java_3.a2.a2_3.NutritionFacts;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @create: 2019/04/27 23:19
 */
public class Test {
    public static void main(String[] args) {
        //NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);

        //NutritionFacts cocaCola = new NutritionFacts();
        //cocaCola.setServingSize(240);
        //cocaCola.setServings(8);
        //cocaCola.setCalories(100);
        //cocaCola.setSodium(35);
        //cocaCola.setCarbohydrate(27);

        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)    .calories(100).sodium(35).carbohydrate(27).build();


    }
}
