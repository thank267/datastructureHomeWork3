import java.util.Arrays;
import java.util.Random;

public class MyArray {

    private static final Random random = new Random();

    public static Integer[] getArray(int length) {
        int defect = 1 + random.nextInt(length-1);

        Integer[] arr = new Integer[length];
        arr[0] = 1;
        for (int i = 1; i < length; i++) {
            arr[i] = (i == defect?2:1) + arr[i-1];
        }

        System.out.println(Arrays.toString(arr));

        return arr;

    }


}
