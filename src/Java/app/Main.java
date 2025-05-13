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
        // ======= LOGO =======
        // Carregue a imagem
        ImageIcon originalIcon = new ImageIcon(getClass().getClassLoader().getResource("logo.png"));

        // Redimensionando a logo para se ajustar ao tamanho adequado
        Image img = originalIcon.getImage(); // Obtemos a imagem da logo
        Image resizedImg = img.getScaledInstance(200, 100, Image.SCALE_SMOOTH); // Redimensiona a logo
        ImageIcon resizedIcon = new ImageIcon(resizedImg); // Cria um novo ImageIcon com a logo redimensionada

        JLabel logoLabel = new JLabel(resizedIcon, JLabel.CENTER); // Exibe a logo redimensionada no centro

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
        mainPanel.add(logoLabel, BorderLayout.NORTH); // Adiciona a logo na parte superior
        mainPanel.add(panel, BorderLayout.CENTER); // Adiciona o painel de login no centro

        // ======= Janela =======
        setTitle("Please Login Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setSize(400, 300); // Define o tamanho da janela para acomodar a logo e o login
        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true); // Torna a janela visível
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
