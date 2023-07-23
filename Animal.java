package abstraction;

public abstract class Animal {
    protected int age;
    public String walk(){
        System.out.println("Animal can walking.");
        return null;
    }

    public abstract void age(int age);
    public abstract void isDead();


}
