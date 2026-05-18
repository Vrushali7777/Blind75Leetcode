from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l,r = 0, 1 #left = buy and right = sell
        maxP = 0

        while r < len(prices):
            #profitable or not
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                maxP = max(maxP, profit)
            else:
                l = r
            r += 1
        return maxP
    
if __name__ == "__main__":
    nums = [7,1,5,3,6,4]
    target = 9

    sol = Solution()

    result = sol.maxProfit(nums)

    print("Indices:", result)