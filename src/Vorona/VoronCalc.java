package Vorona;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Создаю программу для посчёта ворон

public class VoronCalc extends JFrame {
    private int voron = 0; // Колличество ворон
    private JLabel countLabel; //Для текста
    private JButton addCrow; // кнопка для добавления вароны
    private JButton removeCrow; // Кнопка для удоления вороны

    public VoronCalc() {
        super("Crow colculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Подготавливаю комоненты объекта
        countLabel = new JLabel("Crow:" + " " + voron); // Создаём объект с текстом + колличество ворон
        addCrow = new JButton("Add Crow"); // Добовляем кнопку и текстом
        removeCrow = new JButton("Remove Crow"); // Добовляем кнопку и текстом

        //Подготавливаю временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Росставляю компоненты по местам
        add(countLabel, BorderLayout.NORTH); //Потом можно поменять если будет не красиво
        buttonsPanel.add(addCrow);
        buttonsPanel.add(removeCrow);
        add(buttonsPanel, BorderLayout.SOUTH);
        //Добавляем ворону
        addCrow.addActionListener(e -> {
            voron = voron + 1;     //Добавляем одну ворону
            updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
        });
        //удаляем ворону
        removeCrow.addActionListener(e -> {
            if (voron > 0) {
                voron = voron - 1;
                updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
            }
        });
    }
    private void updateCrowCounter() {
        countLabel.setText("Crows:" + " " + voron);
        if (voron == 0 | voron == 1) {
            countLabel.setText("Crow:" + " " + voron);
        }
    }

    public static void Vorona() {
        VoronCalc app = new VoronCalc();
        app.setVisible(true);
        app.pack();//Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }
}
