class Solution:

    def encode(self, strs: List[str]) -> str:
        #so we only need to make sure, that you have the correct number
        #each string has a number + a delimeter
        temp = ""
        for x in range(len(strs)):
            temp += str(len(strs[x])) + "," + strs[x]
        
        print(temp)
        return temp


    def decode(self, s: str) -> List[str]:
        words = []
        on_word = False
        word_length = ""
        temp = ""
        index = 1
        for ch in s:
            #have a boolean to see if it should be reading in or taking it as value
            if (not on_word):
                if ch == ",":
                    on_word = True
                    word_length = int(word_length)
                    if(word_length == 0):
                        words.append(temp)
                        on_word = False
                        word_length = ""
                else:
                    word_length += ch
            else:
                if (index != word_length):
                    temp += ch
                    index += 1
                else:
                    temp += ch
                    words.append(temp)
                    temp = ""
                    index = 1
                    on_word = False
                    word_length = ""
        
        return words




                



