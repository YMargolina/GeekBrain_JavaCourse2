package hw1;

public class Man implements Movable {
    int max_height;
    int max_length;

    public Man(int max_height, int max_length) {
        this.max_height = max_height;
        this.max_length = max_length;
    }


    @Override
    public boolean run(int length) {
        if (length <= max_length) {
            System.out.println("Man run...");
            return true;
        } else System.out.println("Man cannot run...");
        return false;
    }

    public boolean jump(int height) {
        if (height <= max_height) {
            System.out.println("Man jumps...");
            return true;
        } else System.out.println("Man cannot jump...");
        return false;


    }
}
