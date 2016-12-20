import java.awt.*;
import javax.swing.*;

public class WindowTest{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    JButton button = new JButton("ClickMe!");

    frame.setBounds(50,50,300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    Container ctnr = frame.getContentPane();
    ctnr.add(label);


    //window display
    frame.setVisible(true);
  }
}
