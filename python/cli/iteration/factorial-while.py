n = int(input("Enter a number: "))
i = n
fact = 1
while(i>1):
    fact *= i
    i -= 1
print(fact)