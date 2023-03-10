package primi_esercizi;

import java.util.Arrays;
import java.util.Scanner;

public class minimoMassimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        String[] s_split = s.split(",");
        int[] values = new int[s_split.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(s_split[i]);
        }
        return values;
    }

    static void computeMinAndMax(int[] values) {
//        int max = 0;
//        int min = 0;
//        for (int i = 0; i < values.length; i++) {
//            if (min > values[i]) {
//                min = values[i];
//            }
//            if (max < values[i]) {
//                max = values[i];
//            }
//        }
        int temp;
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[j - 1]) {
                    temp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(values));
        System.out.println("Minimo: " + values[0]);
        System.out.println("Massimo: " + values[values.length - 1]);

    }


}
