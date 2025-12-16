length_of_base = int(input("Enter the length of base between (1-10): "))

while length_of_base < 1 or length_of_base > 10:
    length_of_base = int(input("Enter the length of base between (1-10): "))

for index in range(1,length_of_base +1):
    for count in range(1,index +1):
        print("*", end="")
    print()

