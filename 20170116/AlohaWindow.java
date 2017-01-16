import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}


class AlohaWindowMan{
	// field
	JFrame frame;
	JButton button1;
  JButton button2;
	JPanel panel;		// button&field
  JTextField fileName;
	JTextField fileNameField;
  JTextArea textArea;
	JScrollPane scrollPane;

	// method
	public AlohaWindowMan() {
	 // frame
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("Click Me!");
    button2 = new JButton("Buton2");
		fileNameField = new JTextField("ALOHA", 20);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(button1);
    panel.add(button2);

		frame.setVisible(true);
	}

	// click
	public void ActionPerformed(ActionEvent ae) {
    FileReader fr;
  	BufferedReader br;

  	try {
  		String textFile = fileName.getText();
  		fr = new FileReader(textFile);
  		br = new BufferedReader(fr);

  		String data = br.readLine();	// read
  		textArea.setText(data);	// write&disp
  	} catch(IOException e) {
  		System.out.println("IO error.");
  	}
	}

}
