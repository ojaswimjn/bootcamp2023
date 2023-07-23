package abstraction;

public class Dog extends Animal{
    @Override
    public void age(int age) {
        this.age=age;
    }

    @Override
    public String walk() {
        return "Dog is walking....and eventually running.";
    }

    @Override
    public void isDead() {
        if(age>15)
            System.out.println("Dog has died.");
        else
            System.out.println("Dog is enjoying life.");

    }
}
