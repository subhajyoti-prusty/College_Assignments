#!/bin/bash

# Prompt the user to enter the first number
echo "Enter the first number:"
read num1

# Prompt the user to enter the second number
echo "Enter the second number:"
read num2

# Perform arithmetic operations
echo "Results of arithmetic operations on $num1 and $num2:"

# Addition
sum=$((num1 + num2))
echo "Addition: $num1 + $num2 = $sum"

# Subtraction
diff=$((num1 - num2))
echo "Subtraction: $num1 - $num2 = $diff"

# Multiplication
prod=$((num1 * num2))
echo "Multiplication: $num1 * $num2 = $prod"

# Division (only if the second number is not zero)
if [ $num2 -ne 0 ]; then
    div=$((num1 / num2))
    echo "Division: $num1 / $num2 = $div"
else
    echo "Division: Cannot divide by zero"
fi

# Modulo (remainder of the division)
if [ $num2 -ne 0 ]; then
    mod=$((num1 % num2))
    echo "Modulo: $num1 % $num2 = $mod"
else
    echo "Modulo: Cannot perform modulo operation with zero"
fi

