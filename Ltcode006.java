import java.util.Arrays;

public class LeetCode006 {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int duplicates = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k - 1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            } else {
                duplicates++;
            }
        }

        return k;
    }

    public static String[] processArray(int[] nums) {
        int uniqueCount = removeDuplicates(nums);
        String[] output = new String[nums.length];

        for (int i = 0; i < uniqueCount; i++) {
            output[i] = Integer.toString(nums[i]);
        }

        for (int i = uniqueCount; i < nums.length; i++) {
            output[i] = "_";
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2 };
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println("Case 1:");
        String[] result1 = processArray(nums1);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result1));

        System.out.println("\nCase 2:");
        String[] result2 = processArray(nums2);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result2));
    }
}