public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int n = nums.length;

        for(int i = 0; i < n; i++) {              // first element

            for(int j = 0; j < n; j++) {          // iterated element

                if(i == j) {
                    continue;
                }

                if(nums[i] == nums[j]) {          // skip if same
                    continue;
                }

                for(int k = 0; k < n; k++) {      // second loop inside

                    if(k == i || k == j) {
                        continue;
                    }

                    if(nums[i] + nums[j] + nums[k] == 0) {

                        System.out.println(
                            nums[i] + " " + nums[j] + " " + nums[k]
                        );

                    }
                }
            }
        }
    }
}