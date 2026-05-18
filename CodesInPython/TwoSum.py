from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {} #because for every current element we are storing previous element   #val:index
        for i, n in enumerate(nums):
            diff = target - n # calculating the difference between current (n) and target
            if diff in prevMap:   #checking whether the difference is present in the hash or not 
                return [prevMap[diff], i]
            prevMap[n] = i # if don't find solution we update the hashmap
        return
    
if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9

    sol = Solution()

    result = sol.twoSum(nums, target)

    print("Indices of the two numbers such that they add up to target:", result)