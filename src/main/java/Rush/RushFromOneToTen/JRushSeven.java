package Rush.RushFromOneToTen;

import java.io.IOException;
import java.rmi.RemoteException;

public class JRushSeven {
    public static void JRush(String[] args) {
        processExceptions(new JRushSeven());
    }

    public static void processExceptions(JRushSeven obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException e) {
            System.out.println("RemoteException");

        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException");

        } catch (IOException e) {
            System.out.println("IOException");
        }
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

