public class main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int rotations = 2;

        int[] rotatedArray = ArrayLeftRotation.rotateLeft(originalArray, rotations);

      
        System.out.println("Original Array:");
        printArray(originalArray);
        System.out.println("\nArray after left rotation by " + rotations + " positions:");
        printArray(rotatedArray);
    }

   
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
