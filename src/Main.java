import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt(); scanner.close();
    int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100*Math.random());
        }

        System.out.println("Прямой вывод массива:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Обратный вывод массива:");
        for (int i = arr.length - 1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0]; int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i]; // Находит минимальный элемент
            if(arr[i] > max) max = arr[i]; // Находит максимальный элемент
        }
        int indMax = 0; int indMin = 0; int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max) indMax = i; // Индекс максимального элемента
            if(arr[i] == min) indMin = i; // Индекс минимального элемента
            if(arr[i] == 0) count++; // Количество нулевых элементов
        }

        int[] arrCopy = new int[k];  int t;
        arrCopy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arrCopy.length/2; i++) {   // Замена элементов
            t = arrCopy[i];
            arrCopy[i] = arrCopy[arr.length - 1 - i];
            arrCopy[arr.length - 1 - i] = t;
        }

        System.out.println("Минимальный элемент массива равен " + min);
        System.out.println("Индекс минимального элемента равен " + indMin);

        System.out.println("Максимальный элемент массива равен " + max);
        System.out.println("Индекс максимального элемента равен " + indMax);      // Вывод результатов программы

        if(count == 0) System.out.println("Нулевые элементы отсутствуют");
        else System.out.println("Количество нулевых элементов равно " + count);

        System.out.println("Изменный массив после замены элементов имеет вид: ");
        System.out.println(Arrays.toString(arrCopy));

        int count2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= arr[i+1]) {
                System.out.println("Исходный массив не является возрастающей последовательностью");  // Проверка на возрастание
                break;
            }
            else count2++;
        }
        if(count2 == arr.length) System.out.println("Исходный массив является возрастающей последовательностью");

        // Задачка со звездочкой

        String[] number = new String[]{"9", "9", "9"};
        String str = String.join("", number);
        int k1 = Integer.parseInt(str); k1+=1;
        String s = Integer.toString(k1);
        int[] arr2 = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr2[i] = k1 % 10;
            k1 /= 10;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
