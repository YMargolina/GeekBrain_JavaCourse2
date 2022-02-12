package hw5;

public class MyThread extends Thread {
    float[] f;
    int o;

    public MyThread(float[] f, int o) {
        this.f = f;
        this.o = o;
    }

    @Override
    public void run() {
        Main.doWeirdMath(f, o);
    }
}
