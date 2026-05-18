from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set() #creating a hashset using sets in python

        for n in nums:  #itertaing through whole array
            if n in hashset: #checking if the current value of the array exixts in the hashset or not
                return True #if yes then returns true and terminates the loop
            hashset.add(n) #if value doesnot exist in the hashset then add that unique value to the hashset
        return False #if not value is duplicate at the end of the array then return false stating that all elements are unique
    
  
if __name__ == "__main__":
    nums = [1,2,3,1]
    target = 9

    sol = Solution()

    result = sol.containsDuplicate(nums)

    print("Does the list contain duplicates? ", result)
        