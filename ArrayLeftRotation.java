public class ArrayLeftRotation {

    public static int[] rotateLeft(int[] a, int d){
        int n = a.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {

            int newPosition =(i + n- d)% n;
            rotatedArray[newPosition] = a[i];
            
        }
        return rotatedArray;

<<<<<<< HEAD
    }
=======
    }
>>>>>>> 9b51ad9088a529cbdada925e682af7c812185f65
}