nums = [23, 56, 89, 11, 3]
status = False
searchValue = int(input("Enter value to search: "))

for i in range(len(nums)):
    if nums[i] == searchValue:
        print(f"{searchValue} found at index {i}.")
        status = True
        break

if status is False:
    print(f"{searchValue} not found.")

print(f"The loop executed {i+1} times.")
