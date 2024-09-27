def factorial(num):
    fact = 1
    if num != 0:
        for i in range(num, 0, -1):
            fact *= i
    return fact