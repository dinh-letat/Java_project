package View.login;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	public Login(String tile) {
		super(tile);
		setSize(600, 400);
		west();
		centre();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	JPanel pWest;
	JLabel username, password;
	JTextField jUsername;
	JPasswordField jPassword;
	JButton dangNhap, quenMatKhau;
	
	public void west() {
	    pWest = new JPanel();
//	    pWest.setLayout(new FlowLayout(FlowLayout.LEFT));
	    JLabel loginTitle = new JLabel("Thông tin đăng nhập");
	    loginTitle.setFont(new Font("Arial", Font.BOLD, 18));
	    dangNhap = new JButton("Đăng nhập");
	    quenMatKhau = new JButton("Quên mật khẩu ?");

	    username = new JLabel("Tên đăng nhập:");
	    password = new JLabel("Mật khẩu:");
	    
	    jUsername = new JTextField(10);
	    jUsername.setPreferredSize(new Dimension(30, 30));
	    
	    jPassword = new JPasswordField(20);
	    jPassword.setPreferredSize(new Dimension(30, 30));
	    
	    Box rowH = Box.createHorizontalBox();
	    rowH.add(Box.createHorizontalStrut(50));
	    rowH.add(loginTitle);
	    
	    Box row = Box.createHorizontalBox();
	    row.add(Box.createHorizontalStrut(10));
	    row.add(username);
	    row.add(Box.createHorizontalStrut(15));
	    row.add(jUsername);
	    
	    Box row1 = Box.createHorizontalBox();
	    row1.add(Box.createHorizontalStrut(10));
	    row1.add(password);
	    row1.add(Box.createHorizontalStrut(50));
	    row1.add(jPassword);
	    
	    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
	    buttonPanel.add(dangNhap);
	    buttonPanel.add(quenMatKhau);

//	    pNorth.setOpaque(true);
//	    pNorth.setBackground(Color.decode("#FFF68F")); // Thiết lập màu nền cho pNorth
//	    labels.setForeground(new Color(255, 48, 48));
	    dangNhap.setBackground(Color.decode("#FFF68F"));
	    dangNhap.setIcon(new ImageIcon("Image/Alecive-Flatwoken-Apps-Computer-Login.24.png"));
	    dangNhap.setBorderPainted(false);
	    dangNhap.setFocusPainted(false);
	    
	    quenMatKhau.setIcon(new ImageIcon("Image//Webiconset-Application-Register.24.png"));
	    quenMatKhau.setBorderPainted(false);
	    quenMatKhau.setFocusPainted(false);
	    quenMatKhau.setBackground(new Color(255, 48, 48));
	    
	    
	    Box hi = Box.createVerticalBox();
	    hi.add(Box.createVerticalStrut(50)); 
	    hi.add(rowH);
	    hi.add(Box.createVerticalStrut(70)); 
	    hi.add(row);
	    hi.add(Box.createVerticalStrut(10));
	    hi.add(row1); 
	    hi.add(Box.createVerticalStrut(30));
	    hi.add(buttonPanel);
	    pWest.add(hi);
	    
	    add(pWest, BorderLayout.CENTER);    
	}

	
	JPanel pHi;
	JLabel labelIm;
	
	
	public void centre() {
		pHi = new JPanel();
		labelIm = new JLabel();
		labelIm.setIcon(new ImageIcon("Image/tt.jpg"));
		pHi.add(labelIm);
		pHi.setPreferredSize(new Dimension(250, 300));
		add(pHi, BorderLayout.WEST);
	}
	
	public static void main(String[] args) {
		new Login("hihi");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
