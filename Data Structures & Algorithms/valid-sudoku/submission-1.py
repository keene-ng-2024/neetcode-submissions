class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        #return true if sudoku board is valid

        #for it to be valid, the row must have no dupes
        #the col must have no dupes
        #the box must have no dupes, but the boxes are already pre defined
        #i really think its a map of everything hardcoded
        #map of the 9 boxes
        #map of each row
        #map of each col, then its just a one to one match for all

        columns = [set() for i in range(9)]
        rows = [set() for i in range(9)]
        boxes = [[set() for i in range(3)] for i in range(3)]

        for y in range(9):
            for x in range(9):
                value = board[y][x]
                #y > columns
                #x > rows
                #yx > box
                if value.isdigit():

                    if(value in columns[x]):
                        return False
                    else:
                        columns[x].add(value)
                    
                    if(value in rows[y]):
                        return False
                    else:
                        rows[y].add(value)
                    
                    if(value in boxes[y//3][x//3]):
                        #print("here" + str(x) + str(y) + str(value))
                        return False
                    else:
                        boxes[y//3][x//3].add(value)
        

        return True
                
                


        

        return True
        
        
        
