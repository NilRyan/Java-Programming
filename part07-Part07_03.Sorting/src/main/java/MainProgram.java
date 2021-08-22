
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }

        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }

        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;

        for (int i = startIndex + 1; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }

        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        int b = array[index2];
        
        array[index1] = b;
        array[index2] = a;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, index);
            System.out.println(array.toString());
        }
    }

}
