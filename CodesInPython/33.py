from typing import List
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) - 1

        # imagine we are given an array with just one value in this case l = r, still we have to check that one value whether it is the target we want or not
        while l <= r:
            mid = (l + r) // 2
            if target == nums[mid]: # if the mid is only the target we are searching for exactly then return mid
                return mid
            
            #for left sorted array
            # because its possible that middle and left values are the same
            if nums[l] <= nums[mid]:
                if target > nums[mid] or target < nums[l]: #if target is greater than middle then we will search right or if target is less than the left most value then we have to search right
                    l = mid + 1 #search right
                else: #that is target is less than the middle but greater than left then we search to the left of the middle
                    r = mid - 1 #search left
            # if we are in the right sorted portion of the array
            else:
                if target < nums[mid] or target > nums[r]:
                    r = mid - 1 #search left
                else:
                    l = mid + 1 #search right

        return -1

if __name__ == "__main__":
    nums = [4,5,6,7,0,1,2]
    target = 9

    sol = Solution()

    result = sol.search(nums, 0)

    print("Indices:", result)

        
        