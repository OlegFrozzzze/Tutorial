package NewP;

import javax.swing.*;

public class Window extends JFrame{
    private JTextArea text;
    public  Window (){
        super("Window");
        setBounds(1000, 300, 500, 500);
    }
    private  void textArea(){
        text = new JTextArea();
    }
    public static void Window(){
        Window add = new Window();
        add.setVisible(true);
    }
}
