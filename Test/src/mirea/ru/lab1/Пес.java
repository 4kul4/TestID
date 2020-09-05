
package mirea.ru.lab1;
import java.lang.*;

import static java.lang.StrictMath.sqrt;

public class Пес {
        private String type;
        private Integer age;
            private Integer weight;
        private Integer food;
        private Integer Jopa;

        public Пес(String type02, Integer age02, Integer weight02 , Integer food02 ){

            this.type = type02;
            this.age = age02;
            this.weight = weight02;
            this.food = food02;
        }

    public void GetTypeOfПес(){
            System.out.println("Пес type is " + type);
    }
    public void GetAgeOfПес(){
            System.out.println("Пес age is " + age);
            System.out.println("ዘመን ውስጥ የሰው ዓመት : " + age*7);
    }
    public void GetWeightOfПес(){
            System.out.println("Пес weigth is " + weight);
    }

    public void TestGod(){
            Jopa = weight;
            Jopa += food-1;
        System.out.println("Пес ate " + food + " Now his weight is " + Jopa);

        }
}
