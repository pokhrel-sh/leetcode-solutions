class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (x in nums.indices){
            for(y in nums.indices){
                if (x != y){
                    if(nums[x] + nums[y] == target) {
                        return intArrayOf(x, y)
                    }
                }
            }
        }
        return intArrayOf()
    }
}