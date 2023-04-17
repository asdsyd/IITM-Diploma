# here
def is_prime(n):
    for i in range(2,n):
        if n%i == 0:
            return False
    return True

def Twin_Primes(n,m):
    t = []
    if n == 1:
        n += 1
    for i in range(n, m):
        j=i+2
        if (is_prime(i) and is_prime(j)):
            t += [(i,j)]
    return t
            



n=int(input())
m=int(input())
print(sorted(Twin_Primes(n, m)))