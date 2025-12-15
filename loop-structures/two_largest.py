number = 0
largest = number
second_largest = number

for count in range(1,11):
    number = int(input("Enter a number: "))
    
    if number > largest:
        largest = number
    elif number > second_largest and second_largest != largest:
        second_largest = number

print("The largest is", largest)
print("The second largest is", second_largest)
