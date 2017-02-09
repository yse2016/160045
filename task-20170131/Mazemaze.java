import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class Mazemaze{
  public static void main(String[] args) {
    System.out.println("Hello!");
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

      public NewWindow(){
        //newwindow
        frame = new JFrame("TangoMazemaze");
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
        word = new JTextField("ここに入力して追加",20);

        panel = new JPanel();
        panel.add(word);
        panel.add(btnone);
        panel.add(btntwo);
        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        frame.setVisible(true);

      }


      public void actionPerformed(ActionEvent ae){
        String cmdName = ae.getActionCommand();
        if ("add".equals(cmdName)) {
//addbutton

          try {
            File f = new File("data.csv");
            //write
            FileWriter fw = null;
            fw = new FileWriter(f, true);
            fw.write(word.getText() + ",");
            fw.close();
            word.setText("");
          }catch (IOException e) {
              System.out.println("error");
          }


      }else if ("ques".equals(cmdName)) {

//quesbutton

          try{
            File f = new File("data.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while((line = br.readLine()) != null){
            String[] data = line.split(",",0); //カンマ区切り 配列変換
            Random rnd = new Random();
            int ran = rnd.nextInt(data.length);
            System.out.println(ran);
            System.out.println(data[ran]);
            word.setText(data[ran]);
            btnone.setEnabled(false);
            }
            br.close();
          }catch(IOException e){
            System.out.println("error");
          }


        }
      }
}
