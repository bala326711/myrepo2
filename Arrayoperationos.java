import java.util.Scanner;
class ArrayOperations {
    public static int binarySearch(int arr[], int target) {
        int l = 0;
        int u = arr.length - 1;
        while (l <= u) {
            int mid = l + (u - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }
        return -1;
    }
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 4;
        int linearResult = linearSearch(arr, target);
        if (linearResult == -1) {
            System.out.println("Element is not found in the array (Linear Search).");
        } else {
            System.out.println("Linear Search: Element found at index " + linearResult);
        }
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int binaryResult = binarySearch(arr, target);
        if (binaryResult == -1) {
            System.out.println("Element is not found in the array (Binary Search).");
        } else {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        }

        sc.close();
    }
}
