import java.awt.FlowLayout;
import javax.swing.*;
public class Main{
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのGUI");
    JButton button = new JButton("押してね！");
    JButton button2 = new JButton("押してね！！！！");
    JLabel label = new JLabel("Button Pushed");

    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    Button2.addActionListener(new ActionListener(){
      frame.getContentPane().add(label);
    });

    frame.getContentPane().add(button2);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);


  }
}
