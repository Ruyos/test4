package test3;

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Animals animals = new Dogs();
        simulator.playSound(animals);
        animals = new Cats();
        simulator.playSound(animals);
    }
}
