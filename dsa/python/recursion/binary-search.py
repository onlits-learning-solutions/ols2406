def binarySearch(arr, low, high, val):
    if high < low:
        return -1
    
    mid = (high + low) // 2

    if arr[mid] == val:
        return mid

    if val < arr[mid]:
        return binarySearch(arr, low, mid - 1, val)
    else:
        return binarySearch(arr, mid + 1, high, val)


arr = [5, 19, 20, 31, 57, 65, 73, 88]
high = len(arr) - 1
low = 0
val = int(input("Enter value to search: "))

index = binarySearch(arr, low, high, val)

if index == -1:
    print(f"{val} not found.")
else:
    print(f"{val} found at index {index}.")
