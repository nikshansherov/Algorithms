
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 12, 9, 5, 6, 10, 1213, -7, 100};
        HeapSort hs = new HeapSort();
        System.out.println("Первоначальный массив:");
        hs.printArray(arr);
        hs.sort(arr);
        System.out.println("Отсортированный массив:");
        hs.printArray(arr);
    }
}
