#!/bin/bash

# Prompt the user to enter Ramesh's basic salary
echo "Enter Ramesh's basic salary:"
read basic_salary

# Calculate dearness allowance (40% of basic salary)
da=$(echo "scale=2; $basic_salary * 0.40" | bc)

# Calculate house rent allowance (20% of basic salary)
hra=$(echo "scale=2; $basic_salary * 0.20" | bc)

# Calculate gross salary
gross_salary=$(echo "scale=2; $basic_salary + $da + $hra" | bc)

# Display the results
echo "Basic Salary: $basic_salary"
echo "Dearness Allowance (40%): $da"
echo "House Rent Allowance (20%): $hra"
echo "Gross Salary: $gross_salary"