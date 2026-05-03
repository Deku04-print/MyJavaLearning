package LEETCODE_Train;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
    int[] tar=new int[2];
    for (int i=0;i<nums.length;i++){
        for (int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};

            }

        }
    }
        return new int[]{-1,-1};

    }




    public static void main(String[] args){
        int[] nums = {2, 11,7, 15};
        int target = 9;

        int[] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }
}
