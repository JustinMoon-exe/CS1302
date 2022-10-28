import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {
    static JFrame frame_1;
    static JButton start_val, add_1, minus_1, reset_1;
    static JLabel label_1, label_num;
    static JTextField text_1;
    static JPanel panel_center, panel_south;
    static int iCounter;

    public static void main(String[] args) {
        frame_1 = new JFrame();
        frame_1.setLayout(new BorderLayout());

        panel_center = new JPanel();
        panel_south = new JPanel();
        panel_center.setLayout(new FlowLayout());
        panel_south.setLayout(new FlowLayout());
        start_val = new JButton("Start Counter");
        add_1 = new JButton("Add 1");
        minus_1 = new JButton("Delete 1");
        reset_1 = new JButton("Reset");
        label_1 = new JLabel("Value is: ");
        text_1 = new JTextField(10);
        label_num = new JLabel("0");

        ButtonListener buttonListener = new ButtonListener();
        add_1.addActionListener(buttonListener);
        minus_1.addActionListener(buttonListener);
        reset_1.addActionListener(buttonListener);
        start_val.addActionListener(buttonListener);

        panel_center.add(text_1);
        panel_center.add(label_1);
        panel_center.add(label_num);
        panel_south.add(start_val);
        panel_south.add(add_1);
        panel_south.add(minus_1);
        panel_south.add(reset_1);

        frame_1.add(panel_center, BorderLayout.CENTER);
        frame_1.add(panel_south, BorderLayout.SOUTH);
        frame_1.setSize(450, 200);
        frame_1.setVisible(true);
        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // write code here to test which of the three buttons // have been clicked using
            // 'e.getSource().equals...'
            JButton button = (JButton) e.getSource();
            if (button.equals(start_val)) {
                String startStr = text_1.getText().trim();
                iCounter = Integer.parseInt(startStr);
                label_num.setText(startStr);
            } else if (button.equals(add_1)) {
                ++iCounter;
                label_num.setText(Integer.toString(iCounter));
            } else if (button.equals(minus_1)) {
                --iCounter;
                label_num.setText(Integer.toString(iCounter));
            } else if (button.equals(reset_1)) {
                iCounter = 0;
                label_num.setText(Integer.toString(iCounter));
                text_1.setText("");
            }
        }
    }
}
