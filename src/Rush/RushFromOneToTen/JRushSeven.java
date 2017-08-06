package Rush.RushFromOneToTen;

import java.io.IOException;
import java.rmi.RemoteException;

public class JRushSeven {
    public static void JRush(String[] args) {
        processExceptions(new JRushSeven());
    }

    public static void processExceptions(JRushSeven obj) {
        
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}

