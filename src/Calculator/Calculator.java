package Calculator;

import javax.swing.*;

public class Calculator extends JFrame{
    public  Calculator(){
        super ("Calculator");
        setBounds(700, 300, 500, 500);
        setVisible(true);
    }
    public static void CalculatorMain(){
        Calculator start =  new Calculator();
    }
}
