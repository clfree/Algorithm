

# The length and the 
numbers = raw_input().split(" ")

# Convert the string to int

m = int(numbers[0])
n = int(numbers[1])
a = int(numbers[2])

if m%a >0:
    m = m+a
if n%a >0:
    n = n+a

num = (m/a)*(n/a)


print num
