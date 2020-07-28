class Solution:
    def addDigits(self, num: int) -> int:
        while(len(str(num)) != 1):
            strNum = str(num)
            arrNum = [int(x) for x in strNum]
            num = sum(arrNum)
        return num
        
