package hw1;

public class Cat implements Movable {
    int max_height;
    int max_length;

    public Cat(int max_height, int max_length) {
        this.max_height = max_height;
        this.max_length = max_length;
    }

    public boolean run(int length) {
        if (length <= max_length) {
            System.out.println("Cat run...");
            return true;
        } else System.out.println("Cat cannot run...");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height <= max_height) {
            System.out.println("Cat jumps...");
            return true;
        } else System.out.println("Cat cannot jump...");
        return false;
    }


}
