//  169. Majority Element (easy)

class Solution {
    /**
        [3,2,3]
        i=0 cand=3, res=0;
     */
    public int majorityElement(int[] nums) {
        int cand=-1, res=0;

        for(int i=0;i<nums.length;i++){
            if(res==0) {
                cand=nums[i];
                res++;
            }else{
                if(cand==nums[i]) res++;
                else res--;
            }
        }
        return cand;
    }
}

// ds: hashmap -> key: element, val: occurrences
// plan:
// 1. iterate thru array
// 2. for each element, update its occurrence in hashmap
// 3. within each iteration, check if el has appeared more than half n/2 times

// [3,2,3]
// i         hash
// 0           [3,1]
// 1           [3,1], [2,1]
// 2           [3,2], [2,1]

// goal: find in linear time and O(1) space -> without sorting and no ds
// -> search thru array and find answer from there
// we use moores voting algorithm
// moore’s voting algo- used to find majority element in array IF its already confirmed majority lament (element that appears more than n/2 times in array) already exists
// intuition: 
// two variables: res=0, candidate=-1
// for loop:
// if res==0, candidate=nums[i], res=1
// else: (if candidate==nums[i], res++, 	else res--)
