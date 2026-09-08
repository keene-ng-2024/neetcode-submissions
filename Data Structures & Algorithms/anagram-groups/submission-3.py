class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #hmm can i just sort

        answer = []
        mappings = {}

        for string in strs:
            temp = "".join(sorted(string))
            if temp not in mappings:
                mappings[temp] = []
            
            mappings[temp].append(string)


        for item in mappings:
            answer.append(mappings[item])


        return answer
        

            


