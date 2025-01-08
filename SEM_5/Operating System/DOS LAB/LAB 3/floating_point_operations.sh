#!/bin/bash

# Prompt the user to enter the first number (floating point)
echo "Enter the first number (floating point):"
read num1

# Prompt the user to enter the second number (floating point)
echo "Enter the second number (floating point):"
read num2

# Perform floating point arithmetic using bc

# Addition
sum=$(echo "$num1 + $num2" | bc)
echo "Addition: $num1 + $num2 = $sum"

# Subtraction
diff=$(echo "$num1 - $num2" | bc)
echo "Subtraction: $num1 - $num2 = $diff"

# Multiplication
prod=$(echo "$num1 * $num2" | bc)
echo "Multiplication: $num1 * $num2 = $prod"

# Division (with a check to avoid division by zero)
if [ $(echo "$num2 == 0" | bc) -eq 1 ]; then
    echo "Division: Cannot divide by zero"
else
    div=$(echo "scale=2; $num1 / $num2" | bc)
    echo "Division: $num1 / $num2 = $div"
fi

