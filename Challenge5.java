<<<<<<< HEAD
import java.util.*;

class HelloTillStop {
     Scanner sc =new Scanner(System.in);
    

     void showHello() {
        String choice;

        System.out.println("For hello type h, anything else to stop");
        choice = sc. next();
        while("h".equals(choice)) {
             System.out.println("Hello");
             choice = sc.next();
     }

    }

    public static void main(String[] args) {
        HelloTillStop r= new HelloTillStop();
        r.showHello();



    }
}

=======
import java.util.*;

class HelloTillStop {
     Scanner sc =new Scanner(System.in);
    

     void showHello() {
        String choice;

        System.out.println("For hello type h, anything else to stop");
        choice = sc. next();
        while("h".equals(choice)) {
             System.out.println("Hello");
             choice = sc.next();
     }

    }

    public static void main(String[] args) {
        HelloTillStop r= new HelloTillStop();
        r.showHello();



    }
}

>>>>>>> b8d38a937bf81e8eac8348281c4df641c8b66a74
    