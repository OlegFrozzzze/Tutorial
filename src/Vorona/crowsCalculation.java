package Vorona;

import Calculator.Calculator;

import javax.swing.*;
import java.awt.*;

import static Calculator.Calculator.CalculatorMain;

//Создаю программу для посчёта ворон

public class crowsCalculation extends JFrame {
    private int crowsCounter = 0; // Колличество ворон
    private JLabel countLabel; //Для текста
    private JButton addCrowButton; // кнопка для добавления вароны
    private JButton removeCrowButton; // Кнопка для удоления вороны

    public crowsCalculation() {
        super("Crow colculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Подготавливаю компоненты объекта
        countLabel = new JLabel("Crow:" + " " + crowsCounter); // Создаём объект с текстом + колличество ворон
        addCrowButton = new JButton("Add Crow"); // Добовляем кнопку и текстом
        removeCrowButton = new JButton("Remove Crow"); // Добовляем кнопку и текстом

        //Подготавливаю временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());

        //Росставляю компоненты по местам
        add(countLabel, BorderLayout.NORTH); //Потом можно поменять если будет не красиво

        buttonsPanel.add(addCrowButton);
        buttonsPanel.add(removeCrowButton);
        add(buttonsPanel, BorderLayout.SOUTH);

        //Добавляем ворону
        addCrowButton.addActionListener(e -> {
            crowsCounter = crowsCounter + 1;     //Добавляем одну ворону
            updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
        });
        
        //Удаляем ворону
        removeCrowButton.addActionListener(e -> {
            if (crowsCounter > 0) {
                crowsCounter = crowsCounter - 1;
                updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
            }
        });
    }

    private void updateCrowCounter() {
        countLabel.setText("Crows:" + " " + crowsCounter);
        if (crowsCounter == 0 | crowsCounter == 1) {
            countLabel.setText("Crow:" + " " + crowsCounter);
        }
    }

    public static void Vorona() {
        crowsCalculation app = new crowsCalculation();
        app.setVisible(true);
        app.pack();//Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }
}
