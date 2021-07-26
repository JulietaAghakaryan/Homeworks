package Week4.Interface;

public class Frog implements LandAnimal, WaterAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Frog can breath in either way");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog can run");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog can swim");
    }
}
