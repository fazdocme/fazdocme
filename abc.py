# Function to calculate the sum of two numbers
def sum_of_two_numbers(num1, num2):
    return num1 + num2

# Read first number
number1 = float(input("Enter the first number: "))

# Read second number
number2 = float(input("Enter the second number: "))

# Calculate the sum
result = sum_of_two_numbers(number1, number2)

# Print the result
print(f"The sum of {number1} and {number2} is {result}")
