package NewTask;
import javax.swing.*;
import java.awt.*;

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

    }
    public static void myWindowApp(){
        Game app = new Game();
        app.setVisible(true);
    }
}
