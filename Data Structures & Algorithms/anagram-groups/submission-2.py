class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        db = {}
        
        for string in strs:
            sortedString = "".join(sorted(string))
            if sortedString not in db:
                db[sortedString] = []
            db[sortedString].append(string)

        answer = []
        for key in db:
            answer.append(db[key])
        return answer
        
