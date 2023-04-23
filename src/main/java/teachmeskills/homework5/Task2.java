package teachmeskills.homework5;

public class Task2 {
    public static void main(String[] args) {
//        Шахматная доска
//        Создать программу для раскраски шахматной доски с помощью цикла.
//                Создать двумерный массив String'ов 8х8. С помощью циклов задать
//        элементам циклам значения B(Black) или W(White). Результат работы
//        программы:
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
        String[][] array = new String[8][8];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if ((x + y) % 2 == 0) {
                    array[x][y] = "W";
                    System.out.print(array[x][y] + " ");
                } else {
                    array[x][y] = "B";
                    System.out.print(array[x][y] + " ");
                }
            }
            System.out.println();
        }
    }
}
