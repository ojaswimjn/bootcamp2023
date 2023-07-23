package abstraction;

public class Duck extends Animal{

    @Override
    public void age(int age) {
        this.age=age;
    }

    @Override
    public String walk() {
        return "Dog is walking....and eventually swimming";
    }

    @Override
    public void isDead() {
        if(age>5)
            System.out.println("Duck has died.");
        else
            System.out.println("Duck is enjoying life.");

    }
}
