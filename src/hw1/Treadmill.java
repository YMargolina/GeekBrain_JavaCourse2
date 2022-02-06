package hw1;

public class Treadmill implements Obstacle {
    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean canBeDoneBy(Movable m) {
        return m.run(this.length);
    }
}
