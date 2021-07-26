package Week4.Interface;

public class Dog implements LandAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Dogs can breath");
    }

    @Override
    public void isRunning() {
        System.out.println("Dogs can run");
    }

    @Override
    public void isSwimming() {
        System.out.println("Not a water animal, but dogs can swim");
    }
}
