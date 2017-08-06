package Rush.RushFromOneToTen;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Перехват выборочных исключений
*/

public class JRushSix {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws IOException {
        processExceptions();
    }

    public static void processExceptions() throws IOException {
        BEAN.methodThrowExceptions();
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
