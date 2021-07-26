package Week4.Interface;

public class CheckTheAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Dog dog = new Dog();
        Frog frog = new Frog();

        fish.isBreathing();
        fish.isRunning();
        fish.isSwimming();

        dog.isBreathing();
        dog.isRunning();
        dog.isSwimming();

        frog.isBreathing();
        frog.isRunning();
        frog.isSwimming();

    }
}
