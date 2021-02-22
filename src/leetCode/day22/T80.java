package leetCode.day22;

/**
 * @author liqiqi_tql
 * @date 2021/2/22 -15:51
 */
public class T80 {
    class Solution {

        public int[] remElement(int[] arr, int index) {

            //
            // Overwrite the element at the given index by
            // moving all the elements to the right of the
            // index, one position to the left.
            //
            for (int i = index + 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            return arr;
        }

        public int removeDuplicates(int[] nums) {

            // Initialize the counter and the array index.
            int i = 1, count = 1, length = nums.length;

            //
            // Start from the second element of the array and process
            // elements one by one.
            //
            while (i < length) {

                //
                // If the current element is a duplicate,
                // increment the count.
                //
                if (nums[i] == nums[i - 1]) {

                    count++;

                    //
                    // If the count is more than 2, this is an unwanted duplicate element
                    // and hence we remove it from the array.
                    //
                    if (count > 2) {

                        this.remElement(nums, i);

                        //
                        // Note that we have to decrement the array index value to
                        // keep it consistent with the size of the array.
                        //
                        i--;

                        //
                        // Since we have a fixed size array and we can't actually
                        // remove an element, we reduce the length of the array as
                        // well.
                        //
                        length--;
                    }
                } else {

                    //
                    // Reset the count since we encountered a different element
                    // than the previous one.
                    //
                    count = 1;
                }

                // Move on to the next element in the array
                i++;
            }

            return length;
        }
    }
}
