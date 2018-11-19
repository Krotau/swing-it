import javax.swing.*;

class MainWindow {
    MainWindow() {
        JFrame fr = new JFrame();
        JButton test_button = new JButton("idk");
        test_button.setBounds(130,100,100, 40);

        fr.add(test_button);
        fr.setSize(400,500);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}