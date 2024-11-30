arr = [5, 19, 20, 31, 57, 65, 73, 88]

high = len(arr) - 1
low = 0

val = int(input("Enter value to search: "))

i = 0

while low <= high:
    i = i + 1
    mid = (high + low) // 2
    if arr[mid] == val:
        print(f"{val} found at index {mid}.")
        break
    if val < arr[mid]:
        high = mid - 1
    else:
        low = mid + 1

print(f"No of iterations: {i}")
