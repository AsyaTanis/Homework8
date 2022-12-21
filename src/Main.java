import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 + Задача 2");
        int[] weights = new int[3];
        double [] values = {1.57, 7.654, 9.986};
        boolean [] flags = {true, false, true, true};
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0] + ", " + weights[1] + ", " + weights[2]);
        System.out.println(values[0] + ", " + values[1] + ", " + values[2]);
        System.out.println(flags[0] + ", " + flags[1] + ", " + flags[2]+ ", " + flags[3]);
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] weights = new int[3];
        double [] values = {1.57, 7.654, 9.986};
        boolean [] flags = {true, false, true, true};
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[2] + ", " + weights[1] + ", " + weights[0]);
        System.out.println(values[2] + ", " + values[1] + ", " + values[0]);
        System.out.println(flags[3] + ", " + flags[2] + ", " + flags[1]+ ", " + flags[0]);

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");

        int[] weights = {1, 2, 3};
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 == 1) {
                weights[i]+=1;
            }
        }
        System.out.println(Arrays.toString(weights));
    }
}