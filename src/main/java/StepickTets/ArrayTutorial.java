package StepickTets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayTutorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList list = new ArrayList();
        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);
        }
        for (int i = 0; i<list.size();i++){
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }

    }
}
