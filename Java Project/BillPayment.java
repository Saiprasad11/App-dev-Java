import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class BillPayment {

	private JFrame frame;
	private JTable table;
	private JTextField jtxtCash;
	private JTextField jtxtChange;
	private JTextField jtxtTotal;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillPayment window = new BillPayment();
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
	public BillPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//------------------------------------------------ Creating Function------------------------------------
	
		public void ItemCost() 
		{
			double sum = 0;
			
			for(int i=0; i< table.getRowCount(); i++)
			{
				sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
			}
				String iSum = String.format("₹ %.2f", sum);
				jtxtTotal.setText(iSum);
				
		}
		
		//------------------------------------------------ Creating Function------------------------------------
		
		public void change() 
		{
			double sum = 0;
			double cash = Double.parseDouble(jtxtCash.getText());
			
			for(int i=0; i< table.getRowCount(); i++)
			{
				sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
			}	
				
				double cChange = (cash - sum );
				String iChange = String.format("₹ %.2f", cChange);
				jtxtChange.setText(iChange);
		}
		
		
		
		
		//------------------------------------------------ Creating Function------------------------------------
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 250, 154));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 298, 386);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.setForeground(new Color(0, 0, 128));
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn1.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn1.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn1.setBounds(10, 10, 85, 85);
		panel.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.setForeground(new Color(0, 0, 128));
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn2.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn2.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn2.setBounds(102, 10, 85, 85);
		panel.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.setForeground(new Color(0, 0, 128));
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn3.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn3.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn3.setBounds(197, 10, 85, 85);
		panel.add(jbtn3);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.setForeground(new Color(0, 0, 128));
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn5.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn5.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn5.setBounds(102, 99, 85, 85);
		panel.add(jbtn5);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.setForeground(new Color(0, 0, 128));
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn4.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn4.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn4.setBounds(10, 99, 85, 85);
		panel.add(jbtn4);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.setForeground(new Color(0, 0, 128));
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn6.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn6.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn6.setBounds(197, 99, 85, 85);
		panel.add(jbtn6);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.setForeground(new Color(0, 0, 128));
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn8.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn8.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn8.setBounds(102, 194, 85, 85);
		panel.add(jbtn8);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.setForeground(new Color(0, 0, 128));
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn7.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn7.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn7.setBounds(10, 194, 85, 85);
		panel.add(jbtn7);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.setForeground(new Color(0, 0, 128));
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn9.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn9.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn9.setBounds(197, 194, 85, 85);
		panel.add(jbtn9);
		
		JButton jbtn10 = new JButton("0");
		jbtn10.setForeground(new Color(0, 0, 128));
		jbtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtxtCash.getText();
				
				if (EnterNumber == "")
				{
					jtxtCash.setText(jbtn10.getText());
				}
				else 
				{
					EnterNumber = jtxtCash.getText() + jbtn10.getText();
					jtxtCash.setText(EnterNumber);
				}
			}
		});
		jbtn10.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn10.setBounds(102, 289, 85, 85);
		panel.add(jbtn10);
		
		JButton jbtn11 = new JButton(".");
		jbtn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! jtxtCash.getText().contains(".")) {
					jtxtCash.setText(jtxtCash.getText() + jbtn11.getText());
				}
			}
		});
		jbtn11.setForeground(new Color(0, 0, 128));
		jbtn11.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn11.setBounds(10, 289, 85, 85);
		panel.add(jbtn11);
		
		JButton jbtn12 = new JButton("C");
		jbtn12.setForeground(new Color(0, 0, 128));
		jbtn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtCash.setText(null);
				jtxtChange.setText(null);
				
			}
		});
		jbtn12.setFont(new Font("Tahoma", Font.PLAIN, 50));
		jbtn12.setBounds(197, 289, 85, 85);
		panel.add(jbtn12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(576, 10, 838, 386);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton jbtnThali = new JButton("Thali 70/-");
		jbtnThali.setForeground(new Color(0, 0, 128));
		jbtnThali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 70;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Thali","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnThali.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnThali.setBounds(10, 10, 155, 111);
		panel_1.add(jbtnThali);
		
		JButton JbtnPparatha = new JButton("PaneerParatha 30");
		JbtnPparatha.setForeground(new Color(0, 0, 128));
		JbtnPparatha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 30;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Paneer Paratha","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnPparatha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JbtnPparatha.setBounds(10, 131, 155, 111);
		panel_1.add(JbtnPparatha);
		
		JButton JbtnNoodles = new JButton("Noodles 50/-");
		JbtnNoodles.setForeground(new Color(0, 0, 128));
		JbtnNoodles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 50;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Noodles","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnNoodles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnNoodles.setBounds(10, 252, 155, 111);
		panel_1.add(JbtnNoodles);
		
		JButton jbtnFriedRice = new JButton("FriedRice 50/-");
		jbtnFriedRice.setForeground(new Color(0, 0, 128));
		jbtnFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 50;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Fried Rice","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jbtnFriedRice.setBounds(175, 10, 155, 111);
		panel_1.add(jbtnFriedRice);
		
		JButton JbtnSamosa = new JButton("Samosa 10/-");
		JbtnSamosa.setForeground(new Color(0, 0, 128));
		JbtnSamosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 10;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Samosa","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnSamosa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnSamosa.setBounds(175, 131, 155, 111);
		panel_1.add(JbtnSamosa);
		
		JButton JbtnDosa = new JButton("Dosa 60/-");
		JbtnDosa.setForeground(new Color(0, 0, 128));
		JbtnDosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Dosa","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnDosa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnDosa.setBounds(175, 252, 155, 111);
		panel_1.add(JbtnDosa);
		
		JButton JbtnBathura = new JButton("Bathura 50/-");
		JbtnBathura.setForeground(new Color(0, 0, 128));
		JbtnBathura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 50;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Bathura","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnBathura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnBathura.setBounds(340, 10, 155, 111);
		panel_1.add(JbtnBathura);
		
		JButton JbtnPoha = new JButton("Poha 30/-");
		JbtnPoha.setForeground(new Color(0, 0, 128));
		JbtnPoha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 30;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Poha","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnPoha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnPoha.setBounds(340, 131, 155, 111);
		panel_1.add(JbtnPoha);
		
		JButton JbtnLassi = new JButton("Lassi 40/-");
		JbtnLassi.setForeground(new Color(0, 0, 128));
		JbtnLassi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Lassi","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnLassi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnLassi.setBounds(340, 252, 155, 111);
		panel_1.add(JbtnLassi);
		
		JButton JbtnCurdRice = new JButton("CurdRice 40/-");
		JbtnCurdRice.setForeground(new Color(0, 0, 128));
		JbtnCurdRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Curd Rice","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnCurdRice.setFont(new Font("Tahoma", Font.PLAIN, 19));
		JbtnCurdRice.setBounds(505, 10, 155, 111);
		panel_1.add(JbtnCurdRice);
		
		JButton JbtnRoti = new JButton("Roti 5/-");
		JbtnRoti.setForeground(new Color(0, 0, 128));
		JbtnRoti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 5;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Roti","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnRoti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnRoti.setBounds(505, 131, 155, 111);
		panel_1.add(JbtnRoti);
		
		JButton JbtnCoke = new JButton("Coke 20/-");
		JbtnCoke.setForeground(new Color(0, 0, 128));
		JbtnCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 20;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Coke","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnCoke.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnCoke.setBounds(505, 252, 155, 111);
		panel_1.add(JbtnCoke);
		
		JButton JbtnMparatha = new JButton("Mixed Paratha 25");
		JbtnMparatha.setForeground(new Color(0, 0, 128));
		JbtnMparatha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 25;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Mixed Paratha","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnMparatha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JbtnMparatha.setBounds(673, 10, 155, 111);
		panel_1.add(JbtnMparatha);
		
		JButton JbtnPaneer = new JButton("PaneerButter 100");
		JbtnPaneer.setForeground(new Color(0, 0, 128));
		JbtnPaneer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 100;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Paneer Masala","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnPaneer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JbtnPaneer.setBounds(673, 131, 155, 111);
		panel_1.add(JbtnPaneer);
		
		JButton JbtnCoffee = new JButton("Coffee 30/-");
		JbtnCoffee.setForeground(new Color(0, 0, 128));
		JbtnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 30;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Coffee","1",PriceOfItem});
				ItemCost();
			}
		});
		JbtnCoffee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JbtnCoffee.setBounds(673, 252, 155, 111);
		panel_1.add(JbtnCoffee);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 460, 1406, 277);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setForeground(new Color(240, 255, 240));
		panel_3_1.setBackground(new Color(0, 0, 128));
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(36, 10, 604, 257);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cash");
		lblNewLabel_1_1.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(25, 139, 162, 29);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblTotal_1 = new JLabel("Change");
		lblTotal_1.setForeground(new Color(240, 255, 240));
		lblTotal_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal_1.setBounds(24, 199, 182, 29);
		panel_3_1.add(lblTotal_1);
		
		jtxtCash = new JTextField();
		jtxtCash.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtCash.setColumns(10);
		jtxtCash.setBounds(384, 131, 185, 43);
		panel_3_1.add(jtxtCash);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(384, 191, 185, 43);
		panel_3_1.add(jtxtChange);
		
		JLabel lblTotal_1_1 = new JLabel("Payment Type");
		lblTotal_1_1.setForeground(new Color(240, 255, 240));
		lblTotal_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal_1_1.setBounds(25, 83, 182, 29);
		panel_3_1.add(lblTotal_1_1);
		
		JComboBox cmbxPay = new JComboBox();
		cmbxPay.setModel(new DefaultComboBoxModel(new String[] {"","Cash", "UPI", "Credit Card", "Debit Card"}));
		cmbxPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		cmbxPay.setBounds(384, 83, 184, 39);
		panel_3_1.add(cmbxPay);
		
		JLabel lblTotal_1_1_1 = new JLabel("Total");
		lblTotal_1_1_1.setForeground(new Color(240, 255, 240));
		lblTotal_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal_1_1_1.setBounds(25, 28, 182, 29);
		panel_3_1.add(lblTotal_1_1_1);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(384, 14, 185, 43);
		panel_3_1.add(jtxtTotal);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(0, 0, 128));
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBounds(687, 10, 709, 257);
		panel_2.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JButton jbtnPay = new JButton("Pay");
		jbtnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cmbxPay.getSelectedItem().equals("Cash"));
				{
					change();
				}
			}
		});
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPay.setBounds(37, 31, 170, 85);
		panel_3_2.add(jbtnPay);
		
		JButton jbtnPrint = new JButton("Reciept");
		jbtnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Printing in Progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try {
					table.print(JTable.PrintMode.NORMAL,header,footer);
				}
				catch(java.awt.print.PrinterException e1)
				{
					System.err.format("No Printer founud", e1.getMessage());
				}
			}
		});
		jbtnPrint.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPrint.setBounds(271, 31, 170, 85);
		panel_3_2.add(jbtnPrint);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtCash.setText(null);
				jtxtChange.setText(null);
				jtxtTotal.setText(null);
				
				DefaultTableModel Table = (DefaultTableModel) table.getModel();
				Table.setRowCount(0);
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnReset.setBounds(485, 31, 199, 85);
		panel_3_2.add(jbtnReset);
		
		JButton jbtnRemove = new JButton("Remove Item");
		jbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int RemoveItem = table.getSelectedRow();
				if (RemoveItem >=0)
				{
					model.removeRow(RemoveItem);
				}
				
				ItemCost();
				
				if (cmbxPay.getSelectedItem().equals("Cash"));
				{
					change();
				}
			}
		});
		jbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnRemove.setBounds(37, 150, 296, 85);
		panel_3_2.add(jbtnRemove);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Close");
				if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "Bill Payment",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION	)
				System.exit(0);
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnExit.setBounds(388, 150, 296, 85);
		panel_3_2.add(jbtnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(318, 10, 241, 386);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 128));
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Items", "Quantity", "Price"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(115);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		scrollPane.setViewportView(table);
	}
}
