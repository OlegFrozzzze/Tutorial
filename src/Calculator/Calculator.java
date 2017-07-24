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

public class Calculator extends JFrame {
    JTextArea display = new JTextArea();//дисплей калькулятора
    JPanel buttonPanel = new JPanel(new GridLayout(5, 3));//панель с кнопками
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

    int firstValue = 0;
    String operation = "+";

    public Calculator() {
        super("Calculator");
        setBounds(700, 300, 400, 500);
        button0.addActionListener(e -> display.setText(display.getText() + "0"));
        button1.addActionListener(e -> display.setText(display.getText() + "1"));
        button2.addActionListener(e -> display.setText(display.getText() + "2"));
        button3.addActionListener(e -> display.setText(display.getText() + "3"));
        button4.addActionListener(e -> display.setText(display.getText() + "4"));
        button5.addActionListener(e -> display.setText(display.getText() + "5"));
        button6.addActionListener(e -> display.setText(display.getText() + "6"));
        button7.addActionListener(e -> display.setText(display.getText() + "7"));
        button8.addActionListener(e -> display.setText(display.getText() + "8"));
        button9.addActionListener(e -> display.setText(display.getText() + "9"));

        //Удаление последнего действия
        buttonBack.addActionListener(e -> {
            String temp = display.getText();
            display.setText(temp.substring(0, temp.length() - 1));
        });
        //Добавил равно
        buttonSum.addActionListener(e -> {
            firstValue = Integer.valueOf(display.getText());
            display.setText("");
            operation = "+";
        });
        //Добавил *
        buttonMul.addActionListener(e -> {
            firstValue = Integer.valueOf(display.getText());
            display.setText("");
            operation = "*";
        });
        //Добавил деление
        buttonDivide.addActionListener(e -> {
            firstValue = Integer.valueOf(display.getText());
            display.setText("");
            operation = "/";
        });
        // Добавил вычитание
        buttonSub.addActionListener(e -> {
            firstValue = Integer.valueOf(display.getText());
            display.setText("");
            operation = "-";
        });
        buttonStart.addActionListener(e -> {
            int secondValue = Integer.valueOf(display.getText());
            if ("+".equals(operation)) {
                display.setText((firstValue + secondValue) + "");
            }
            if ("-".equals(operation)) {
                display.setText((firstValue - secondValue) + "");
            }
            if ("*".equals(operation)) {
                display.setText((firstValue * secondValue) + "");
            }
            if ("/".equals(operation)) {
                display.setText((firstValue / secondValue) + "");
            }
            firstValue = 0;
            operation = "+";
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(buttonStart, BorderLayout.SOUTH);
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
        buttonPanel.add(button0);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);

        setVisible(true);
    }

    public static void CalculatorMain() {
        Calculator calculator = new Calculator();
    }
}
