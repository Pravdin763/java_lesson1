public class lesson1_1
{
 /*
        5**. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    */

    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}

