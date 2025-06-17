public class ArrayChallenge1 {
    public static void main(String[] args) {
        String[] orderIds= {"A123", "B456", "C789", "D012", "E345","C728","F308"};
        for(String item: orderIds) {
            if(item.startsWith("C")) {
                System.out.println(item);
            }
        }
    }
}
