package task_3;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово, которое начинается на букву А");
        String word = scanner.next();
        int i = 0;
        while (i == 0) {
            if (word.startsWith("А")) {
                System.out.println("Спасибо, ваше слово корректно!");
                i++;
            } else {
                System.out.println("Ваше слово начинается не на А, введите слово еще раз:");
                word = scanner.next();
            }
        }
    }
}
