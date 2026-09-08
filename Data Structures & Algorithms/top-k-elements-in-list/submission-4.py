class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #k most frequent,  do we do counts?
        
        mappings = {}
        for num in nums:
            if num not in mappings:
                mappings[num] = 0
            mappings[num] +=1
        
        #okay now we have how frequent each number appear, 
        #so we know that we can iterate through the whole until length of nums to find 
        #so lets make an array instead where the index represents the frequency

        things = []
        for i in range(len(nums)):
            things.append([])
        
        
        for number, frequency in mappings.items():
            things[frequency-1].append(number)
        
        answer = []
        for freq in range(len(nums), 0, -1):
            for num in things[freq - 1]:
                answer.append(num)
                if len(answer) == k:
                    return answer
        



            