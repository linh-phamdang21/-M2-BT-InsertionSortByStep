public class InsertionSortByStep {
    static int[] list = {19,3,5,-2,0,10,7,3,11};

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;

            System.out.println("\nList after the " + i + " sort: ");
            for (int element : list) {
                System.out.print(element + " ");
            }
        }
        System.out.println("\nList after sort processing: ");
        for (int element : list) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Your input list: ");
        for (int element : list) {
            System.out.print(element + " ");
        }
        insertionSort(list);
    }
}
