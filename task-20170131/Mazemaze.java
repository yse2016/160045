import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Mazemaze{
  public static void main(String[] args) {
    NewWindow nw = new NewWindow();
  }

}

class NewWindow implements ActionListener{
  //fiels
  JFrame frame;
  JButton btnone;
  JButton btntwo;
  JPanel panel;
  JTextField word;
  JTextArea textarea;

      public NewWindow(){
        //newwindow
        frame = new JFrame("ALohaWindow");
        frame.setLocation(400,400);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //button1
        btnone = new JButton("追加");
        btnone.setActionCommand("add");
        btnone.addActionListener(this);

        //button2
        btntwo = new JButton("出題");
        btntwo.setActionCommand("ques");
        btntwo.addActionListener(this);

        //wordfield
        word = new JTextField("単語を入力してください",20);

        //textarea
        textarea = new JTextArea("Aloha");

        panel = new JPanel();
        panel.add(word);
        panel.add(btnone);
        panel.add(btntwo);
        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        frame.setVisible(true);
      }

      public void actionPerfoemed(ActionEvent e){
        String words = word.getText();
        System.out.println(words);

      }
}
