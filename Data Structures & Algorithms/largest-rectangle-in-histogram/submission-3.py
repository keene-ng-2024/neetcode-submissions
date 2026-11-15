class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        #the idea is to always keep things ascending in your stack
        #when something comes in that is not larger than you right now you got to pop
        #then right when u pop stuff away, you take the index of the last thing that you popped away

        stack = []
        max_area = 0

        for i in range(len(heights)):
            if len(stack) == 0:
                stack.append((i, heights[i]))
            else:
                #this will probably be a while loop
                removed = False

                while len(stack) > 0 and stack[-1][1] > heights[i]:
                    item = stack.pop()
                    #print(item)
                    max_area = max(max_area, item[1] * (i - item[0]))
                    #print(max_area)
                    removed = True

                if removed:
                    stack.append((item[0], heights[i]))
                else:
                    stack.append((i, heights[i]))
                
        
        while len(stack) > 0:
            item = stack.pop()
            #print(item)
            max_area = max(max_area, item[1] * (len(heights) - item[0]))
            #print(max_area)

        return max_area
            
                    
                

                
                
                
                
        