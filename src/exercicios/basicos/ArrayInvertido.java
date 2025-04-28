import java.util.Arrays;

public class ArrayInvertido {
    public static void main(String[] args) {
        
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] arrayInvertido = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - i - 1];
        }

        System.out.println(Arrays.toString(arrayInvertido));
      
    }    
}
