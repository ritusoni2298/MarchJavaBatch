/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;

public class Main
{

    private static int removeDuplicates(List<Integer> nums) {
        int n = nums.size();

        /*
         * This index will move only when we modify the array in-place to include a new
         * non-duplicate element.
         */
        List<Integer> s = new ArrayList<>();
        int count=0;
        int j = nums.get(0);
        for(int i=1;i<nums.size();i++){
            if(j!=nums.get(i)){
                s.add(nums.get(i));
            }else{
                count++;
            }
            j = nums.get(i);
        }
        int ans=s.size();
        for(int i=0;i<count;i++)
            s.add(0);

//        int j=0;
//        int count=0;
//        for(int i=1;i<nums.size();i++){
//            System.out.println(nums.get(j) +" "+nums.get(i));
//            if(nums.get(j)==nums.get(i)){
//                nums.remove(i);
//                i=i-1;
//                count++;
//                System.out.println(nums+"1");
//            }else {
//                j = i;
//            }
//            System.out.println(nums+"2");
//        }


//        for (int i = 0; i < n; i++) {
//            /*
//             * If the current element is equal to the next element, then skip the current
//             * element because it's a duplicate.
//             */
//            if (i < n - 1 && nums.get(i) == nums.get(i+1)) {
//                continue;
//            }
//
//            nums.add(nums.get(i),j++);
//        }
        System.out.println(nums);

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 3, 5, 5, 7 };
        List<Integer> ab = new ArrayList<>();
        ab.addAll(Arrays.asList(2,3,14,14,14,18,18,18,111,111,111,111));
        int newLength = removeDuplicates(ab);
    }
}

