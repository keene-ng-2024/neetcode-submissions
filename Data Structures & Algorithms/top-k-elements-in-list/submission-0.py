class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #im thinking of populating a dict, - > o(N)
        #then making them into tuples -> o(N)
        #sorting them -> nlogn
        #iterate through and give out k 

        db = {}
        for number in nums:
            if number not in db:
                db[number] = 0
            db[number] += 1
        
        counts = []
        for item in db:
            counts.append((db[item],item))
        
        counts.sort(reverse=True)

        answer = []

        for i in range(k):
            answer.append(counts[i][1]) 

        return answer

