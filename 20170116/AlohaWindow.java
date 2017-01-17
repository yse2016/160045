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
	JButton btnOpen;
  JButton btnSave;
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

		btnOpen = new JButton("開く");
//		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");

		btnSave = new JButton("保存");
//		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");

		fileNameField = new JTextField("ALOHA", 20);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(btnSave);
    panel.add(btnOpen);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);


		frame.setVisible(true);
	}



	// click
	public void actionPerformed(ActionEvent ae) {
		// コマンドを、しらべる
		String cmd = ae.getActionCommand();

		// もし、、、なら、、、
		if(cmd.equals("open")) {
			// 「ファイルを開く」を開く
			JFileChooser fc = new JFileChooser();

			// 表示するdirをきめる
			fc.setCurrentDirectory(new File("."));

			// ダイアログをつくる
			int ret = fc.showOpenDialog(frame);

			// 選ばれたファイルを、しらべる
			if(ret == JFileChooser.APPROVE_OPTION) {
				// 選ばれたファイル
				File file = fc.getSelectedFile();

				// ファイル名、保存場所をしらべる
				textFileName = file.getAbsolutePath();

				// テキストフィールドに表示
				fileName.setText(textFileName);
			}
		}
	}
