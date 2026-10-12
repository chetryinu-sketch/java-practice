# nums = [0, 1, 0, 3, 12]
# count = 0
# for i in range(len(nums)):
#     if nums[i] == 0:
#         count += 1
# for _ in range(count):
#     nums.remove(0)
#     nums.append(0)
# print(nums)

# nums = [0, 1, 0, 3, 12]
# unoccupied=0
# searcher=0

# while unoccupied<len(nums):
#     if unoccupied!=0:
        

nums = [0, 1, 0, 3, 12]

k = 0

for i in range(len(nums)):
    if nums[i] != 0:
        nums[k], nums[i] = nums[i], nums[k]
        k += 1

print(nums)