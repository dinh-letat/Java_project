package View.Home;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home extends JFrame implements ActionListener {
	
	public Home(String title) {
		super(title);
		setSize(1100, 720);
		menu();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public void centre() {
		
	}
	
	public void menu() {
		JMenuBar menubar = new JMenuBar();
		menubar.setPreferredSize(new Dimension(100, 30));
		
		JMenu home = new JMenu("Trang chủ");
		JMenu account = new JMenu("Tài khoản");
		JMenu product = new JMenu("Sản phẩm");
		JMenu supplier = new JMenu("Nhà cung cấp");
		JMenu list = new JMenu("Thống kê");
		JMenuItem changePassword = new JMenuItem("Change password");
		JMenuItem logOut = new JMenuItem("Log Out");
		product.add("Sản phẩm tồn kho");
		product.add("Loại sản phẩm");
		list.add("Thống kê theo sản phẩm");
		list.add("Thống kê giá sản phẩm");
		list.add("Thống kê theo số lượng");
		account.add(changePassword);
		account.add(logOut);
		
		menubar.add(home);
		menubar.add(account);
		menubar.add(product);
		menubar.add(list);
		menubar.add(supplier);
		
		setJMenuBar(menubar);
	}
	
	public void east() {
			
		}
	
	public static void main(String[] args) {
		new Home("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
