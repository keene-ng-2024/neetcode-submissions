class Solution:
    def isValid(self, s: str) -> bool:
        #i want a stack, once i meet the closing i pop it, if empty = win!

        pairings = {"{":"}", "(":")", "[":"]"}
        closers = ["}",")","]"]

        mystack = []

        for ch in s:
            if ch in pairings:
                mystack.append(ch)
            
            elif ch in closers:
                if len(mystack) > 0:
                    if ch != pairings[mystack[-1]]:
                        return False
                    else:
                        mystack.pop()
                else:
                    return False
        
        return len(mystack) == 0

        