import java.util.Arrays;

public class ArrayClearDemo {
     public static void main(String[] args) {
        String[] pallets = {"A123", "B456", "C789", "D012", "E345", "C728", "F308"};
        
        System.out.println() ;
        
        //Print the first element in lowercase before clearing
        System.out.println("First element before clearing: " + pallets[0].toLowerCase());
        //Print the second element in lowercase before clearing
        System.out.println("Second element before clearing: " + pallets[1].toLowerCase());
        //Clear(set to null) the first two elements
        Arrays.fill(pallets, 0, 2, null);
    
        //Check and print the first element after clearing
         if (pallets[0] != null) {
            System.out.println("First element after clearing: " + pallets[0].toLowerCase());    
        } else {
            System.out.println("After:null");
        }
        //Check and print the second element after clearing
        if (pallets[1] != null) {
            System.out.println("Second element after clearing: " + pallets[1].toLowerCase());
        } else {
            System.out.println("After:null");
        }
        //Printing arreay length and contents
        System.out.println("Array length: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("--"+pallet);
        
    }
}
}
    