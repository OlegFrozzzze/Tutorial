package Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//TODO 1) Создать графическое предстовление калькулятор
//TODO 1.1) Создать методы с : + - / * C = чисел
//TODO 1.1.1) Числа должны быть дробнами
//TODO 1.1.2) проверка при делении на 0
//TODO 1.2) Созать понель с кнопками и числами
// TODO 1.2.1) Кнопки должны быть от 1 до 0, + - / *, =, C

public class Calculator extends JFrame{
    public  Calculator(){
        super ("Calculator");
        setBounds(700, 300, 500, 500);

        setLayout(new BorderLayout());

        JTextArea display= new JTextArea();//дисплей калькулятора
        JPanel buttonPanel = new JPanel(new GridLayout(3,5));//панель с кнопками
        JButton button0 = new JButton("0");//кнопка 0
        JButton button1 = new JButton("1");//кнопка 1
        JButton button2 = new JButton("2");//кнопка 2
        JButton button3 = new JButton("3");//кнопка 3
        JButton button4 = new JButton("4");//кнопка 4
        JButton button5 = new JButton("5");//кнопка 5
        JButton button6 = new JButton("6");//кнопка 6
        JButton button7 = new JButton("7");//кнопка 7
        JButton button8 = new JButton("8");//кнопка 8
        JButton button9 = new JButton("9");//кнопка 9
        JButton buttonSum = new JButton("+");//кнопка +
        JButton buttonBack = new JButton("C");//кнопка С
        JButton buttonDivide = new JButton("/");//кнопка /
        JButton buttonSub = new JButton("-");//кнопка -
        JButton buttonMul = new JButton("*");//кнопка *
        JButton buttonStart = new JButton("=");//кнопка =

        add(display,BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.CENTER);
        add(buttonStart,BorderLayout.SOUTH);
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);
        setVisible(true);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        });

    }







    public static void CalculatorMain(){
        Calculator calculator  =  new Calculator();
    }
}
