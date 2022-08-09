package arrays;

public class FirstArrayTask {
    /**
     * Данный метод должен возвращать количество четных чисел в массиве, массив передается в параметрах метода
     * четные числа - это те числа, которые делятся на 2 без остатка
     * @param array массив чисел
     * @return количество четных чисел в массиве
     */

    public static int getCountEvenNumbers(int[] array) {
        int amountResult = 0;
        for (int value: array) {
            if (value % 2 == 0) {
                amountResult++;
            }
        }
        return amountResult;
    }
}
