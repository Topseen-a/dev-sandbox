number = 0
largest = number

for count in range(1,11):
    number = int(input("Enter a number: "))
    
    if number > largest:
        largest = number

print("The largest is", largest)
