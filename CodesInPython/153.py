from typing import List

class Solution:
    def findMin(self, nums: List[int]) -> int:
        res = nums[0] #setting default result value
        l, r = 0, len(nums) - 1 #left pointer at first element in the array i.e., at index 0 and right pointer at last element in the array.

        while l <= r:
            if nums[l] < nums[r]:   #if the array is already sorted
                res = min(res, nums[l])
                break
            
            m = (l + r) // 2  #if array is sorted but rotated then we will calculate the middle value in the arary
            res = min(res, nums[m])
            if nums[m] >= nums[l]: #if the minimum value is in the right subarray of the middle
                l = m + 1  #shifting left pointer to right of the middle
            else:   #if the minimum value is in the left subarray of the middle
                r = m - 1  #shifting right pointer to the left of the middle
        return res
    
  
if __name__ == "__main__":
    nums = [3,4,5,1,2]

    sol = Solution()

    result = sol.findMin(nums)

    print("Minimun element of this array is:", result)
