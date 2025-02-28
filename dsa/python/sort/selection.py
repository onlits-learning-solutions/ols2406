arr = [93, 5, 67, 21, 51]

for i in range(len(arr) - 1):
    minimum = i
    for j in range(i + 1, len(arr)):
        if arr[minimum] > arr[j]:
            minimum = j

    t = arr[i]
    arr[i] = arr[minimum]
    arr[minimum] = t

print("The sorted array is:")
for i in arr:
    print(i)

# Worst time complexity: O(n^2)
# Worst space complexity: O(1)
