public class Main {
    // Define the twoSum method outside the main method
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // For each element, loop through the remaining elements
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices as an array
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array (or you could throw an exception)
        return new int[]{};
    }

    // Main method to test the twoSum function
    public static void main(String[] args) {
        Main main = new Main(); // Create an instance of the Main class


        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = main.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");


    }
}