import math

class Triangle:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def Is_valid(self):
        if a + b > c and a + c > b and b + c > a:
            return 'Valid'
        return 'Invalid'

    def valid(self):
        if a + b > c and a + c > b and b + c > a:
            return True
        return False

    def Side_Classification(self):
        if self.valid():
            if a == b and b == c and c == a:
                return 'Equilateral'
            elif a!=b and b!=c:
                return 'Scalene'
            else:
                return 'Isosceles'
        return 'Invalid'

    def Angle_Classification(self):
        if self.valid():
            if a**2 + b**2 > c**2:
                return 'Acute'
            elif a**2 + b**2 == c:
                return 'Right'
            else:
                return 'Obtuse'
        return 'Invalid'

    def Area(self):
        if self.valid():
            s=(a+b+c)/2
            ar=math.sqrt(s*(s-a)*(s-b)*(s-c))

            return ar
        return 'Invalid'






a = int(input())
b = int(input())
c = int(input())
T = Triangle(a, b, c)
print(T.Is_valid())
print(T.Side_Classification())
print(T.Angle_Classification())
print(T.Area())
