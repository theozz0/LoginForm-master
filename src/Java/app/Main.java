package Java.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit;

    Main() {
        ImageIcon originalIcon = new ImageIcon(getClass().getClassLoader().getResource("logo.png"));


        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        JLabel logoLabel = new JLabel(resizedIcon, JLabel.CENTER); //

        // ======= Labels e campos =======
        user_label = new JLabel("User Name :");
        userName_text = new JTextField();

        password_label = new JLabel("Password :");
        password_text = new JPasswordField();

        submit = new JButton("SUBMIT");
        message = new JLabel("", JLabel.CENTER);

        // ======= Painel de formulário =======
        panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(new JLabel()); // Espaço
        panel.add(message);
        panel.add(new JLabel()); // Espaço
        panel.add(submit);

        submit.addActionListener(this);

        // ======= Painel principal =======
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(logoLabel, BorderLayout.NORTH);
        mainPanel.add(panel, BorderLayout.CENTER);

        // ======= Janela =======
        setTitle("Please Login Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main(); // Cria e exibe a janela
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = userName_text.getText();
        String password = new String(password_text.getPassword());

        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
        }
    }
        }
