from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSub = nums[0]  # we are initilaizing maxSubarray first element to be first element of nums/ input array, because we have to initialize this with something as we cannot initialize this as zero because we also have negative values in the array(input)
        curSum = 0

        for n in nums:
            #if we have negative prefix (negative prefix sum) we will remove/ignore it that is we will set curSum = 0 again
            if curSum < 0:
                curSum = 0
            curSum += n  # this will make sure we are always computing the maximum sum we can
            maxSub = max(maxSub, curSum)
        return maxSub
        

if __name__ == "__main__":
    nums = [-2,1,-3,4,-1,2,1,-5,4]
    target = 9

    sol = Solution()

    result = sol.maxSubArray(nums)

    print("Indices:", result)