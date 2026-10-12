"""Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 """

# n= int(input("Enter num:"))
# i=1
# # while i<=n:
# #     print(i)
# #     i+=1

# l=[i if i<=n else negative num for i in range(1,n+1) ]
# print(l)


n=10
count=0
for i in range(2,n):
    for j in range(2,i):
        if i%j==0:
            break
    else:
        count+=1
print(count)
           