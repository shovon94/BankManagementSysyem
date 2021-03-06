import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mysql.jdbc.PreparedStatement;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;

public class AllCustomerDetails extends JFrame{

	// declaration of table, buttons, label and other components
	
	JTable table= new JTable();
	JLabel lblAllCustomerDetails = new JLabel("All Customer Detail's");
	Connection connection=null;
	JButton btShowDetails = new JButton("Show All Details");
	JButton btCancel = new JButton("Cancel");
	JButton btSearch = new JButton("Search");
	JTextField txtSearch = new JTextField();

	/**
	 * here is the constructor and all the declarations 
	 * here the frame is fixed and not resizable
	 * the background image path is declared
	 */
	
	public AllCustomerDetails() {

		
		setBounds(100, 100, 1360, 768);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Uchchhwash\\workspace\\Java Project\\src\\Img6crt.jpg")));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 71, 1194, 588);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		
		btShowDetails.setBounds(650 ,670, 140, 43);
	    add(btShowDetails);
	    
		btSearch.setBounds(1150 ,670, 120, 43);
		add(btSearch);
	    
		btCancel.setBounds(490 ,670, 140, 43);
		add(btCancel);
		
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch.setColumns(10);
		txtSearch.setBounds(1000, 670, 140, 43);
		add(txtSearch);
		
		
		lblAllCustomerDetails.setForeground(Color.BLACK);
		lblAllCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblAllCustomerDetails.setBounds(451, -13, 527, 108);
		add(lblAllCustomerDetails);
		

	// connecting database and run query to fetch data from database against the button click
		
		 connection= DatabaseConnection.dbConnector();
		 btShowDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e1) {
					 try
						{
						 	String query ="select Account_No,Name,DOB,Phone_No,Email,Address,District,State,Gender,Marital_Status,Father_Name,Mother_Name,Balance from customer";
						 	PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
						 	ResultSet rs=pst.executeQuery();
						 	table.setModel(DbUtils.resultSetToTableModel(rs));
						
						}
					catch(Exception e)
						{
							JOptionPane.showMessageDialog(null,e);
						}
				}
			});
		 
		 btCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e1) 
				{
					dispose();
				}
			});
		 
		 btSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e1) 
				{
					 try
						{
						 	String query ="select Account_No,Name,DOB,Phone_No,Email,Address,District,State,Gender,Marital_Status,Father_Name,Mother_Name,Balance from customer where Account_No = ?";
						 	PreparedStatement ps = (PreparedStatement) connection.prepareStatement(query);
						 	
							ps.setString(1,txtSearch.getText());
							ResultSet rs = ps.executeQuery();
							table.setModel(DbUtils.resultSetToTableModel(rs));						
						}
					catch(Exception e)
						{
							JOptionPane.showMessageDialog(null,"Customer Don't Exist!");
						}
				}
			});
		 
				
			
		
	}
}
