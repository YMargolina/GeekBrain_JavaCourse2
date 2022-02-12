package hw5;

import java.util.Arrays;

public class Main {
    static final int size = 10_000_000;
    static final int h = size / 2;


    public static void main(String[] args) {
        createArray();
        createTwoArrays();
    }

    public static void doWeirdMath(float[] arr, int offset) {
        for (int i = 0; i < arr.length; i++) {
            int j = i + offset;
            arr[i] = (float) (arr[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }

    }

    public static void createArray() {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();

        doWeirdMath(arr, 0);
        System.out.println(System.currentTimeMillis() - a);
        //System.out.println(Arrays.toString(arr));
    }

    public static void createTwoArrays() {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[size - h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, size - h);

        MyThread thread1 = new MyThread(a1, 0);
        MyThread thread2 = new MyThread(a2, h);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, size - h);

        System.out.println(System.currentTimeMillis() - a);
        // System.out.println(Arrays.toString(arr));
    }

}
