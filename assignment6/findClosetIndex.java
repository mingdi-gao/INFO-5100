public class findClosetIndex {
    public static void main(String[] args) {
        int[] testArray1 = {1, 3, 3, 4};
        int[] testArray2 = {0, 1, 5};

        System.out.println(findClosetIndex(testArray1, 2));
        System.out.println(findClosetIndex(testArray2, 7));

        // test for exception
        // System.out.println(findClosetIndex(null, 2));
        // int[] testArray3 = new int[0];
        // System.out.println(findClosetIndex(testArray3, 4));
    }

    public static int findClosetIndex(int[] arr, int target) {
        try {
            if (arr == null || arr.length == 0) {
                throw new Exception("Invalid Array");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid;
            } else{
                start = mid;
            }
        }
        if (target - arr[start] < arr[end] - target) {
            return start;
        } else {
            return end;
        }
    }
}
