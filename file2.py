# Python script to print the first 100 odd numbers from 1 to 200

# Function to print odd numbers
def print_odd_numbers():
    count = 0
    for num in range(1, 201):
        if num % 2 != 0:
            print(num)
            count += 1
            if count == 100:
                break

# Call the function
print_odd_numbers()
