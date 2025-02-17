package com.kh.view.update;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.controller.update.PasswordChangeController;
import com.kh.model.vo.User;

public class PasswordChangeView extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	protected User user;
	private PasswordChangeController passwordchangeController;
	/**
	 * Create the panel.
	 */
	public PasswordChangeView() {
		
		passwordchangeController = new PasswordChangeController();
		
		setLayout(null);
		setBounds(0, 0, 360, 600);
		
		JLabel lblNewLabel = new JLabel("비밀번호");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(53, 155, 115, 39);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(52, 191, 219, 24);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("새 비밀번호");
		textField.getText();
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(53, 268, 196, 18);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		
		textField_1.setBounds(52, 298, 219, 24);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("취소");
		btnNewButton.setBounds(73, 358, 79, 27);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordchangeController.newPassword(user, textField.getText());
			}
		});
		btnNewButton_1.setBounds(180, 358, 79, 27);
		add(btnNewButton_1);

	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setBounds(100, 100, 360, 600);

		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PasswordChangeView cmain = new PasswordChangeView();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(cmain);
		
		
		
	}
}
