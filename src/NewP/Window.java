package NewP;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private JTextArea text;
    private JButton button;
    public  Window (){
        super("Window");
        setBounds(1000, 300, 500, 500);
        textArea();
    }
    private  void textArea(){
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        
        text = new JTextArea();
    }
    public static void Window(){
        Window add = new Window();
        add.setVisible(true);
    }
}
