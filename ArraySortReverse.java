import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[]args){
        String[] pallets= {"A123", "B456", "C789", "D012", "E345","C728","F308"};
       
        System.out.println("Sorted....");
        Arrays.sort(pallets);
        for(String pallet:pallets){
            System.out.println("--"+ pallet);
        }
        System.out.println("\nReverse Sorted....");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for(String pallet:palletList){
            System.out.println("--"+ pallet);
        }
    }    
}
