import re
#your code goes here
num = str(input())
pattern = "\A(1|8|9)\d{7}$"


if re.match(pattern,num):
    print("Valid")
else:
    print("Invalid")
