class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        res = [] #need to return the arary of 3 solutions as a solution set
        nums.sort() #next we will sort the array (ascending order)

        for i, a in enumerate(nums):
            #i.e., we don't want to use the first value in the array again and we also don't want to use the previous value also ie., nums[i - 1] that is value before the value at the current index i
            if i > 0 and a == nums[i - 1]: 
                continue #if we encounter those values we won't use them again and will continue to next iterations
            # next we will use two pointer solution to solve the rest array using the logic of two sum II
            l, r = i + 1, len(nums) - 1

            # l and r cannoot be equal as we need to two numbers and if l = r then it will one number only
            while l < r: 
                threeSum = a + nums[l] +  nums[r]
                # as our array is sorted 
                if threeSum > 0:
                    r -= 1  #then right pointer moves to left
                elif threeSum < 0:
                    l += 1  #then left pointer moves to right
                else:  # that is sum = 0 then we will add a, the number at left pointer and right pointer in the final solution list
                    res.append([a, nums[l], nums[r]])
                    l += 1  #why?
                    while nums[l] == nums[l - 1] and l < r:  #why?
                        l += 1  #why?
        return res
  
if __name__ == "__main__":
    nums = [-1,0,1,2,-1,-4]
    target = 9

    sol = Solution()

    result = sol.threeSum(nums)

    print("The triplets are:", result)



        