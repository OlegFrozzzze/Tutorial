package Tom1;

import java.util.Arrays;

public class TaskNine {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        Arrays.sort(result);
        return result;
    }

    public static int[] mergeArrays2(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int idxOne = 0;
        int idxTwo = 0;

        for (int i = 0; i < result.length; i++) {
            if (idxTwo >= a2.length || idxOne < a1.length && a1[idxOne] < a2[idxTwo]) {
                result[i] = a1[idxOne];
                idxOne++;
            } else {
                result[i] = a2[idxTwo];
                idxTwo++;
            }
        }
        return result;
    }
}
