package Note;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Note extends JFrame {
    MenuBar menuBar = new MenuBar();
    private MenuItem menuOpen; //Элемент меню
    private MenuItem menuSave;//Элемент меню
    private MenuItem menuExit;//Элемент меню
    private MenuItem menuAbout;//Элемент меню
    private JTextArea theText; //Поле ввода текста

    public Note() {
        super("Note");
        setBounds(1000, 300, 500, 500);
        initMenu();
        initMainPanel();
        initListeners();
    }

    private void initMenu() {
        PopupMenu fileMenu = new PopupMenu("File");
        PopupMenu helpMenu = new PopupMenu("Help");

        menuOpen = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
        menuSave = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_O));
        menuExit = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_O));
        menuAbout = new MenuItem("About", new MenuShortcut(KeyEvent.VK_O));

        fileMenu.add(menuOpen);
        fileMenu.add(menuSave);
        fileMenu.add(menuExit);

        helpMenu.add(menuAbout);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        this.setMenuBar(menuBar);
    }

    private void initMainPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        theText = new JTextArea();
        panel.add(new JScrollPane(theText), BorderLayout.CENTER);
        getContentPane().add(panel);
    }

    private void initListeners() {

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        menuAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Добавить меню помощи
            }
        });
        menuSave.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                try {
                    PrintWriter out = new PrintWriter("C:\\Users\\ОЛЕГ\\Desktop\\text.txt");
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }

            }
        });
        menuExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        menuOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // Добавить открытие файла
            }
        });
    }
    public static void NoteBook(){
        Note app = new Note();
        app.setVisible(true);
       // app.pack();
    }
}
