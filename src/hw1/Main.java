package hw1;

public class Main {
    public static void main(String[] args) {

        Obstacle[] obstacles = {new Treadmill(100), new Wall(3), new Wall(12), new Treadmill(1000),};
        Movable[] movables = {new Cat(10, 500), new Robot(1, 20), new Man(200, 10)};

        for (Movable m : movables) {
            for (Obstacle o : obstacles) {
                if (!o.canBeDoneBy(m)) {
                    break;
                }
            }
        }

    }
}
