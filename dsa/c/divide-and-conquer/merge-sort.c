#include <stdio.h>

void mergeSort(int arr[], int lb, int ub);
void printArray(int arr[], int size);

int main(void)
{
    int arr[] = {10, 50, 30, 20, 40};
    mergeSort(arr, 0, sizeof(arr) / sizeof(int) - 1);
    return 0;
}

void mergeSort(int arr[], int lb, int ub)
{
    printArray(arr, ub + 1);
}

void printArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
}