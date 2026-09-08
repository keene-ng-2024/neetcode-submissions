class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded_string = "".join(f"{len(s)}#{s}" for s in strs)
        #print(encoded_string)
        return encoded_string

    def decode(self, s: str) -> List[str]:

        decoded_strs=[]
        
        while len(s)>0:
            l=s.split("#")
            print(l[0])
            decoded_strs.append(s[len(l[0])+1:int(l[0])+len(l[0])+1])

            s = s[int(l[0])+len(l[0])+1:]

            #print(s)
        #print(decoded_strs)
        return decoded_strs


