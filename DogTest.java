package abstraction;

import enumerator.DaysOfTheWeek;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age(23);
        dog.isDead();

        dog.age(3);
        dog.isDead();

        Duck duck = new Duck();
        duck.age(3);
        duck.isDead();


    }


}
