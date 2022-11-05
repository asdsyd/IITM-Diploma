# A sequence of integers of even length is said to be left-heavy if the sum of the terms in the left-half of the sequence is greater than the sum of the terms in the right half. It is termed right-heavy if the sum of the second half is greater than the first half. It is said to be balanced if both the sums are equal.
#
# Accept a sequence of comma-separated integers as input. Determine if the sequence is left-heavy, right-heavy or balanced and print this as the output.

seq = list(input().split(','))
list = [int(x) for x in seq]
lsum = 0
rsum = 0

mid = int(len(list)/2)


for x in range(mid):
    lsum += list[x]

for x in range(mid,len(list)):
    rsum += list[x]

if(lsum == rsum):
    print('Balanced')
elif(lsum > rsum):
    print('Left heavy')
elif(lsum < rsum):
    print('Right heavy')



