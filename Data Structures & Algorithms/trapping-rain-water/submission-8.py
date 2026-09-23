class Solution:
    def trap(self, height: List[int]) -> int:
        #we will close in on da things, so we will maintain a max left and max right, we know that at our pointers
        #they will either know their max left already or max right. 
        #so the one that we know for sure is lower than the other side will be our point of reference
        max_left = 0
        max_right = 0
        left = 0
        right = len(height) - 1
        water_collected = 0

        while(left <= right):
            #handle the case where the max left is smaller than the max right
            if(max_left < max_right):
                #at my left pointer, i know that the water collected, is bottleneck by its left side,
                #which also means max_left is the ceiling for our point @ left pointer
                water_collected += max(0, (max_left - height[left]))
                max_left = max(max_left, height[left])
                left += 1
            
            else:
                #this is the opposite
                water_collected += max(0, (max_right - height[right]))
                max_right = max(max_right, height[right])
                right -= 1
        
        return water_collected


            