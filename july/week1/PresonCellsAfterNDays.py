class Solution:
    def prisonAfterNDays(self, cells: List[int], N: int) -> List[int]:
        temp = []
        number = N % 14
        number = number if number > 0 else 14
        for i in range(number):
            temp = []
            temp.append(0)
            for i in range(1, 7):
                if(cells[i-1] == cells[i+1]):
                    temp.append(1)
                else:
                    temp.append(0)
            temp.append(0)
            cells = temp
        return temp
                
