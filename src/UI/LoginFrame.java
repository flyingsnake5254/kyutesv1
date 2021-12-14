package UI;

import javax.swing.*;

public class LoginFrame extends JFrame {
    public LoginFrame(){
        super("KYUTES Login");
        this.setSize(400 , 350);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String path = this.getClass().getClassLoader().getResource(".").getPath();
        this.setIconImage(new ImageIcon(path + "/Image/nknu_logo.png").getImage());
    }
}
