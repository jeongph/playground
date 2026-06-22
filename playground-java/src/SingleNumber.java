public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single;
        int i = 0;

        do {
            single = nums[i];
            ++i;
        } while (i < nums.length);

        return single;
    }
}
