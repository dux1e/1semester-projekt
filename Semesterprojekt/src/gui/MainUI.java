package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainUI {

	private JFrame frame;
	private JTextField txtFindProducts;
	private JTextField txtFindCustomers;
	private JTextField txtFindEmployees;
	private JButton buttonSeachCustomer;
	private JButton buttonSeachEmployee;
	private JScrollPane panelSearchResults;
	private JList list;
	private JTabbedPane panelTabs;
	private JPanel tabSale;
	private JPanel tabStorage;
	private JPanel tabPurchasing;
	private JLabel labelLogin;
	private JLabel labelCustomerField;
	private JLabel labelEmployeeField;
	private JLabel labelProductField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel Buttons;
	private JButton ButtonEndSale;
	private JButton ButtonPrintInvoice;
	private JPanel infoPanel;
	private JPanel orderPanel;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel labelTotalNoVat;
	private JLabel labelVat;
	private JLabel labelTotal;
	private JLabel labelTotalNoVatAmount;
	private JLabel labelVatAmount;
	private JLabel labelTotalAmount;
	private JPanel customerInfo;
	private JPanel privateCustomerInfo;
	private JPanel OtherInfo;
	private JPanel productInfo;
	private JPanel employeeInfo;
	private JPanel OrderlineInfo;
	private JLabel labelDiscount;
	private JLabel labelDiscountAmount;
	private JButton buttonGiveTotalDiscount;
	private JLabel labelDiscountInPercent;
	private JTextField txtFieldDiscountInPercent;
	private JLabel labelDiscountInDkk;
	private JTextField txtFieldDiscountInDkk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
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
	public MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1001, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelSeach = new JPanel();
		frame.getContentPane().add(panelSeach, BorderLayout.WEST);
		GridBagLayout gbl_panelSeach = new GridBagLayout();
		gbl_panelSeach.columnWidths = new int[]{10, 0, 0, 0, 10, 0};
		gbl_panelSeach.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 10, 0};
		gbl_panelSeach.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelSeach.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panelSeach.setLayout(gbl_panelSeach);
		
		labelProductField = new JLabel("Varer:");
		GridBagConstraints gbc_labelProductField = new GridBagConstraints();
		gbc_labelProductField.insets = new Insets(0, 0, 5, 5);
		gbc_labelProductField.anchor = GridBagConstraints.EAST;
		gbc_labelProductField.gridx = 1;
		gbc_labelProductField.gridy = 1;
		panelSeach.add(labelProductField, gbc_labelProductField);
		
		txtFindProducts = new JTextField();
		labelProductField.setLabelFor(txtFindProducts);
		GridBagConstraints gbc_txtFindProducts = new GridBagConstraints();
		gbc_txtFindProducts.insets = new Insets(0, 0, 5, 5);
		gbc_txtFindProducts.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFindProducts.gridx = 2;
		gbc_txtFindProducts.gridy = 1;
		panelSeach.add(txtFindProducts, gbc_txtFindProducts);
		txtFindProducts.setColumns(10);
		
		JButton buttonSeachProduct = new JButton("Søg");
		GridBagConstraints gbc_buttonSeachProduct = new GridBagConstraints();
		gbc_buttonSeachProduct.insets = new Insets(0, 0, 5, 5);
		gbc_buttonSeachProduct.gridx = 3;
		gbc_buttonSeachProduct.gridy = 1;
		panelSeach.add(buttonSeachProduct, gbc_buttonSeachProduct);
		
		labelCustomerField = new JLabel("Kunder:");
		GridBagConstraints gbc_labelCustomerField = new GridBagConstraints();
		gbc_labelCustomerField.insets = new Insets(0, 0, 5, 5);
		gbc_labelCustomerField.anchor = GridBagConstraints.EAST;
		gbc_labelCustomerField.gridx = 1;
		gbc_labelCustomerField.gridy = 2;
		panelSeach.add(labelCustomerField, gbc_labelCustomerField);
		
		txtFindCustomers = new JTextField();
		labelCustomerField.setLabelFor(txtFindCustomers);
		GridBagConstraints gbc_txtFindCustomers = new GridBagConstraints();
		gbc_txtFindCustomers.insets = new Insets(0, 0, 5, 5);
		gbc_txtFindCustomers.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFindCustomers.gridx = 2;
		gbc_txtFindCustomers.gridy = 2;
		panelSeach.add(txtFindCustomers, gbc_txtFindCustomers);
		txtFindCustomers.setColumns(10);
		
		buttonSeachCustomer = new JButton("Søg");
		GridBagConstraints gbc_buttonSeachCustomer = new GridBagConstraints();
		gbc_buttonSeachCustomer.insets = new Insets(0, 0, 5, 5);
		gbc_buttonSeachCustomer.gridx = 3;
		gbc_buttonSeachCustomer.gridy = 2;
		panelSeach.add(buttonSeachCustomer, gbc_buttonSeachCustomer);
		
		labelEmployeeField = new JLabel("Medarbejder:");
		GridBagConstraints gbc_labelEmployeeField = new GridBagConstraints();
		gbc_labelEmployeeField.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmployeeField.anchor = GridBagConstraints.EAST;
		gbc_labelEmployeeField.gridx = 1;
		gbc_labelEmployeeField.gridy = 3;
		panelSeach.add(labelEmployeeField, gbc_labelEmployeeField);
		
		txtFindEmployees = new JTextField();
		labelEmployeeField.setLabelFor(txtFindEmployees);
		GridBagConstraints gbc_txtFindEmployees = new GridBagConstraints();
		gbc_txtFindEmployees.insets = new Insets(0, 0, 5, 5);
		gbc_txtFindEmployees.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFindEmployees.gridx = 2;
		gbc_txtFindEmployees.gridy = 3;
		panelSeach.add(txtFindEmployees, gbc_txtFindEmployees);
		txtFindEmployees.setColumns(10);
		
		buttonSeachEmployee = new JButton("Søg");
		GridBagConstraints gbc_buttonSeachEmployee = new GridBagConstraints();
		gbc_buttonSeachEmployee.insets = new Insets(0, 0, 5, 5);
		gbc_buttonSeachEmployee.gridx = 3;
		gbc_buttonSeachEmployee.gridy = 3;
		panelSeach.add(buttonSeachEmployee, gbc_buttonSeachEmployee);
		
		panelSearchResults = new JScrollPane();
		GridBagConstraints gbc_panelSearchResults = new GridBagConstraints();
		gbc_panelSearchResults.insets = new Insets(0, 0, 5, 5);
		gbc_panelSearchResults.gridwidth = 3;
		gbc_panelSearchResults.fill = GridBagConstraints.BOTH;
		gbc_panelSearchResults.gridx = 1;
		gbc_panelSearchResults.gridy = 4;
		panelSeach.add(panelSearchResults, gbc_panelSearchResults);
		
		list = new JList();
		panelSearchResults.setViewportView(list);
		
		labelLogin = new JLabel("Loginoplysninger her");
		GridBagConstraints gbc_labelLogin = new GridBagConstraints();
		gbc_labelLogin.insets = new Insets(0, 0, 5, 5);
		gbc_labelLogin.gridwidth = 3;
		gbc_labelLogin.anchor = GridBagConstraints.WEST;
		gbc_labelLogin.gridx = 1;
		gbc_labelLogin.gridy = 5;
		panelSeach.add(labelLogin, gbc_labelLogin);
		
		panelTabs = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(panelTabs, BorderLayout.CENTER);
		
		tabSale = new JPanel();
		panelTabs.addTab("Salg", null, tabSale, null);
		tabSale.setLayout(new MigLayout("", "[grow][grow][]", "[grow][]"));
		
		infoPanel = new JPanel();
		tabSale.add(infoPanel, "cell 0 0,grow");
		infoPanel.setLayout(new MigLayout("", "[grow,fill]", "[grow,fill][grow,fill]"));
		
		OtherInfo = new JPanel();
		OtherInfo.setBorder(new LineBorder(Color.GRAY));
		infoPanel.add(OtherInfo, "cell 0 0,grow");
		OtherInfo.setLayout(new CardLayout(0, 0));
		
		productInfo = new JPanel();
		OtherInfo.add(productInfo, "name_8317650808799");
		
		employeeInfo = new JPanel();
		OtherInfo.add(employeeInfo, "name_8317666828699");
		
		OrderlineInfo = new JPanel();
		OtherInfo.add(OrderlineInfo, "name_8317681811799");
		
		customerInfo = new JPanel();
		customerInfo.setBorder(new LineBorder(Color.GRAY));
		infoPanel.add(customerInfo, "cell 0 1,alignx left,aligny top");
		customerInfo.setLayout(new CardLayout(0, 0));
		
		privateCustomerInfo = new JPanel();
		customerInfo.add(privateCustomerInfo, "name_8322905822600");
		privateCustomerInfo.setLayout(new CardLayout(0, 0));
		
		orderPanel = new JPanel();
		orderPanel.setBorder(new LineBorder(Color.GRAY));
		tabSale.add(orderPanel, "cell 1 0,grow");
		orderPanel.setLayout(new MigLayout("", "[grow][]", "[grow][][][][]"));
		
		scrollPane = new JScrollPane();
		orderPanel.add(scrollPane, "cell 0 0 2 1,grow");
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		labelTotalNoVat = new JLabel("Total (ekskl. moms):");
		orderPanel.add(labelTotalNoVat, "cell 0 1,alignx right");
		
		labelTotalNoVatAmount = new JLabel("0,00 kr.");
		orderPanel.add(labelTotalNoVatAmount, "cell 1 1,alignx right");
		
		labelDiscount = new JLabel("Rabat:");
		orderPanel.add(labelDiscount, "cell 0 2,alignx right");
		
		labelDiscountAmount = new JLabel("-0,00 kr.");
		orderPanel.add(labelDiscountAmount, "cell 1 2,alignx right");
		
		labelVat = new JLabel("Moms:");
		orderPanel.add(labelVat, "cell 0 3,alignx right");
		
		labelVatAmount = new JLabel("0,00 kr.");
		orderPanel.add(labelVatAmount, "cell 1 3,alignx right");
		
		labelTotal = new JLabel("Total:");
		orderPanel.add(labelTotal, "cell 0 4,alignx right");
		
		labelTotalAmount = new JLabel("0,00 kr.");
		orderPanel.add(labelTotalAmount, "cell 1 4,alignx right");
		
		Buttons = new JPanel();
		Buttons.setBorder(new LineBorder(Color.GRAY));
		tabSale.add(Buttons, "cell 2 0,alignx left,growy");
		GridBagLayout gbl_Buttons = new GridBagLayout();
		gbl_Buttons.columnWidths = new int[]{10, 0, 0, 10, 0};
		gbl_Buttons.rowHeights = new int[]{1, 0, 0, 0, 10, 0, 23, 10, 0};
		gbl_Buttons.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_Buttons.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Buttons.setLayout(gbl_Buttons);
		
		labelDiscountInDkk = new JLabel("Rabat i kr.");
		GridBagConstraints gbc_labelDiscountInDkk = new GridBagConstraints();
		gbc_labelDiscountInDkk.anchor = GridBagConstraints.EAST;
		gbc_labelDiscountInDkk.insets = new Insets(0, 0, 5, 5);
		gbc_labelDiscountInDkk.gridx = 1;
		gbc_labelDiscountInDkk.gridy = 1;
		Buttons.add(labelDiscountInDkk, gbc_labelDiscountInDkk);
		
		txtFieldDiscountInDkk = new JTextField();
		GridBagConstraints gbc_txtFieldDiscountInDkk = new GridBagConstraints();
		gbc_txtFieldDiscountInDkk.insets = new Insets(0, 0, 5, 5);
		gbc_txtFieldDiscountInDkk.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFieldDiscountInDkk.gridx = 2;
		gbc_txtFieldDiscountInDkk.gridy = 1;
		Buttons.add(txtFieldDiscountInDkk, gbc_txtFieldDiscountInDkk);
		txtFieldDiscountInDkk.setColumns(10);
		
		labelDiscountInPercent = new JLabel("Rabat i %");
		GridBagConstraints gbc_labelDiscountInPercent = new GridBagConstraints();
		gbc_labelDiscountInPercent.anchor = GridBagConstraints.EAST;
		gbc_labelDiscountInPercent.insets = new Insets(0, 0, 5, 5);
		gbc_labelDiscountInPercent.gridx = 1;
		gbc_labelDiscountInPercent.gridy = 2;
		Buttons.add(labelDiscountInPercent, gbc_labelDiscountInPercent);
		
		txtFieldDiscountInPercent = new JTextField();
		GridBagConstraints gbc_txtFieldDiscountInPercent = new GridBagConstraints();
		gbc_txtFieldDiscountInPercent.insets = new Insets(0, 0, 5, 5);
		gbc_txtFieldDiscountInPercent.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFieldDiscountInPercent.gridx = 2;
		gbc_txtFieldDiscountInPercent.gridy = 2;
		Buttons.add(txtFieldDiscountInPercent, gbc_txtFieldDiscountInPercent);
		txtFieldDiscountInPercent.setColumns(10);
		
		buttonGiveTotalDiscount = new JButton("Giv samlet rabat");
		GridBagConstraints gbc_buttonGiveTotalDiscount = new GridBagConstraints();
		gbc_buttonGiveTotalDiscount.gridwidth = 2;
		gbc_buttonGiveTotalDiscount.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonGiveTotalDiscount.insets = new Insets(0, 0, 5, 5);
		gbc_buttonGiveTotalDiscount.gridx = 1;
		gbc_buttonGiveTotalDiscount.gridy = 3;
		Buttons.add(buttonGiveTotalDiscount, gbc_buttonGiveTotalDiscount);
		
		ButtonPrintInvoice = new JButton("Print faktura");
		GridBagConstraints gbc_ButtonPrintInvoice = new GridBagConstraints();
		gbc_ButtonPrintInvoice.gridwidth = 2;
		gbc_ButtonPrintInvoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_ButtonPrintInvoice.insets = new Insets(0, 0, 5, 5);
		gbc_ButtonPrintInvoice.anchor = GridBagConstraints.SOUTH;
		gbc_ButtonPrintInvoice.gridx = 1;
		gbc_ButtonPrintInvoice.gridy = 5;
		Buttons.add(ButtonPrintInvoice, gbc_ButtonPrintInvoice);
		
		ButtonEndSale = new JButton("Afslut køb");
		GridBagConstraints gbc_ButtonEndSale = new GridBagConstraints();
		gbc_ButtonEndSale.gridwidth = 2;
		gbc_ButtonEndSale.insets = new Insets(0, 0, 5, 5);
		gbc_ButtonEndSale.fill = GridBagConstraints.BOTH;
		gbc_ButtonEndSale.gridx = 1;
		gbc_ButtonEndSale.gridy = 6;
		Buttons.add(ButtonEndSale, gbc_ButtonEndSale);
		
		tabStorage = new JPanel();
		panelTabs.addTab("Lager", null, tabStorage, null);
		tabStorage.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("Ikke implementeret endnu...");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tabStorage.add(lblNewLabel);
		
		tabPurchasing = new JPanel();
		panelTabs.addTab("Indkøb", null, tabPurchasing, null);
		tabPurchasing.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_1 = new JLabel("Ikke implementeret endnu...");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tabPurchasing.add(lblNewLabel_1);
	}

}
