# Multiple Exceptions

You need to write a divider program which will operate with integers,

The program you are given should take two integers as input and execute the division, but we need to handle two exceptions:

1. the divider shouldn't be zero

2. both inputs should be integers.

Complete the program to handle them. For the first exception, the program should output "Еrror: division by zero"; and for the second one, "Error: wrong value type".

## Sample Input

1

b

## Sample Output

Error: wrong value type

Use ArithmeticException for first exception and InputMismatchException for the second one.
