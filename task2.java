// Пусть дан произвольный список целых чисел, удалить из него чётные числа.


public class task2 {
    public static void main(String[] args) {
        int[] arrayList = {1, 2, 3, 4, 5};
        printArray("Данн список:", arrayList);
 
        arrayList = deleteEvenElement(arrayList);
        printArray("Результат:", arrayList);
 
    }
 
    public static void printArray(String text, int[] array) {
        System.out.print(text + " [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
 
    public static int[] deleteEvenElement(int[] array) {
        int[] result = new int[array.length / 2];
        int i, j;
        for (i = 0, j = 1; j < array.length; i++, j += 2) {
            result[i] = array[j];
        }
        return result;
    }
}

