import java.util.Random;

public class ArrayChallenge2 {
    public static void main(String[] args) {
       Random random = new Random();
       String[]orderIDs= new String[10];
        // Random letter from A to Z
      for(int i=0; i< orderIDs.length; i++) {
       char prefix= (char)(random.nextInt(26) + 'A');
        int randomNumber = random.nextInt( 999)+1;
        String suffix= String.format("%03d", randomNumber);

        orderIDs[i] = prefix + suffix;
      }

    for(String orderID: orderIDs) {
        System.out.println(orderID);
    }
}
}
