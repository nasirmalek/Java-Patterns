package RMI;
import java.rmi.*;

public interface AdderRemote extends Remote {
    int add(int a, int b) throws RemoteException;
}