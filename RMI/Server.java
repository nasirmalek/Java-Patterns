package RMI;

import java.rmi.*;
import java.rmi.server.*;

public class Server extends UnicastRemoteObject implements AdderRemote {

    protected Server() throws RemoteException {
        super();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        try {
            AdderRemote obj = new Server();
            Naming.rebind("rmi://localhost:5000/sonoo", obj);
            System.out.println("Server ready.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}