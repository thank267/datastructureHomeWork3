public class BinarySearch {
    public static int search(Integer[] arr) {

        if (arr.length==0 || arr.length==1) {
            return 1;
        }

        int start = 0;
        int end = arr.length-1;
        int base;
        boolean cont = true;
        while (end >= start && cont) {

            base = (start + end) / 2;

            if (arr[base] == base +2 ) {
                end = base;
            }
            else {
              if (base + 1 == end) {
                  cont = false;
              }
              else {
                  start = base;
              }
            }
        }

        return arr[start]+1;
    }
}
