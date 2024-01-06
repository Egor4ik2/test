package blockMethods;

public class Task5 {
    public int[] getMinMax(int[] arr) {
        if (arr.length == 0) {
            return new int[]{0, 0};
        }
        int[] res = new int[2];
        res[0] = arr[0];
        res[1] = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (res[0] > arr[i]) {
                res[0] = arr[i];
            }
            if (res[1] < arr[i]) {
                res[1] = arr[i];
            }
        }

        return res;
    }
}
