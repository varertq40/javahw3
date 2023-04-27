// Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;

public class task1 {
    public static int[] mergeSprt(int[] sortArr){
        int[] buf1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buf2 = new int[sortArr.length];
        int[] result = mergeSortInner(buf1, buf2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buf1, int[] buf2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buf1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buf1, buf2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buf1, buf2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buf1 ? buf2 : buf1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];

        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        int[] result = mergeSprt(sortArr);
        System.out.println(Arrays.toString(result));
    }
}