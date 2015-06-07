import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;


public class testui {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testui window = new testui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 208, 70, 10);
		frame.getContentPane().add(separator);
		
		textField = new JTextField();
		textField.setBounds(10, 229, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(142, 214, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 228, 123);
		frame.getContentPane().add(tabbedPane);
		
		Button button = new Button("ghyjfg");
		tabbedPane.addTab("New tab", null, button, null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(Color.ORANGE);
		button.setBackground(Color.RED);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tabbedPane.addTab("New tab", null, tglbtnNewToggleButton, null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(40, 155, 91, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
