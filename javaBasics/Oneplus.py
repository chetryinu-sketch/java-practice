digits=[9,9,9] 
carry=1
for i in range(len(digits)-1,-1,-1):
    if digits[i]<9:
        digits[i]+=carry
        carry=0
        break
    else:
        digits[i]=0
        carry=1
if carry==1:       
    digits.insert(0,1)     
print(digits)
