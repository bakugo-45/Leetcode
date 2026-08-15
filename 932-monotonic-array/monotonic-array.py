class Solution(object):
    def isMonotonic(self, nums):
        if len(nums) <= 1:
            return True

        seen = set()
        for i in nums:
            seen.add(i)

        if len(seen) == 1:
            return True

        first = nums[0]
        for i in range(1, len(nums)):
            if nums[i] != first:
                second = nums[i]
                break

        stack = []
        stack.append(nums[0])

        if first > second:
            for i in range(1, len(nums)):
                if nums[i] > stack[-1]:
                    return False
                stack.append(nums[i])
        else:
            for i in range(1, len(nums)):
                if nums[i] < stack[-1]:
                    return False
                stack.append(nums[i])

        return True