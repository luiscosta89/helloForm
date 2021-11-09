package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame{
    private JPanel container;
    private JTextField nameField;
    private JButton sayHelloButton;

    public static void main(String[] args) {
        (new HelloWorld()).showMe();
    }

    public HelloWorld() {

        //executar a acao do clique do botao
        sayHelloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    showMessage();
            }
        });
    }
    // exibir a mensagem quando o botao eh clicado
    private void showMessage(){
        String greeting = "Hello, " + nameField.getText() + "!";
        javax.swing.JOptionPane.showMessageDialog(
                this,
                greeting,"Hello, World!",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }
    // exibir a janela principal
    public void showMe(){
        setTitle("Hello World");
        setContentPane(container);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        //Alteração de teste para o commit da pasta vinculada
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }
}
