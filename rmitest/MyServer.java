package rmitest;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            Adder skeleton = new AdderRemote();
            Registry registry = LocateRegistry.createRegistry(5001);
            registry.rebind("Adder", skeleton);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
