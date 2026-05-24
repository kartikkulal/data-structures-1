

public class Heap{

    public static void main(String[] args) {

        int[] arr = {1,7,9,8,4,6,3};

        buildheap(arr, arr.length);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void heapify(int[] arr, int i, int n) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
        }
    }

    private static void buildheap(int[] arr, int n) {

        // build max heap
        for(int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // heap sort
        for(int i = n - 1; i >= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
}