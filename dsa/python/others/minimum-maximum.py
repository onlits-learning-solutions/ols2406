def minMax(arr):
    result = {"minimum": arr[0], "maximum": arr[0]}

    for i in arr:
        if i < result.get("minimum"):
            result.update({"minimum": i})
        if i > result.get("maximum"):
            result.update({"maximum": i})
    return result

arr = [48, 5, 99, 63, 12]
result = minMax(arr)
print(f"minimum: {result.get('minimum')}")
print(f"maximum: {result.get('maximum')}")

# Time complexity: O(n)
# Space complexity: O(1)
