class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #k most frequent,  do we do counts?
        
        mappings = {}
        for num in nums:
            if num not in mappings:
                mappings[num] = 0
            mappings[num] +=1
        
        things = []
        for item in mappings:
            things.append((mappings[item], item))
        
        things.sort()

        answer = []
        
        for x in range(k):
            index = len(things) -1 -x
            answer.append(things[index][1])
        
        return answer


            