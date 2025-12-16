digit = int(input("Enter a five digit integer: "))

while True:
    if digit >= 10000 and digit <= 99999:
        break;
    else:
        digit = int(input("Enter a five digit integer: "))

digit_one = (digit / 10000) % 10
digit_two = (digit / 1000) % 10
digit_three = (digit / 100) % 10
digit_four = (digit / 10) % 10
digit_five = digit % 10

if digit_one == digit_five and digit_two == digit_four:
    print("It is a palindrome")
else:
    print("It is not a palindrome")
