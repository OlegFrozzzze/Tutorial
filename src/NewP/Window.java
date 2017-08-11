package NewP;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private JTextArea text;
    private JTextArea text2;
    private JButton button;
    public  Window (){
        super("Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(1000, 300, 500, 500);
        textArea();
    }
    private  void textArea(){
        JPanel buttonsPanel = new JPanel(new FlowLayout());

        button = new JButton("123");
        buttonsPanel.add(button);
        add(buttonsPanel, BorderLayout.WEST);

        text = new JTextArea();
        add(text,BorderLayout.SOUTH);
        text2 = new JTextArea();
        add(text2, BorderLayout.WEST);
    }
    public static void Window(){
        Window add = new Window();
        add.setVisible(true);
    }
}
