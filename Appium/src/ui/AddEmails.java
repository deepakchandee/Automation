package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.UUID;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class AddEmails implements ActionListener {

	private JFrame frame;
	private JTextField email;

	private JButton btnAdd;
	private JLabel status;

	private static int counter = 1;
	private JLabel lblNewLabel_1;
	private JButton btnRemove;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmails window = new AddEmails();
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
	public AddEmails() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Add Receptants ");
		frame.setBounds(100, 100, 705, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		email = new JTextField();
		email.setToolTipText("Please enter email here ..");
		email.setFont(new Font("Tahoma", Font.PLAIN, 13));
		email.setBounds(67, 103, 448, 39);
		frame.getContentPane().add(email);
		email.setColumns(10);

		JLabel lblEnterNewEmail = new JLabel("Enter new email ");
		lblEnterNewEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEnterNewEmail.setBounds(71, 67, 207, 25);
		frame.getContentPane().add(lblEnterNewEmail);

		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(242, 194, 133, 46);
		frame.getContentPane().add(btnAdd);

		btnAdd.addActionListener(this);

		status = new JLabel("Status :");
		status.setFont(new Font("Tahoma", Font.PLAIN, 13));
		status.setBounds(71, 262, 207, 25);
		frame.getContentPane().add(status);
		
		lblNewLabel_1 = new JLabel("Note *If you want to remove your previous receptants then click here");
		lblNewLabel_1.setBounds(68, 299, 345, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnRemove = new JButton("Remove");
		btnRemove.setBounds(426, 295, 89, 23);
		frame.getContentPane().add(btnRemove);
		btnRemove.addActionListener(this);
	}

	public int createFile(String email) {

		try {

			
			
			FileOutputStream fileOutputStream = new FileOutputStream("email.properties", true);
			Properties properties = new Properties();

			properties.setProperty("email" + UUID.randomUUID().toString().substring(24).toLowerCase(), email);

			properties.store(fileOutputStream, "Added New Email");

			fileOutputStream.close();
			return 1;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}
	
	
	public int clearAllReceptants() {
		
		try {
			
			File file = new File("email.properties");
			if(file.exists()) {
				file.delete();
				
				file.createNewFile();
			}
			else {
				file.createNewFile();
			}
			
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAdd) {
			int st =  createFile(email.getText());
			if(st==1) {
				status.setText("Successfully Added");				
			}
			else {
				JOptionPane.showMessageDialog(null, "Something goes wrong !!!!!!! ");
			}
			
			
			
		}
		
		if(e.getSource()==btnRemove) {
			int st = clearAllReceptants();
			if(st==1) {
				JOptionPane.showMessageDialog(null,"All Receptants , Removed !!");
			}
			else {
				JOptionPane.showMessageDialog(null,"Error !!");				
			}
		}

	}
}
