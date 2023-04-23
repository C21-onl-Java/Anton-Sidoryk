package teachmeskills.homework5;

public class Task3 {
    public static void main(String[] args) {
//        Умножение двух матриц
//        Создайте два массива целых чисел размером 3х3 (две матрицы).
//                Напишите программу для умножения двух матриц.
//                Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//        Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//        Ожидаемый результат: 1 2 3 1 1 1 0 0 0

        int[][] firstArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondArray = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        //it looks like a mistake in the task cause the sizes of the first and second arrays are different
        // So i decided to create a new array depends on the size of the secondArray

        int[][] newArray = new int[firstArray.length][secondArray[0].length];

        //now when we have new array with 3x3 size I can multiply the matrices and decided to use foreach
        int x = 0;
        for (int[] arrayRow1 : firstArray) {
            int j = 0;
            for (int y = 0; y < secondArray[0].length; y++) {
                int sum = 0;
                for (int[] arrayRow2 : secondArray) {
                    sum += arrayRow1[j] * arrayRow2[y];
                    j++;
                }
                j = 0;
                newArray[x][y] = sum;
            }
            x++;
        }

        for (int[] row : newArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        }
    }
}
