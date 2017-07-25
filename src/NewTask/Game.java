package NewTask;
import Calculator.*;
import javax.swing.*;
import java.awt.*;

import static Calculator.Calculator.CalculatorMain;
import static Vorona.crowsCalculation.Vorona;

//сдесь будет игра тетрис
public class Game extends JFrame {
    private JButton calculator ;
    private JButton crowsCalculation;
    private JButton Note;

    public Game(){
        super("Me First Window"); // Заголовок Окна
        setBounds(100, 100, 200, 200); //выстовляем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрываем окно и завершаем программу

        calculator = new JButton("Калькулятор");
        crowsCalculation = new JButton("Счётчик ворон");
        Note = new JButton("Блокнот");

        JPanel buttonsPanel = new JPanel(new GridLayout(3, 1));
        buttonsPanel.add(calculator);
        buttonsPanel.add(crowsCalculation);
        buttonsPanel.add(Note);
        add(buttonsPanel, BorderLayout.CENTER);

        calculator.addActionListener(e -> CalculatorMain());
        crowsCalculation.addActionListener(e -> Vorona());
    }
    public static void myWindowApp(){
        Game app = new Game();
        app.setVisible(true);
    }
}
