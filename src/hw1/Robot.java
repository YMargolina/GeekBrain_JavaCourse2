package hw1;

public class Robot implements Movable {
    int max_height;
    int max_length;

    public Robot(int max_height, int max_length) {
        this.max_height = max_height;
        this.max_length = max_length;
    }

    public boolean run(int length) {
        if (length <= max_length) {
            System.out.println("Robot run...");
            return true;
        } else System.out.println("Robot cannot run...");
        return false;
    }

    public boolean jump(int height) {
        if (height <= max_height) {
            System.out.println("Robot jumps...");
            return true;
        } else System.out.println("Robot cannot jump...");
        return false;

    }

}