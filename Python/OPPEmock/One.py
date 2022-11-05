# A data entry operator has a faulty keyboard. The keys 00 and 11 are very unreliable. Sometimes they work, sometimes they don't. While entering phone numbers into a database, the operator uses the letter 'l' as a replacement for 11 and 'o' as a replacement for 00 whenever these binary digits let him down. Both 'l' and 'o' are in lower case. 'l' is the first letter of the word 'land', and not capital 'i'.
#
# Accept a ten-digit number as input. Find the number of places where the numbers 00 and 11 have been replaced by letters. If there are no such replacements, print the string No mistakes. If not, print the number of mistakes (replacements) and in the next line, print the correct phone number.

p = input()
count = 0

for x in p:
    if (x == 'o'):
        count+=1

    if(x == 'l'):
        count+=1
if(count == 0):
    print("No Mistakes")
else:
    print(f"No of mistakes: {count}")
    p = p.replace('o','0')
    p = p.replace('l','1')
print(p)