package hw2;
//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.

public class Main {
    public static void main(String[] args) {
        try {
            int total = checkArray(arr);
            System.out.println("total: " + total);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int checkArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Wrong size of the array!");
        }
        for (int i = 0; i < arr.length; ) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Wrong size of the array!");
            } else
                //System.out.println(arr[i].length);
                i++;
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                int j;
                try {
                    j = Integer.parseInt(arr[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Incorrect data format at array cell" + i + ":" + k );
                }
                total += j;
            }

        }
        return total;

    }

    public static String[][] arr = {
            {"1", "4", "5", "0"},
            {"1", "4", "5", "1"},
            {"1", "2", "1", "5"},
            {"1", "10", "1", "5"},
            //{"1","24", "5"},
            // {"1","14", "5", "56"},
            //{"1","4", "5"},
    };


}

