# para is a sequence of space-separated words. All words will be in lower case. There will be a single space between consecutive words. The string has no other special characters other than the space.
#
# Write a function named exact_count that accepts the string para and a positive integer nn as arguments. You have to return True if there is at least one word in para that occurs exactly nn times, and False otherwise.
#
# You do not have to accept input from the user or print output to the console. You just have to write the function definition.

def exact_count(para, n):
    Dee = dict()
    for word in para.split(' '):

        if word not in Dee:
            Dee[word] = 0
        Dee[word] += 1

    for word in Dee:
        if Dee[word] == n:
            return True

    return False


para = 'good word many good works good real choice'
n = 3
print(exact_count(para, n))
