import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// buttonx2
// savebutton
//disp x2
//memo_area input

public class Idean2{
  public static void main(String[] args) {
    System.out.println("Aloha");
    AlohaWindowMan awm = new AlohaWindowMan();
  }
}

class AlohaWindowMan implements ActionListener{
  //field
  JFrame frame;
  JTextField ideaname1;
  JTextField ideaname2;
  JTextField filename;
  JTextArea memo_area;
  JButton btn_Idea;
  JButton btn_Save;
  JPanel panel;
  JLabel label;
  String[] data = new String[20];

  public AlohaWindowMan(){
    frame = new JFrame("Aloha");
    frame.setLocation(100,100);
    frame.setSize(500,400);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //idea input
      ideaname1 = new JTextField("Leave here.",15);
      ideaname2 = new JTextField("Leave here.",15);

      //notes
      memo_area = new JTextArea(10,30);

      //file name
      filename = new JTextField("filename.txt",15);

      //rabel(Panel on window)
      panel = new JPanel();

      //ideabutton
      btn_Idea = new JButton("Change words");
      btn_Idea.addActionListener(this);
      btn_Idea.setActionCommand("idea");

      //savebutton
      btn_Save = new JButton("Save");
      btn_Save.addActionListener(this);
      btn_Save.setActionCommand("save");

    //rabel(text on window)
    label = new JLabel("+");

    //to put on
      //field on panel
        panel.add(ideaname1);
        panel.add(ideaname2);
        panel.add(label);
        panel.add(btn_Idea);
        panel.add(memo_area);
        panel.add(filename);
        panel.add(btn_Save);

        //panel on window
        Container con = frame.getContentPane();
        con.setLayout( new GridLayout(2,1));
        con.add(panel);

      frame.setVisible(true);

  }

  public void actionPerformed( ActionEvent ae ){
    String[] datas;
    int cnt = 0;
    String[] idea1;
    String[] line;
              try {
                File inFile = new File("words.txt");
                FileInputStream fis = new FileInputStream(inFile);
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr);

        				while((line = br.readLine()) != null){
        					datas[cnt] = line;
        					cnt++;
                  line = idea1;
        				}

                br.close();

             } catch (IOException e) {
                 System.err.println(e);
                 System.exit(1);
             }

        String[] idea2 = {"パチンコ","ヘッドホン","清水寺","水","火","江ノ島","モンスターエナジー","ちくわ","ヘアエクステンション"};

      // array list convert
      List<String> list1 = Arrays.asList( idea1 );
      List<String> list2 = Arrays.asList( idea2 );

      //list shuffle
      Collections.shuffle( list1 );
      Collections.shuffle( list2 );

      // list array convert
      String[] array1 = (String[])list1.toArray(new String[list1.size()]);
      String[] array2 = (String[])list2.toArray(new String[list2.size()]);

      // array 0
      String result1 = array1[0];
      String result2 = array2[0];

    // getcommand
    String cmd = ae.getActionCommand();

      if( cmd.equals("idea") ){
        ideaname1.setText( result1 );
        ideaname2.setText( result2 );

      // btn_Save
      } else if( cmd.equals("save") ){
        // Filename get
        String text_filename = filename.getText();

        // preparate data
        FileWriter fw = null;
        PrintWriter pw = null;

        try{
          // fileopen
          fw = new FileWriter( text_filename );
          pw = new PrintWriter( fw );

          // feald read
          String data1 = ideaname1.getText();
          String data2 = ideaname2.getText();
          String data3 = memo_area.getText();

          // save
          pw.println( data1 +" + "+ data2 );
          pw.println("↓");
          pw.println( data3 );

        // exception
        } catch( IOException e ){
          System.out.println("Error");
        } finally {

          try{
            fw.close();
            pw.close();
          } catch( IOException e ){
            System.out.println("Error");
          }
        }

      }
  }


}
