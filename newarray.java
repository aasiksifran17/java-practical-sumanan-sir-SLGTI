# Get 5 numbers from the user
numbers = []
while len(numbers) < 5:
    number = input("Enter a number: ")
    if number.isnumeric():
        numbers.append(int(number))
    else:
        print("Invalid input. Please enter a number.")

# Sort the numbers in ascending order
numbers.sort()

# Print the sorted numbers
print("Sorted numbers:")
for number in numbers:
    print(number)