package question2;

import java.util.Random;

public class SumValue extends Thread{
    private int[] arr;
    private int lowIndex, highIndex, partialSum;
    public SumValue(int[] arr, int lowIndex, int highIndex) {
        this.arr = arr;
        this.lowIndex = lowIndex;
        this.highIndex = highIndex;
    }

    public int getPartialSum() {
        return partialSum;
    }

    public void run() {
        partialSum = sum(arr, lowIndex, highIndex);
    }

    public static int sum(int[] arr, int low, int high) {
        int total = 0;

        for (int i = low; i < high; i++) {
            total += arr[i];
        }
        return total;
    }
    static void generateRandomArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101) + 1;
        }

    }

    static long sum(int[] arr) {
        final int THREAD_NUM = 4;
        int size = arr.length / THREAD_NUM;

        SumValue[] sums = new SumValue[THREAD_NUM];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = new SumValue(arr, i* size, (i + 1) * size);
            sums[i].start();
        }
        try {
            for (SumValue sum : sums) {
                sum.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Oops!");
        }

        int total = 0;

        for (SumValue sum : sums) {
            total += sum.getPartialSum();
        }
        return total;
    }


    public static void main(String[] args) {
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
}
