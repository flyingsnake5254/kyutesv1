import UI.LoginFrame;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LoginActivity{
    private static JButton buttonLogin;
    private static JTextField editAccount;
    private static JPasswordField editPassword;
    private static LoginFrame loginFrame;
    public LoginActivity(){
        setUI();
        getUserData();
        buttonListener();
    }

    private void setUI(){
        loginFrame = new LoginFrame();

        // account
        // label
        JLabel labelAccount = new JLabel("帳號");
        labelAccount.setBounds(50 , 50 , 50 , 50);
        labelAccount.setFont(new Font("Serif" , Font.PLAIN , 20));
        // edit text
        editAccount = new JTextField();
        editAccount.setBounds(110 , 60 , 230 , 40);
        editAccount.setFont(new Font("Serif" , Font.PLAIN , 20));


        // password
        // label
        JLabel labelPassword = new JLabel("密碼");
        labelPassword.setBounds(50 , 120 , 50 , 50);
        labelPassword.setFont(new Font("Serif" , Font.PLAIN , 20));
        // edit text
        editPassword = new JPasswordField();
        editPassword.setBounds(110 , 130 , 230 , 40);
        editPassword.setFont(new Font("Serif" , Font.PLAIN , 20));


        // login button
        buttonLogin = new JButton("登入");
        buttonLogin.setBounds(260 , 210 , 80 , 40);
        buttonLogin.setFont(new Font("Serif" , Font.PLAIN , 20));

        loginFrame.add(labelAccount);
        loginFrame.add(editAccount);
        loginFrame.add(labelPassword);
        loginFrame.add(editPassword);
        loginFrame.add(buttonLogin);

        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
    }

    private void getUserData(){
        String path = this.getClass().getClassLoader().getResource(".").getPath();

    }

    private void buttonListener(){
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(editAccount.getText());
                System.out.println(editPassword.getText());
                System.exit(0);
            }
        });
    }
}
