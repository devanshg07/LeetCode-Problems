class Solution(object):
    def myPow(self, x, n):
        
        if n == 0:
            return 1
    
        elif n % 1 == 0 and -100 < x < 100 and x != 0 and n > 0:
            xn = x ** n
            if -10000 <= xn <= 10000:
                return xn
            else:
                return False
        
        else:
            return x ** n
