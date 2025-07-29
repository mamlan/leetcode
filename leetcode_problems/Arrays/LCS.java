// 128. Longest Consecutive Sequence (medium)

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=1, max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1) count++;
            if(nums[i]!=nums[i-1]+1) count=1;
            if(count>max) max=count;
        }
        return max;
    }
}

// [100,4,200,1,3,2]
// sorted=[1,2,3,4,100]
// i= count= max=
// i=1 count= max=
// without O(n):
// -sort array and count based on prev and next elements
