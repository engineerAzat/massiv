import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Первое задание


        {
            System.out.println("\nTask 1\n");
            int[] weights = new int[2];
            double[] voltage = {1.57, 7.654, 9.986};
            int[] room = new int[5];

        }

        {

            // Второе задание

            System.out.println("\nTask 2\n");
            int[] weights = new int[3];
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;
            for (int i = 0; i < 3; i++) {
                if (i == weights.length - 1) {
                    System.out.println(weights[i]);
                    break;
                }
                System.out.print(weights[i] + ", ");

            }
            double[] voltage = {1.57, 7.654, 9.986};
            for (int i = 0; i <= 2; i++) {
                if (i == voltage.length - 1) {
                    System.out.println(voltage[i]);
                    break;
                }
                System.out.print(voltage[i] + ", ");
            }

            int[] room = new int[6];
            room[0] = 15;
            room[1] = 25;
            room[2] = 30;
            room[3] = 33;
            room[4] = 35;
            room[5] = 57;
            for (int i = 0; i <= 5; i++) {
                if (i == room.length - 1) {
                    System.out.println(room[i]);
                    break;
                }
                System.out.print(room[i] + ", ");
            }
        }

        {
            // Третье задание

            System.out.println("\nTask 3\n");
            int[] weights = new int[3];
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;
            for (int i = 2; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(weights[i]);
                    break;
                }
                System.out.print(weights[i] + ", ");

            }
            double[] voltage = {1.57, 7.654, 9.986};
            for (int i = 2; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(voltage[i]);
                    break;
                }
                System.out.print(voltage[i] + ", ");
            }

            int[] room = new int[6];
            room[0] = 15;
            room[1] = 25;
            room[2] = 30;
            room[3] = 33;
            room[4] = 35;
            room[5] = 57;
            for (int i = 5; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(room[i]);
                    break;
                }
                System.out.print(room[i] + ", ");
            }
        }
        {
            // Четвертое задание
            System.out.println("\nTask 4\n");
            int[] weights = new int[3];
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] % 2 == 0) {
                    System.out.print(weights[i] + ", ");

                }else {
                    System.out.print(weights[i] + 1 + ", ");
                }
            }
        }


    }
}