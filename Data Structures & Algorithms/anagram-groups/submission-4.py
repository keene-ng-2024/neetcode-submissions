class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #hmm can i just sort

        answer = []
        mappings = {}

        for string in strs:
            temp_count = [0] * 26
            for ch in string:
                score = ord(ch) - ord("a")
                temp_count[score] += 1
            temp = tuple(temp_count)
            if temp not in mappings:
                mappings[temp] = []
            
            mappings[temp].append(string)


        for item in mappings:
            answer.append(mappings[item])


        return answer
        

            


