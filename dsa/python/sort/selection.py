arr = [93,5,67,21,51]

for i in range(len(arr)-1):
    for j in range(i+1, len(arr)):
        if(arr[i] > arr[j]):
            t = arr[i]
            arr[i] = arr[j]
            arr[j] = t

print("The sorted array is:")
for i in arr:
    print (i)

# Worst time complexity: O(n^2)
# Worst space complexity: O(1)