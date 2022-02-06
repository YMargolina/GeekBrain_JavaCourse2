package hw1;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean canBeDoneBy(Movable m) {
        return m.jump(this.height);
    }
}
