package RMI;
import java.rmi.*;

public class MyClient {

    public static void main(String args[]) {
        try {

            AdderRemote stub = (AdderRemote) Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println(stub.add(34, 4));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



