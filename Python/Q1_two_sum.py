class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        store = {}
        for number in range(len(nums)):
            temp = target - nums[number]
            if nums[number] in store:
                return [store[nums[number]],number]
            else:
                store[temp] = number