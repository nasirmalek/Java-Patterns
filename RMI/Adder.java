package RMI;
import java.rmi.*;
import java.rmi.server.*;

public class Adder extends UnicastRemoteObject implements AdderRemote {

    protected Adder() throws RemoteException {
        super();
    }

    public int add(int a, int b) {
        return a + b;
    }
}