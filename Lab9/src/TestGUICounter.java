import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGUICounter {
	static JFrame frame_1;
	static JButton start_val, add_1, minus_1, reset_1;
	static JLabel label_0, label_1, label_num;
	static JTextField text_1;
	static int iCounter = 0;

	public static void main(String[] args) {
		frame_1 = new JFrame("LAB9 GUI Counter");
		frame_1.setLayout(new FlowLayout());

		label_0 = new JLabel("Input counter start:");
		text_1 = new JTextField("0", 3);
		label_1 = new JLabel("Value is:");
		label_num = new JLabel("0");
		start_val = new JButton("Set counter start");
		add_1 = new JButton("Add 1");
		minus_1 = new JButton("Delete 1");
		reset_1 = new JButton("Reset");

		// add the labels, textfield, buttons in the proper
		// order to look like the example GUI in the instructions
		ButtonListener buttonListener = new ButtonListener();
		add_1.addActionListener(buttonListener);
		minus_1.addActionListener(buttonListener);
		reset_1.addActionListener(buttonListener);
		start_val.addActionListener(buttonListener);

		frame_1.add(label_0);
		frame_1.add(text_1);
		frame_1.add(label_1);
		frame_1.add(label_num);
		frame_1.add(text_1);

		frame_1.add(start_val);
		frame_1.add(add_1);
		frame_1.add(minus_1);
		frame_1.add(reset_1);
		// setup all buttons to use the "ButtonListener()" class for ActionEvents
		// Notice what happens when you resize the main JFrame window...

		frame_1.setSize(350, 150);
		frame_1.setVisible(true);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// write code here to test which of the 4 buttons
			// have been clicked using 'e.getSource().equals...'
			// or 'e.getSource()==...'
			// very similar to the demonstration I did in class lecture
			// First, when 'start_val' clicked, then get the value from the 'text_1'
			// text box (user 'getText()' method) and set the 'label_num' and the
			// iCounter to be that value. Next, in the if 'add_1' clicked, then
			// add 1 to the 'iCounter' and update label: 'label_num' and if
			// the 'minus_1' is clicked, delete 1 from iCounter and update
			// the 'label_num'
			// Then, if 'reset_1' is clicked, set sever things blank and back to zero.
			// HINT: when you get the value from a JTextField, it is a string, so
			// you have to convert it to an integer to give the value to 'iCounter'
			// and to convert an integer to a string, use 'Integer.parseInt(string
			// variable)'
		}

	}
}
