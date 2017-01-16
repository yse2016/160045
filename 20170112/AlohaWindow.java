import java.awt.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}


class AlohaWindowMan implements ActionListener{
	// field
	JFrame frame;
	JButton button;
	JPanel panel;
	JTextField fileNameField;

	// method
	public AlohaWindowMan() {
		// frame make
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// button field add
		button = new JButton("Click Me!");
		fileNameField = new JTextField("ALOHA", 20);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(button);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);

		// disp
		frame.setVisible(true);
	}

	// click activity
	public void ActionPerformed(ActionEvent ae) {
		// field
		fileNameField.setText("Hello");

    class MyButton extends JButton implements ActionListener{
      //constructor
      public MyButton(String str){
        super(str);
        addActionListener(this);
      }
      public void ActionPerformed(ActionEvent ae){
        fileNameField.setText("Hello");
      }
    }
    
	}
}
