public class array1 {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 1; i < n; i++) { // sorted
            if (nums[i] < nums[i - 1]) {
                c++;
            }
        }
        if (c > 1)
            return false;

        return true;

    }
    public static void main(String[] args) {
        check();
    }
}
