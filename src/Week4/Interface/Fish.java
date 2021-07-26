package Week4.Interface;

public class Fish implements WaterAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Fish cannot breath in the usual way");
    }

    @Override
    public void isRunning() {
        System.out.println("Poor fish cannot run and walk");

    }

    @Override
    public void isSwimming() {
        System.out.println("Fish's everyday job is to swim");
    }
}
