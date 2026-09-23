class Solution:
    def trap(self, height: List[int]) -> int:
        #build 2 dicts of max lefts and max rights @ each index
        max_left = 0
        max_right = 0

        lefts = {}
        rights = {}

        for i in range(len(height)):
            #we record for that specific index, what the max left is first
            #then we check if it will result in a new max left for the proceeding ones
            lefts[i] = max_left
            max_left = max(max_left, height[i])

            rights[len(height) - i -1] = max_right 
            max_right = max(max_right, height[len(height)- i - 1])
        
        #print(rights)
        #print(lefts)
        
        water_collected = 0

        for index in range(len(height)):
            left = lefts[index]
            right = rights[index]

            diff = min(left,right) 
            if(diff != 0 and height[index] < diff):
                water_collected += diff - height[index]
            #print(water_collected)
        
        return water_collected

        


            