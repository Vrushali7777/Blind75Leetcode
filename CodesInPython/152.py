from typing import List

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)  #we set it to maximun value for now in the input array, we can'e just initialize this to 0
        curMin, curMax = 1,1

        for n in nums:
             #we don't want 0 if encountered in the input arary in the product and mess up our current min and max
            if n == 0:  
                curMin, curMax = 1,1   
                continue
            tmp = curMax * n  # to keep the track of curMax and curMin
            curMax = max(n * curMax, n * curMin, n)
            curMin = min(tmp, n * curMin, n)
            res = max(res, curMax, curMin)
        return res

  
if __name__ == "__main__":
    nums = [2,3,-2,4]

    sol = Solution()

    result = sol.maxProduct(nums)

    print(result, "is the largest product.")     