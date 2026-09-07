class Solution:
    def maxArea(self, heights: List[int]) -> int:
        #max comes from either the breadth or the length
        #since that is the case, we want to start at either max length(we dk this) or max breadth, which is the length of the array

        left = 0
        right = len(heights) -1
        max = 0

        #we want to converge until the right and left meet

        while(left != right):
            temp_max = min(heights[left], heights[right]) * (right - left)
            if (temp_max > max):
                max = temp_max
            
            if(heights[left] >= heights[right]):
                right -= 1
            else:
                left += 1
        

        return max



        