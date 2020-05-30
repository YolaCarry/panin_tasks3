package task_1;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        while (i < arr.length) {
            arr[i] = ((int) (Math.random() * 100));
            i++;
        }
        System.out.println("Рандомно сгенерированный массив" + "\n" + Arrays.toString(arr));
        i = 0;
        int b2 = arr[0];
        int b = 0;
        while (i < (arr.length - 1)) {
            if (arr[i] < arr[i + 1]){
                b2 = arr[i + 1];
            }
            i++;
            if (b2 > b) {
                b = b2;
            }
        }
        System.out.println("Максимальное число в массиве: " + b);
        i = 0;
        int c2 = arr[i];
        int c = arr[i];
        while (i < (arr.length -1)) {
            if (arr[i + 1] < arr[i]){
                c2 = arr[i + 1];
            }
            i++;
            if (c2 < c) {
                c = c2;
            }
        }
        System.out.println("Минимальное значение в массиве: " + c);
        double d = 0;
        double sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        d = (sum / arr.length);
        System.out.println("Среднее значение элементов массива: " + d);
    }
}
