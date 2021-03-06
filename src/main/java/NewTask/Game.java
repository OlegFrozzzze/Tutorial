package NewTask;

import NewP.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Calculator.Calculator.CalculatorMain;
import static Note.Note.NoteBook;
import static Vorona.crowsCalculation.Vorona;


public class Game extends JFrame {
    public Game() {
        super("Me First Window"); // Заголовок Окна
        setBounds(100, 100, 200, 200); //выстовляем размер окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//закрываем окно и завершаем программу

        JButton calculator = new JButton("Калькулятор");
        JButton crowsCalculation = new JButton("Счётчик ворон");
        JButton Note = new JButton("Блокнот");
        JButton NewP = new JButton("fwfw");
        JTextArea text = new JTextArea();
        JScrollPane scrollBar = new JScrollPane(text);

        add(scrollBar, BorderLayout.CENTER);


        JPanel buttonsPanel = new JPanel(new GridLayout(3, 1));
        buttonsPanel.add(calculator);
        buttonsPanel.add(crowsCalculation);
        buttonsPanel.add(Note);
        buttonsPanel.add(NewP);
        add(buttonsPanel, BorderLayout.NORTH);

        calculator.addActionListener(e -> CalculatorMain());
        crowsCalculation.addActionListener(e -> Vorona());
        Note.addActionListener(e -> NoteBook());
      //  NewP.addActionListener(e-> );



    }


    public static void myWindowApp() {
        Game app = new Game();
        app.setVisible(true);
    }
}
