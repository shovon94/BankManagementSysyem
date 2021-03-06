/**
*this is the home page for admin.
*all the interface and options here only for admin panel.
*/

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AdminHome extends JFrame
{			
	JLabel txtHomeInfo = new JLabel("USN BANK LTD");
	JLabel showDate = new JLabel ();
	Calendar cal=new GregorianCalendar();
	 	
	/**
	 * here is the constructor and all the declarations 
	 * here the frame is fixed (1360*768) and not resizable
	 * the background image path is declared
	 */
  
	public AdminHome()
	 	{

			 setVisible(true);
			 setTitle("USN BANK LTD");
			 setSize(1360,768);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setFocusable(true);
			 setContentPane(new JLabel(new ImageIcon("C:\\Users\\Uchchhwash\\workspace\\Java Project\\src\\apphome.jpg")));
			 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			 this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
			 setResizable(false);
			
			 txtHomeInfo.setForeground(new Color(10, 18, 145));
			 txtHomeInfo.setFont(new Font("Impact", Font.BOLD, 65));
			 txtHomeInfo.setBounds(444,11, 500, 66);
			 
			 add(txtHomeInfo);
			 
			 JMenuBar menubar= new JMenuBar();
			 setJMenuBar(menubar);
			 
			 JMenu account = new JMenu ("Account");
			 menubar.add(account);
			 
			 JMenu user = new JMenu ("User");
			 menubar.add(user);
			 
			 JMenu transaction = new JMenu ("Transaction");
			 menubar.add(transaction);
			 
			 JMenu view = new JMenu ("View");
			 menubar.add(view);
			 
			 JMenu other = new JMenu ("Others");
			 menubar.add(other);
			 
			 JMenuItem accNew= new JMenuItem("New Account");
			 account.add(accNew);
			
			 JMenuItem accSU= new JMenuItem("Search/Update Account");
			 account.add(accSU);
			 
			 JMenuItem closeAccount= new JMenuItem("Close Account");
			 account.add(closeAccount);
			 
			 JMenuItem allCustomers= new JMenuItem("All Customers");
			 account.add(allCustomers);			 
			
			JMenuItem deposit = new JMenuItem("Deposit");
			 	transaction.add(deposit);
			 
			JMenuItem withdraw = new JMenuItem("Withdraw");
			 	transaction.add(withdraw);
			 
			JMenuItem transfer = new JMenuItem("Transfer");
				transaction.add(transfer);
			 
		    JMenuItem fdForm = new JMenuItem("FD Form");
		    	transaction.add(fdForm);
			 
			JMenuItem loan = new JMenuItem("Loan");
				transaction.add(loan);
			 
			JMenuItem loanPayment = new JMenuItem("Loan Payment");
				transaction.add(loanPayment);
				
				
			JMenuItem userCreate = new JMenuItem("Create User");
				user.add(userCreate);
					 
				
			JMenuItem userSu = new JMenuItem("Search/Update User");
				user.add(userSu);
				
			JMenuItem userRemove = new JMenuItem("Remove User");
				user.add(userRemove);
				
				
			JMenuItem userAll = new JMenuItem("All User");
				user.add(userAll);
				
				 
					JMenuItem tHistory = new JMenuItem("Transaction History");
					view.add(tHistory);
					
					JMenuItem chkFd = new JMenuItem("FD(s)");
					view.add(chkFd);
					
					JMenuItem chkLoan = new JMenuItem("Loan(s)");
					view.add(chkLoan);
					
					
					JMenuItem loanStatus = new JMenuItem("Loan Status");
					view.add(loanStatus);
					
					JMenuItem showLoanPayments = new JMenuItem("Show Loan Payment");
					view.add(showLoanPayments);
					
					JMenuItem bankDetails= new JMenuItem("Bank Detail's");
					other.add(bankDetails);
					
					JMenuItem changePass= new JMenuItem("Change Password");
					other.add(changePass);
					
					JMenuItem logOut = new JMenuItem("Log Out");
					other.add(logOut);
					
					JMenuItem exit = new JMenuItem("Exit");
					other.add(exit);
					
				// all the menu actions against mouse click	
					
					
					accNew.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							CreateNewAcc ac1 = new CreateNewAcc();
							
						}
					});
					
					accSU.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							UpdateInfo ac2 = new UpdateInfo();
						}
					});
					
					closeAccount.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e2) {
							RemoveCustomer asd = new RemoveCustomer();
						}
					});
					
					allCustomers.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e2) {
							AllCustomerDetails asd = new AllCustomerDetails();
						}
					});
					
					deposit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							Deposit ac3 = new Deposit();
						}
					});
					
					withdraw.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							Withdraw ac4 = new Withdraw();
						}
					});
					
					transfer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							Transfer ac5 = new Transfer();
						}
					});
					
					fdForm.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							FdForm ac6 = new FdForm();
						}
					});
					
					loan.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							LoanForm ac7 = new LoanForm();
						}
					});
					
					loanPayment.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							LoanPayment ac8 = new LoanPayment();
						}
					});
					
					
					bankDetails.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							 	
							BankDetails  ac9 = new BankDetails() ;
						}
					});
					
					exit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							System.exit(0);
						}
					});
					
					
					
					changePass.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							 	
							ForgetPassword  ac9 = new ForgetPassword() ;
						}
					});
					
					logOut.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							dispose(); 
							Login l1 = new Login ();
						}
					});
					
					userCreate.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							CreateUserAcc a10 = new CreateUserAcc();
						}
					});
					
					userSu.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							UserUpdateInfo a11 = new UserUpdateInfo();
						}
					});
					
					userRemove.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							RemoveUser a12 = new RemoveUser();
						}
					});
					
					userAll.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							AllUserDetails d1 = new AllUserDetails();
							
						}
					});
					
					tHistory.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							TransactionHistory d1 = new TransactionHistory();
							
						}
					});
					chkLoan.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							ShowLoan d1 = new ShowLoan();
							
						}
					});
					
					chkFd.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							ShowFd d1 = new ShowFd();
							
						}
					});
					
					loanStatus.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							LoanStatus d1 = new LoanStatus();
							
						}
					});
					
					
					showLoanPayments.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e1) {
							ShowLoanPayment d1 = new ShowLoanPayment();
							
						}
					});
				
					
				// for showing date & time	
					
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int month=cal.get(Calendar.MONTH);
					month+=1;
					int year=cal.get(Calendar.YEAR);
					
					
					showDate.setFont(new Font("Impact", Font.BOLD, 65));
					showDate.setForeground(new Color(10, 18, 145));
					showDate.setBounds(480,112, 456, 66);
					
					
					showDate.setText(day+"/"+month+"/"+year);
					add(showDate);
					
					

	 	}
					
}