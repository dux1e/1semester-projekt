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
	private JPanel Content;
	private JButton ButtonEndSale;
	private JButton ButtonPrintInvoice;
	private JTable table;
	private JPanel PanelInfo;
	private JPanel ProductInfo;
	private JPanel CustomerInfo;
	private JPanel EmployeeInfo;

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
		frame.setBounds(100, 100, 1000, 500);
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
		tabSale.setLayout(new BorderLayout(0, 0));
		
		Buttons = new JPanel();
		tabSale.add(Buttons, BorderLayout.EAST);
		GridBagLayout gbl_Buttons = new GridBagLayout();
		gbl_Buttons.columnWidths = new int[]{10, 89, 10, 0};
		gbl_Buttons.rowHeights = new int[]{1, 382, 23, 10, 0};
		gbl_Buttons.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Buttons.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		Buttons.setLayout(gbl_Buttons);
		
		ButtonPrintInvoice = new JButton("Print faktura");
		GridBagConstraints gbc_ButtonPrintInvoice = new GridBagConstraints();
		gbc_ButtonPrintInvoice.insets = new Insets(0, 0, 5, 5);
		gbc_ButtonPrintInvoice.anchor = GridBagConstraints.SOUTHWEST;
		gbc_ButtonPrintInvoice.gridx = 1;
		gbc_ButtonPrintInvoice.gridy = 1;
		Buttons.add(ButtonPrintInvoice, gbc_ButtonPrintInvoice);
		
		ButtonEndSale = new JButton("Afslut køb");
		GridBagConstraints gbc_ButtonEndSale = new GridBagConstraints();
		gbc_ButtonEndSale.insets = new Insets(0, 0, 5, 5);
		gbc_ButtonEndSale.fill = GridBagConstraints.BOTH;
		gbc_ButtonEndSale.gridx = 1;
		gbc_ButtonEndSale.gridy = 2;
		Buttons.add(ButtonEndSale, gbc_ButtonEndSale);
		
		Content = new JPanel();
		tabSale.add(Content, BorderLayout.CENTER);
		Content.setLayout(new MigLayout("", "[grow][grow]", "[433px,grow]"));
		
		PanelInfo = new JPanel();
		Content.add(PanelInfo, "cell 0 0,grow");
		PanelInfo.setLayout(new CardLayout(0, 0));
		
		ProductInfo = new JPanel();
		PanelInfo.add(ProductInfo, "name_17047061543900");
		
		CustomerInfo = new JPanel();
		PanelInfo.add(CustomerInfo, "name_17057744257600");
		
		EmployeeInfo = new JPanel();
		PanelInfo.add(EmployeeInfo, "name_17066425634800");
		
		table = new JTable();
		Content.add(table, "cell 1 0,grow");
		
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
