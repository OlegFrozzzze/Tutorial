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
    }
}
