import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JInsur implements ActionListener {
    JTextField name;
    JTextField price;
    // Create checkbox
    JCheckBox hmo;
    JCheckBox ppo;
    JCheckBox dental;
    JCheckBox vision;

    /**
     * Constructor
     */
    public JInsur() {
        name = new JTextField(10);
        price = new JTextField(10);
        name.setEditable(false);
        price.setEditable(false);
        // Create checkbox
        hmo = new JCheckBox("HMO - health maintenance organisation");
        ppo = new JCheckBox("PPO - preferred provider organisation");
        dental = new JCheckBox("Dental insuarance");
        vision = new JCheckBox("Vision insuarance");
    }

    /**
     *
     * @return
     */
    public JPanel init() {
        JPanel mainPanel = new JPanel(new GridLayout(2, 1));
        // mainPanel.setPreferredSize(new Dimension(400, 200));
        mainPanel.setBorder(BorderFactory.createTitledBorder(""));
        JPanel subPanel = new JPanel(new GridLayout(4, 1));
        // Create buttongroup
        ButtonGroup grp = new ButtonGroup();
        grp.add(hmo);
        grp.add(ppo);
        // Add actionlistener
        hmo.addActionListener(this);
        ppo.addActionListener(this);
        dental.addActionListener(this);
        vision.addActionListener(this);
        // Add checkbox to the panel
        subPanel.add(hmo);
        subPanel.add(ppo);
        subPanel.add(dental);
        subPanel.add(vision);
        mainPanel.add(subPanel);
        // Create sub panel for name and cost
        JPanel subPanel2 = new JPanel(new GridLayout(2, 2));
        subPanel2.add(new JLabel("Insurance: "));
        subPanel2.add(name);
        subPanel2.add(new JLabel("Cost: "));
        subPanel2.add(price);
        mainPanel.add(subPanel2);
        return mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String insurance = "";
        int cost = 0;
        if (hmo.isSelected()) {
            insurance = (insurance == "") ? "HMO" : insurance + ", HMO";
            cost += 200;
        }
        if (ppo.isSelected()) {
            insurance = (insurance == "") ? "PPO" : insurance + ", PPO";
            cost += 600;
        }
        if (dental.isSelected()) {
            insurance = (insurance == "") ? "Dental" : insurance + ", Dental";
            cost += 75;
        }
        if (vision.isSelected()) {
            insurance = (insurance == "") ? "Vision" : insurance + ", Vision";
            cost += 20;
        }
        name.setText(insurance);
        price.setText(new DecimalFormat("$ #,###.##").format(cost));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Select Insurance");
        frame.add(new JInsur().init());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // To center frame on the window
        frame.setVisible(true);
    }
}