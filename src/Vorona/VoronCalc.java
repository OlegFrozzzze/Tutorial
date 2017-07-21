package Vorona;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Создаю программу для посчёта ворон

public class VoronCalc extends JFrame{
    private int voron = 0; // Колличество ворон
    private JLabel countLabel; //Для текста
    private JButton addCrow; // кнопка для добавления вароны
    private JButton removeCrow; // Кнопка для удоления вороны

    public VoronCalc(){
        super("Crow colculator");

        //Подготавливаю комоненты объекта
        countLabel =  new JLabel("Crow:" + voron); // Создаём объект с текстом + колличество ворон
        addCrow = new JButton("Add Crow"); // Добовляем кнопку и текстом
        removeCrow = new JButton("Remove Crow"); // Добовляем кнопку и текстом

        //Подготавливаю временные компоненты
        JPanel buttonsPanel =  new JPanel(new FlowLayout());
        //Росставляю компоненты по местам
        add(countLabel, BorderLayout.NORTH); //Потом можно поменять если будет не красиво
        buttonsPanel.add(addCrow);
        buttonsPanel.add(removeCrow);
        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
