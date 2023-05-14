package teachmeskills.homework4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
//        Создайте массив строк. Заполните его произвольными именами
//        людей.
//                Отсортируйте массив.
//                Результат выведите на консоль.

        String[] array = {"Zhe", "Carina", "Anton", "Sapna", "Aaron"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("New array " + Arrays.toString(array));
    }
}
