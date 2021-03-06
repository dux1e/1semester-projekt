package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.DefaultListModel;

import controller.*;
import model.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class MainUI {

	private JFrame frame;
	private JTextField txtFieldFindProducts;
	private JTextField txtFieldFindCustomers;
	private JTextField txtFieldFindEmployees;
	private JButton buttonSeachCustomer;
	private JButton buttonSeachEmployee;
	private JScrollPane panelSearchResults;
	private JList<Listable> list;
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
	private JLabel labelDiscount;
	private JLabel labelDiscountAmount;
	private JButton buttonGiveTotalDiscount;
	private JLabel labelDiscountInPercent;
	private JTextField txtFieldDiscountInPercent;
	private JLabel labelDiscountInDkk;
	private JTextField txtFieldDiscountInDkk;
	private JPanel businessCustomerInfo;
	private JLabel labelPrivateCustomerID;
	private JLabel labelPrivateCustomerIDValue;
	private JLabel labelPrivateCustomerName;
	private JLabel labelPrivateCustomerNameValue;
	private JLabel labelPrivateCustomerCpr;
	private JLabel labelPrivateCustomerCprValue;
	private JLabel labelPrivateCustomerTelephone;
	private JLabel labelPrivateCustomerTelephoneValue;
	private JLabel labelPrivateCustomerEmail;
	private JLabel labelPrivateCustomerEmailValue;
	private JSeparator separator;
	private JLabel labelPrivateCustomerMinimumDiscount;
	private JLabel labelPrivateCustomerMinimumDiscountValue;
	private JLabel labelPrivateCustomerMaximumDiscount;
	private JLabel labelPrivateCustomerMaximumCredit;
	private JLabel labelPrivateCustomerUnusedCredit;
	private JLabel labelPrivateCustomerMaximumDiscountValue;
	private JLabel labelPrivateCustomerMaximumCreditValue;
	private JLabel labelPrivateCustomerUnusedCreditValue;
	private JLabel labelBusinessCustomerID;
	private JLabel labelBusinessCustomerIDValue;
	private JLabel labelBusinessCustomerFirmName;
	private JLabel labelBusinessCustomerFirmNameValue;
	private JLabel labelBusinessCustomerCvr;
	private JLabel labelBusinessCustomerCvrValue;
	private JLabel labelBusinessCustomerTelephone;
	private JLabel labelBusinessCustomerTelephoneValue;
	private JLabel labelBusinessCustomerEmail;
	private JLabel labelBusinessCustomerEmailValue;
	private JSeparator separator_1;
	private JLabel labelBusinessCustomerMinimumDiscount;
	private JLabel labelBusinessCustomerMinimumDiscountValue;
	private JLabel labelBusinessCustomerMaximumDiscount;
	private JLabel labelBusinessCustomerMaximumDiscountValue;
	private JLabel labelBusinessCustomerMaximumCredit;
	private JLabel labelBusinessCustomerMaximumCreditValue;
	private JLabel labelBusinessCustomerUnusedCredit;
	private JLabel labelBusinessCustomerUnusedCreditValue;
	private JSeparator separator_2;
	private JLabel labelBusinessCustomerName;
	private JLabel labelBusinessCustomerNameValue;
	private JSeparator separator_3;
	private JLabel labelProductDescription;
	private JLabel labelProductDescriptionValue;
	private JLabel labelProductID;
	private JLabel labelProductIDValue;
	private JLabel labelProductCatalogPrice;
	private JLabel labelProductCostPrice;
	private JLabel labelProductStorageStatus;
	private JLabel labelProductLocation;
	private JLabel labelProductCatalogPriceValue;
	private JLabel labelProductCostPriceValue;
	private JLabel labelProductStorageStatusValue;
	private JLabel labelProductLocationValue;
	private JLabel labelProductDiscountInPercent;
	private JLabel labelProductDiscountInDkk;
	private JTextField txtFieldProductDiscountInDkk;
	private JTextField txtFieldProductDiscountInPercent;
	private JButton buttonProductAddToOrder;
	private JSeparator separator_4;
	private JPanel privateCustomerInfo_1;
	private JLabel labelPrivateCustomerID_1;
	private JLabel labelPrivateCustomerIDValue_1;
	private JLabel labelPrivateCustomerName_1;
	private JLabel labelPrivateCustomerNameValue_1;
	private JLabel labelPrivateCustomerCpr_1;
	private JLabel labelPrivateCustomerCprValue_1;
	private JLabel labelPrivateCustomerTelephone_1;
	private JLabel labelPrivateCustomerTelephoneValue_1;
	private JLabel labelPrivateCustomerEmail_1;
	private JLabel labelPrivateCustomerEmailValue_1;
	private JSeparator separator_5;
	private JLabel labelPrivateCustomerMinimumDiscount_1;
	private JLabel labelPrivateCustomerMinimumDiscountValue_1;
	private JLabel labelPrivateCustomerMaximumDiscount_1;
	private JLabel labelPrivateCustomerMaximumDiscountValue_1;
	private JLabel labelPrivateCustomerMaximumCredit_1;
	private JLabel labelPrivateCustomerMaximumCreditValue_1;
	private JLabel labelPrivateCustomerUnusedCredit_1;
	private JLabel labelPrivateCustomerUnusedCreditValue_1;
	private JPanel businessCustomerInfo_1;
	private JLabel labelBusinessCustomerID_1;
	private JLabel labelBusinessCustomerIDValue_1;
	private JLabel labelBusinessCustomerFirmName_1;
	private JLabel labelBusinessCustomerFirmNameValue_1;
	private JLabel labelBusinessCustomerCvr_1;
	private JLabel labelBusinessCustomerCvrValue_1;
	private JSeparator separator_6;
	private JLabel labelBusinessCustomerName_1;
	private JLabel labelBusinessCustomerNameValue_1;
	private JLabel labelBusinessCustomerTelephone_1;
	private JLabel labelBusinessCustomerTelephoneValue_1;
	private JLabel labelBusinessCustomerEmail_1;
	private JLabel labelBusinessCustomerEmailValue_1;
	private JSeparator separator_7;
	private JLabel labelBusinessCustomerMinimumDiscount_1;
	private JLabel labelBusinessCustomerMinimumDiscountValue_1;
	private JLabel labelBusinessCustomerMaximumDiscount_1;
	private JLabel labelBusinessCustomerMaximumDiscountValue_1;
	private JLabel labelBusinessCustomerMaximumCredit_1;
	private JLabel labelBusinessCustomerMaximumCreditValue_1;
	private JLabel labelBusinessCustomerUnusedCredit_1;
	private JLabel labelBusinessCustomerUnusedCreditValue_1;
	private JSeparator separator_8;
	private JButton buttonBusinessCustomerAddToOrder;
	private JSeparator separator_9;
	private JButton buttonPrivateCustomerAddToOrder;
	private JLabel labelOrderNo;
	private JTextField txtFieldProductQuantity;
	private JLabel labelProductQuantity;
	private Object currentOtherInfo;
	private JPanel orderLineInfo;
	private JLabel labelOrderLineProductDescription;
	private JLabel labelOrderLineProductDescriptionValue;
	private JLabel labelOrderLineProductID;
	private JLabel labelOrderLineProductIDValue;
	private JLabel labelOrderLineProductCatalogPrice;
	private JLabel labelOrderLineProductCatalogPriceValue;
	private JLabel labelOrderLineProductCostPrice;
	private JLabel labelOrderLineProductCostPriceValue;
	private JLabel labelOrderLineProductStorageStatus;
	private JLabel labelOrderLineProductStorageStatusValue;
	private JLabel labelOrderLineProductLocation;
	private JLabel labelOrderLineProductLocationValue;
	private JSeparator separator_10;
	private JLabel labelOrderLineProductDiscountInDkk;
	private JTextField txtFieldOrderLineProductDiscountInDkk;
	private JLabel labelOrderLineProductDiscountInPercent;
	private JTextField txtFieldOrderLineProductDiscountInPercent;
	private JLabel labelOrderLineQuantity;
	private JTextField txtFieldOrderLineQuantity;
	private JButton buttonOrderLineUpdate;
	private JSeparator separator_11;
	private JSeparator separator_12;
	private JButton buttonOrderLineDelete;
	private JPanel emptyOtherInfo;
	private JPanel emptyCustomerInfo;
	
	private OrderController orderController;
	private DefaultListModel<Listable> listRepresentation;
	private OrderLineTableModel oltm;
	private JButton btnNewButton;
	private JSeparator separator_13;


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
		// adds information
		orderController = new OrderController();
		CustomerController customerController = orderController.getCustomerController();
		Employee e = new Employee("1204890000", "Bo Billy", "", 88888887, "Bo@Billigt.dk", "kodeord321");
		ProductController productController = orderController.getProductController();
		EmployeeController ec = new EmployeeController();
		
		ec.setCurrentEmployee(e);
		orderController.setEmployeeController(ec);
		productController.addProduct(4444, "Hammer", "Bahco", 75, 25, 10, 100);
		productController.addProduct(8500, "Lysstofrør", "Philips", 10, 8.5, 100, 1000);
		customerController.addBusinessCustomer(12345678, "Pepsi Cola", "Hele Verdens gade 42, Danmark, 9440 Aabybro",
				"DK12345678", "Pepsi Man", 87654321, "Pepsi@Cool.com");
		customerController.addPrivateCustomer("5555554444", "Ip Skrå", "Skæve Kløftens Vej 1, Danmark, 9600 Aars",
				77777771, "OpAd@Bakke.uk");
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.currentOtherInfo = null;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
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
		
		txtFieldFindProducts = new JTextField();
		txtFieldFindProducts.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldFindProducts.selectAll();
			}
		});
		txtFieldFindProducts.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String input = txtFieldFindProducts.getText();
				updateList("product", input);
			}
		});
		labelProductField.setLabelFor(txtFieldFindProducts);
		GridBagConstraints gbc_txtFieldFindProducts = new GridBagConstraints();
		gbc_txtFieldFindProducts.insets = new Insets(0, 0, 5, 5);
		gbc_txtFieldFindProducts.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFieldFindProducts.gridx = 2;
		gbc_txtFieldFindProducts.gridy = 1;
		panelSeach.add(txtFieldFindProducts, gbc_txtFieldFindProducts);
		txtFieldFindProducts.setColumns(10);
		
		JButton buttonSeachProduct = new JButton("Søg");
		buttonSeachProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String input = txtFieldFindProducts.getText();
				updateList("product", input);
			}
		});
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
		
		txtFieldFindCustomers = new JTextField();
		txtFieldFindCustomers.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldFindCustomers.selectAll();
			}
		});
		txtFieldFindCustomers.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String input = txtFieldFindCustomers.getText();
				updateList("customer", input);
			}
		});
		labelCustomerField.setLabelFor(txtFieldFindCustomers);
		GridBagConstraints gbc_txtFieldFindCustomers = new GridBagConstraints();
		gbc_txtFieldFindCustomers.insets = new Insets(0, 0, 5, 5);
		gbc_txtFieldFindCustomers.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFieldFindCustomers.gridx = 2;
		gbc_txtFieldFindCustomers.gridy = 2;
		panelSeach.add(txtFieldFindCustomers, gbc_txtFieldFindCustomers);
		txtFieldFindCustomers.setColumns(10);
		
		buttonSeachCustomer = new JButton("Søg");
		buttonSeachCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String input = txtFieldFindCustomers.getText();
				updateList("customer", input);
			}
		});
		GridBagConstraints gbc_buttonSeachCustomer = new GridBagConstraints();
		gbc_buttonSeachCustomer.insets = new Insets(0, 0, 5, 5);
		gbc_buttonSeachCustomer.gridx = 3;
		gbc_buttonSeachCustomer.gridy = 2;
		panelSeach.add(buttonSeachCustomer, gbc_buttonSeachCustomer);
		
		labelEmployeeField = new JLabel("Medarbejder:");
		labelEmployeeField.setEnabled(false);
		GridBagConstraints gbc_labelEmployeeField = new GridBagConstraints();
		gbc_labelEmployeeField.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmployeeField.anchor = GridBagConstraints.EAST;
		gbc_labelEmployeeField.gridx = 1;
		gbc_labelEmployeeField.gridy = 3;
		panelSeach.add(labelEmployeeField, gbc_labelEmployeeField);
		
		txtFieldFindEmployees = new JTextField();
		txtFieldFindEmployees.setEnabled(false);
		labelEmployeeField.setLabelFor(txtFieldFindEmployees);
		GridBagConstraints gbc_txtFieldFindEmployees = new GridBagConstraints();
		gbc_txtFieldFindEmployees.insets = new Insets(0, 0, 5, 5);
		gbc_txtFieldFindEmployees.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFieldFindEmployees.gridx = 2;
		gbc_txtFieldFindEmployees.gridy = 3;
		panelSeach.add(txtFieldFindEmployees, gbc_txtFieldFindEmployees);
		txtFieldFindEmployees.setColumns(10);
		
		buttonSeachEmployee = new JButton("Søg");
		buttonSeachEmployee.setEnabled(false);
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
		
		list = new JList<>();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Object o = list.getSelectedValue();
				currentOtherInfo = o;
				resetTxtFieldsProduct();
				showInfoFromObject(o);
			}
		});
		initializeList();
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
		tabSale.setLayout(new MigLayout("", "[grow][grow][]", "[grow]"));
		
		infoPanel = new JPanel();
		tabSale.add(infoPanel, "cell 0 0,grow");
		infoPanel.setLayout(new MigLayout("", "[grow,fill]", "[grow,fill][fill]"));
		
		OtherInfo = new JPanel();
		OtherInfo.setBorder(null);
		infoPanel.add(OtherInfo, "cell 0 0,grow");
		OtherInfo.setLayout(new CardLayout(0, 0));
		
		emptyOtherInfo = new JPanel();
		emptyOtherInfo.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Info", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		OtherInfo.add(emptyOtherInfo, "empty");
		
		productInfo = new JPanel();
		productInfo.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Produkt info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OtherInfo.add(productInfo, "model.Product");
		productInfo.setLayout(new MigLayout("", "[right][10px:n][right][grow]", "[][][][][][][][grow][][][][][]"));
		
		labelProductDescription = new JLabel("Beskrivelse:");
		productInfo.add(labelProductDescription, "cell 0 0");
		
		labelProductDescriptionValue = new JLabel("ukendt");
		productInfo.add(labelProductDescriptionValue, "cell 2 0");
		
		labelProductID = new JLabel("Produkt ID:");
		productInfo.add(labelProductID, "cell 0 1");
		
		labelProductIDValue = new JLabel("ukendt");
		productInfo.add(labelProductIDValue, "cell 2 1");
		
		labelProductCatalogPrice = new JLabel("Listepris:");
		productInfo.add(labelProductCatalogPrice, "cell 0 2");
		
		labelProductCatalogPriceValue = new JLabel("ukendt");
		productInfo.add(labelProductCatalogPriceValue, "cell 2 2");
		
		labelProductCostPrice = new JLabel("Indkøbspris:");
		productInfo.add(labelProductCostPrice, "cell 0 3");
		
		labelProductCostPriceValue = new JLabel("ukendt");
		productInfo.add(labelProductCostPriceValue, "cell 2 3");
		
		labelProductStorageStatus = new JLabel("Lagerstatus:");
		labelProductStorageStatus.setEnabled(false);
		productInfo.add(labelProductStorageStatus, "cell 0 4");
		
		labelProductStorageStatusValue = new JLabel("ukendt");
		labelProductStorageStatusValue.setEnabled(false);
		productInfo.add(labelProductStorageStatusValue, "cell 2 4");
		
		labelProductLocation = new JLabel("Lokation:");
		labelProductLocation.setEnabled(false);
		productInfo.add(labelProductLocation, "cell 0 5");
		
		labelProductLocationValue = new JLabel("ukendt");
		labelProductLocationValue.setEnabled(false);
		productInfo.add(labelProductLocationValue, "cell 2 5");
		
		separator_4 = new JSeparator();
		separator_4.setForeground(Color.GRAY);
		productInfo.add(separator_4, "cell 0 6 5 1,growx");
		
		labelProductDiscountInDkk = new JLabel("Rabat i kr.:");
		productInfo.add(labelProductDiscountInDkk, "cell 0 8,alignx trailing");
		
		txtFieldProductDiscountInDkk = new JTextField();
		txtFieldProductDiscountInDkk.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldProductDiscountInDkk.selectAll();
			}
		});
		txtFieldProductDiscountInDkk.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txtFieldProductDiscountInPercent.setText("0.0");
			}
		});
		txtFieldProductDiscountInDkk.setText("0.0");
		productInfo.add(txtFieldProductDiscountInDkk, "cell 2 8 2 1,growx");
		txtFieldProductDiscountInDkk.setColumns(10);
		
		labelProductDiscountInPercent = new JLabel("Rabat i %:");
		productInfo.add(labelProductDiscountInPercent, "cell 0 9,alignx trailing");
		
		txtFieldProductDiscountInPercent = new JTextField();
		txtFieldProductDiscountInPercent.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldProductDiscountInPercent.selectAll();
			}
		});
		txtFieldProductDiscountInPercent.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txtFieldProductDiscountInDkk.setText("0.0");
			}
		});
		txtFieldProductDiscountInPercent.setText("0.0");
		productInfo.add(txtFieldProductDiscountInPercent, "cell 2 9 2 1,growx");
		txtFieldProductDiscountInPercent.setColumns(10);
		
		buttonProductAddToOrder = new JButton("Tilføj til ordre");
		buttonProductAddToOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Product p = (Product) currentOtherInfo;
				addProductToOrder(p);
			}
		});
		
		separator_12 = new JSeparator();
		separator_12.setForeground(Color.GRAY);
		productInfo.add(separator_12, "cell 0 10 4 1,growx");
		
		labelProductQuantity = new JLabel("Antal:");
		productInfo.add(labelProductQuantity, "cell 0 11");
		
		txtFieldProductQuantity = new JTextField();
		txtFieldProductQuantity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldProductQuantity.selectAll();
			}
		});
		txtFieldProductQuantity.setText("1");
		productInfo.add(txtFieldProductQuantity, "cell 2 11 2 1,growx");
		txtFieldProductQuantity.setColumns(10);
		productInfo.add(buttonProductAddToOrder, "cell 0 12 4 1,growx");
		
		privateCustomerInfo_1 = new JPanel();
		privateCustomerInfo_1.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Private kunde info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OtherInfo.add(privateCustomerInfo_1, "model.PrivateCustomer");
		privateCustomerInfo_1.setLayout(new MigLayout("", "[right][10px:n][right][grow]", "[14px][][][][][][][][][][][grow][]"));
		
		labelPrivateCustomerID_1 = new JLabel("Kunde ID:");
		privateCustomerInfo_1.add(labelPrivateCustomerID_1, "cell 0 0,aligny top");
		
		labelPrivateCustomerIDValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerIDValue_1, "cell 2 0,aligny top");
		
		labelPrivateCustomerName_1 = new JLabel("Navn:");
		privateCustomerInfo_1.add(labelPrivateCustomerName_1, "cell 0 1,aligny top");
		
		labelPrivateCustomerNameValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerNameValue_1, "cell 2 1,aligny top");
		
		labelPrivateCustomerCpr_1 = new JLabel("CPR:");
		privateCustomerInfo_1.add(labelPrivateCustomerCpr_1, "cell 0 2,aligny top");
		
		labelPrivateCustomerCprValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerCprValue_1, "cell 2 2,aligny top");
		
		labelPrivateCustomerTelephone_1 = new JLabel("Telefon:");
		privateCustomerInfo_1.add(labelPrivateCustomerTelephone_1, "cell 0 3,aligny top");
		
		labelPrivateCustomerTelephoneValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerTelephoneValue_1, "cell 2 3,aligny top");
		
		labelPrivateCustomerEmail_1 = new JLabel("E-mail:");
		privateCustomerInfo_1.add(labelPrivateCustomerEmail_1, "cell 0 4,aligny top");
		
		labelPrivateCustomerEmailValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerEmailValue_1, "cell 2 4,aligny top");
		
		separator_5 = new JSeparator();
		separator_5.setForeground(Color.GRAY);
		separator_5.setBackground(Color.WHITE);
		privateCustomerInfo_1.add(separator_5, "cell 0 5 5 1,growx,aligny center");
		
		labelPrivateCustomerMinimumDiscount_1 = new JLabel("Minimum rabat:");
		privateCustomerInfo_1.add(labelPrivateCustomerMinimumDiscount_1, "cell 0 6,aligny top");
		
		labelPrivateCustomerMinimumDiscountValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerMinimumDiscountValue_1, "cell 2 6,aligny top");
		
		labelPrivateCustomerMaximumDiscount_1 = new JLabel("Maksimal rabat:");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumDiscount_1, "cell 0 7,aligny top");
		
		labelPrivateCustomerMaximumDiscountValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumDiscountValue_1, "cell 2 7,aligny top");
		
		labelPrivateCustomerMaximumCredit_1 = new JLabel("Maksimal kredit:");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumCredit_1, "cell 0 8,aligny top");
		
		labelPrivateCustomerMaximumCreditValue_1 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumCreditValue_1, "cell 2 8,aligny top");
		
		labelPrivateCustomerUnusedCredit_1 = new JLabel("Tilbagestående kredit:");
		labelPrivateCustomerUnusedCredit_1.setEnabled(false);
		privateCustomerInfo_1.add(labelPrivateCustomerUnusedCredit_1, "cell 0 9,aligny top");
		
		labelPrivateCustomerUnusedCreditValue_1 = new JLabel("ukendt");
		labelPrivateCustomerUnusedCreditValue_1.setEnabled(false);
		privateCustomerInfo_1.add(labelPrivateCustomerUnusedCreditValue_1, "cell 2 9,aligny top");
		
		separator_9 = new JSeparator();
		separator_9.setForeground(Color.GRAY);
		privateCustomerInfo_1.add(separator_9, "cell 0 10 5 1,growx");
		
		buttonPrivateCustomerAddToOrder = new JButton("Tilføj til ordre");
		buttonPrivateCustomerAddToOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonPrivateCustomerAddToOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Customer c = (Customer) currentOtherInfo;
				addCustomerToOrder(c);
			}
		});
		privateCustomerInfo_1.add(buttonPrivateCustomerAddToOrder, "cell 0 12 4 1,growx");
		
		businessCustomerInfo_1 = new JPanel();
		businessCustomerInfo_1.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Erhvervs kunde info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OtherInfo.add(businessCustomerInfo_1, "model.BusinessCustomer");
		businessCustomerInfo_1.setLayout(new MigLayout("", "[right][10px:n][right][grow]", "[14px][][][][][][][][][][][][][grow][]"));
		
		labelBusinessCustomerID_1 = new JLabel("Kunde ID:");
		businessCustomerInfo_1.add(labelBusinessCustomerID_1, "cell 0 0,aligny top");
		
		labelBusinessCustomerIDValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerIDValue_1, "cell 2 0,aligny top");
		
		labelBusinessCustomerFirmName_1 = new JLabel("Firma navn:");
		businessCustomerInfo_1.add(labelBusinessCustomerFirmName_1, "cell 0 1,aligny top");
		
		labelBusinessCustomerFirmNameValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerFirmNameValue_1, "cell 2 1,aligny top");
		
		labelBusinessCustomerCvr_1 = new JLabel("CVR:");
		businessCustomerInfo_1.add(labelBusinessCustomerCvr_1, "cell 0 2,aligny top");
		
		labelBusinessCustomerCvrValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerCvrValue_1, "cell 2 2,aligny top");
		
		separator_6 = new JSeparator();
		separator_6.setForeground(Color.GRAY);
		businessCustomerInfo_1.add(separator_6, "cell 0 3 5 1,growx,aligny center");
		
		labelBusinessCustomerName_1 = new JLabel("Navn:");
		businessCustomerInfo_1.add(labelBusinessCustomerName_1, "cell 0 4,aligny top");
		
		labelBusinessCustomerNameValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerNameValue_1, "cell 2 4,aligny top");
		
		labelBusinessCustomerTelephone_1 = new JLabel("Telefon:");
		businessCustomerInfo_1.add(labelBusinessCustomerTelephone_1, "cell 0 5,aligny top");
		
		labelBusinessCustomerTelephoneValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerTelephoneValue_1, "cell 2 5,aligny top");
		
		labelBusinessCustomerEmail_1 = new JLabel("E-mail:");
		businessCustomerInfo_1.add(labelBusinessCustomerEmail_1, "cell 0 6,aligny top");
		
		labelBusinessCustomerEmailValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerEmailValue_1, "cell 2 6,aligny top");
		
		separator_7 = new JSeparator();
		separator_7.setForeground(Color.GRAY);
		separator_7.setBackground(Color.WHITE);
		businessCustomerInfo_1.add(separator_7, "cell 0 7 5 1,growx,aligny center");
		
		labelBusinessCustomerMinimumDiscount_1 = new JLabel("Minimum rabat:");
		businessCustomerInfo_1.add(labelBusinessCustomerMinimumDiscount_1, "cell 0 8,aligny top");
		
		labelBusinessCustomerMinimumDiscountValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerMinimumDiscountValue_1, "cell 2 8,aligny top");
		
		labelBusinessCustomerMaximumDiscount_1 = new JLabel("Maksimal rabat:");
		businessCustomerInfo_1.add(labelBusinessCustomerMaximumDiscount_1, "cell 0 9,aligny top");
		
		labelBusinessCustomerMaximumDiscountValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerMaximumDiscountValue_1, "cell 2 9,aligny top");
		
		labelBusinessCustomerMaximumCredit_1 = new JLabel("Maksimal kredit:");
		businessCustomerInfo_1.add(labelBusinessCustomerMaximumCredit_1, "cell 0 10,aligny top");
		
		labelBusinessCustomerMaximumCreditValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerMaximumCreditValue_1, "cell 2 10,aligny top");
		
		labelBusinessCustomerUnusedCredit_1 = new JLabel("Tilbagestående kredit:");
		labelBusinessCustomerUnusedCredit_1.setEnabled(false);
		businessCustomerInfo_1.add(labelBusinessCustomerUnusedCredit_1, "cell 0 11,aligny top");
		
		labelBusinessCustomerUnusedCreditValue_1 = new JLabel("ukendt");
		labelBusinessCustomerUnusedCreditValue_1.setEnabled(false);
		businessCustomerInfo_1.add(labelBusinessCustomerUnusedCreditValue_1, "cell 2 11,aligny top");
		
		separator_8 = new JSeparator();
		separator_8.setForeground(Color.GRAY);
		businessCustomerInfo_1.add(separator_8, "cell 0 12 5 1,growx");
		
		buttonBusinessCustomerAddToOrder = new JButton("Tilføj til ordre");
		buttonBusinessCustomerAddToOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonBusinessCustomerAddToOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Customer c = (Customer) currentOtherInfo;
				addCustomerToOrder(c);
			}
		});
		businessCustomerInfo_1.add(buttonBusinessCustomerAddToOrder, "cell 0 14 4 1,growx");
		
		orderLineInfo = new JPanel();
		orderLineInfo.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Ordrelinje info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OtherInfo.add(orderLineInfo, "model.OrderLine");
		orderLineInfo.setLayout(new MigLayout("", "[57px,right][10px:n][33px,right][grow]", "[][][][][][][][grow][][][][][][]"));
		
		labelOrderLineProductDescription = new JLabel("Beskrivelse:");
		orderLineInfo.add(labelOrderLineProductDescription, "cell 0 0");
		
		labelOrderLineProductDescriptionValue = new JLabel("ukendt");
		orderLineInfo.add(labelOrderLineProductDescriptionValue, "cell 2 0");
		
		labelOrderLineProductID = new JLabel("Produkt ID:");
		orderLineInfo.add(labelOrderLineProductID, "cell 0 1");
		
		labelOrderLineProductIDValue = new JLabel("ukendt");
		orderLineInfo.add(labelOrderLineProductIDValue, "cell 2 1");
		
		labelOrderLineProductCatalogPrice = new JLabel("Listepris:");
		orderLineInfo.add(labelOrderLineProductCatalogPrice, "cell 0 2");
		
		labelOrderLineProductCatalogPriceValue = new JLabel("ukendt");
		orderLineInfo.add(labelOrderLineProductCatalogPriceValue, "cell 2 2");
		
		labelOrderLineProductCostPrice = new JLabel("Indkøbspris:");
		orderLineInfo.add(labelOrderLineProductCostPrice, "cell 0 3");
		
		labelOrderLineProductCostPriceValue = new JLabel("ukendt");
		orderLineInfo.add(labelOrderLineProductCostPriceValue, "cell 2 3");
		
		labelOrderLineProductStorageStatus = new JLabel("Lagerstatus:");
		labelOrderLineProductStorageStatus.setEnabled(false);
		orderLineInfo.add(labelOrderLineProductStorageStatus, "cell 0 4");
		
		labelOrderLineProductStorageStatusValue = new JLabel("ukendt");
		labelOrderLineProductStorageStatusValue.setEnabled(false);
		orderLineInfo.add(labelOrderLineProductStorageStatusValue, "cell 2 4");
		
		labelOrderLineProductLocation = new JLabel("Lokation:");
		labelOrderLineProductLocation.setEnabled(false);
		orderLineInfo.add(labelOrderLineProductLocation, "cell 0 5");
		
		labelOrderLineProductLocationValue = new JLabel("ukendt");
		labelOrderLineProductLocationValue.setEnabled(false);
		orderLineInfo.add(labelOrderLineProductLocationValue, "cell 2 5");
		
		separator_10 = new JSeparator();
		separator_10.setForeground(Color.GRAY);
		orderLineInfo.add(separator_10, "cell 0 6 4 1,growx");
		
		labelOrderLineProductDiscountInDkk = new JLabel("Rabat i kr.:");
		orderLineInfo.add(labelOrderLineProductDiscountInDkk, "cell 0 8");
		
		txtFieldOrderLineProductDiscountInDkk = new JTextField();
		txtFieldOrderLineProductDiscountInDkk.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txtFieldOrderLineProductDiscountInPercent.setText("0.0");
			}
		});
		txtFieldOrderLineProductDiscountInDkk.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldOrderLineProductDiscountInDkk.selectAll();
			}
		});
		txtFieldOrderLineProductDiscountInDkk.setColumns(10);
		orderLineInfo.add(txtFieldOrderLineProductDiscountInDkk, "cell 2 8 2 1,growx");
		
		labelOrderLineProductDiscountInPercent = new JLabel("Rabat i %:");
		orderLineInfo.add(labelOrderLineProductDiscountInPercent, "cell 0 9");
		
		txtFieldOrderLineProductDiscountInPercent = new JTextField();
		txtFieldOrderLineProductDiscountInPercent.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txtFieldOrderLineProductDiscountInDkk.setText("0.0");
			}
		});
		txtFieldOrderLineProductDiscountInPercent.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldOrderLineProductDiscountInPercent.selectAll();
			}
		});
		txtFieldOrderLineProductDiscountInPercent.setColumns(10);
		orderLineInfo.add(txtFieldOrderLineProductDiscountInPercent, "cell 2 9 2 1,growx");
		
		separator_11 = new JSeparator();
		separator_11.setForeground(Color.GRAY);
		orderLineInfo.add(separator_11, "cell 0 10 4 1,growx");
		
		labelOrderLineQuantity = new JLabel("Antal:");
		orderLineInfo.add(labelOrderLineQuantity, "cell 0 11");
		
		txtFieldOrderLineQuantity = new JTextField();
		txtFieldOrderLineQuantity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFieldOrderLineQuantity.selectAll();
			}
		});
		txtFieldOrderLineQuantity.setText("1");
		txtFieldOrderLineQuantity.setColumns(10);
		orderLineInfo.add(txtFieldOrderLineQuantity, "cell 2 11 2 1,growx");
		
		buttonOrderLineUpdate = new JButton("Opdater linje");
		buttonOrderLineUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderLine ol = (OrderLine) currentOtherInfo;
				updateOrderLine(ol);
			}
		});
		orderLineInfo.add(buttonOrderLineUpdate, "cell 0 12 4 1,growx");
		
		buttonOrderLineDelete = new JButton("Slet linje");
		buttonOrderLineDelete.setEnabled(false);
		buttonOrderLineDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		orderLineInfo.add(buttonOrderLineDelete, "cell 0 13 4 1,growx");
		
		customerInfo = new JPanel();
		customerInfo.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Aktive kunde", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		infoPanel.add(customerInfo, "cell 0 1,alignx left,aligny top");
		customerInfo.setLayout(new CardLayout(0, 0));
		
		emptyCustomerInfo = new JPanel();
		customerInfo.add(emptyCustomerInfo, "name_76022774072700");
		
		privateCustomerInfo = new JPanel();
		privateCustomerInfo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Privat", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		customerInfo.add(privateCustomerInfo, "model.PrivateCustomer");
		privateCustomerInfo.setLayout(new MigLayout("", "[right][10px:n][right][grow]", "[14px][][][][][][][][][][grow]"));
		
		labelPrivateCustomerID = new JLabel("Kunde ID:");
		privateCustomerInfo.add(labelPrivateCustomerID, "cell 0 0,alignx right,aligny top");
		
		labelPrivateCustomerIDValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerIDValue, "cell 2 0,alignx right,aligny top");
		
		labelPrivateCustomerName = new JLabel("Navn:");
		privateCustomerInfo.add(labelPrivateCustomerName, "cell 0 1,alignx right,aligny top");
		
		labelPrivateCustomerNameValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerNameValue, "cell 2 1,alignx right,aligny top");
		
		labelPrivateCustomerCpr = new JLabel("CPR:");
		privateCustomerInfo.add(labelPrivateCustomerCpr, "cell 0 2,alignx right,aligny top");
		
		labelPrivateCustomerCprValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerCprValue, "cell 2 2,alignx right,aligny top");
		
		labelPrivateCustomerTelephone = new JLabel("Telefon:");
		privateCustomerInfo.add(labelPrivateCustomerTelephone, "cell 0 3,alignx right,aligny top");
		
		labelPrivateCustomerTelephoneValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerTelephoneValue, "cell 2 3,alignx right,aligny top");
		
		labelPrivateCustomerEmail = new JLabel("E-mail:");
		privateCustomerInfo.add(labelPrivateCustomerEmail, "cell 0 4,alignx right,aligny top");
		
		labelPrivateCustomerEmailValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerEmailValue, "cell 2 4,alignx right,aligny top");
		
		separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		separator.setForeground(Color.GRAY);
		privateCustomerInfo.add(separator, "cell 0 5 5 1,growx");
		
		labelPrivateCustomerMinimumDiscount = new JLabel("Minimum rabat:");
		privateCustomerInfo.add(labelPrivateCustomerMinimumDiscount, "cell 0 6");
		
		labelPrivateCustomerMinimumDiscountValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerMinimumDiscountValue, "cell 2 6");
		
		labelPrivateCustomerMaximumDiscount = new JLabel("Maksimal rabat:");
		privateCustomerInfo.add(labelPrivateCustomerMaximumDiscount, "cell 0 7");
		
		labelPrivateCustomerMaximumDiscountValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerMaximumDiscountValue, "cell 2 7");
		
		labelPrivateCustomerMaximumCredit = new JLabel("Maksimal kredit:");
		privateCustomerInfo.add(labelPrivateCustomerMaximumCredit, "cell 0 8");
		
		labelPrivateCustomerMaximumCreditValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerMaximumCreditValue, "cell 2 8");
		
		labelPrivateCustomerUnusedCredit = new JLabel("Tilbagestående kredit:");
		labelPrivateCustomerUnusedCredit.setEnabled(false);
		privateCustomerInfo.add(labelPrivateCustomerUnusedCredit, "cell 0 9");
		
		labelPrivateCustomerUnusedCreditValue = new JLabel("ukendt");
		labelPrivateCustomerUnusedCreditValue.setEnabled(false);
		privateCustomerInfo.add(labelPrivateCustomerUnusedCreditValue, "cell 2 9,alignx right");
		
		businessCustomerInfo = new JPanel();
		businessCustomerInfo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Erhverv", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		customerInfo.add(businessCustomerInfo, "model.BusinessCustomer");
		businessCustomerInfo.setLayout(new MigLayout("", "[right][10px:n][right][grow]", "[14px][][][][][][][][][][][]"));
		
		labelBusinessCustomerID = new JLabel("Kunde ID:");
		businessCustomerInfo.add(labelBusinessCustomerID, "cell 0 0,aligny top");
		
		labelBusinessCustomerIDValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerIDValue, "cell 2 0,aligny top");
		
		labelBusinessCustomerFirmName = new JLabel("Firma navn:");
		businessCustomerInfo.add(labelBusinessCustomerFirmName, "cell 0 1,aligny top");
		
		labelBusinessCustomerFirmNameValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerFirmNameValue, "cell 2 1,aligny top");
		
		labelBusinessCustomerCvr = new JLabel("CVR:");
		businessCustomerInfo.add(labelBusinessCustomerCvr, "cell 0 2,aligny top");
		
		labelBusinessCustomerCvrValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerCvrValue, "cell 2 2,aligny top");
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		businessCustomerInfo.add(separator_2, "cell 0 3 5 1,growx");
		
		labelBusinessCustomerName = new JLabel("Navn:");
		businessCustomerInfo.add(labelBusinessCustomerName, "cell 0 4");
		
		labelBusinessCustomerNameValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerNameValue, "cell 2 4");
		
		labelBusinessCustomerTelephone = new JLabel("Telefon:");
		businessCustomerInfo.add(labelBusinessCustomerTelephone, "cell 0 5,aligny top");
		
		labelBusinessCustomerTelephoneValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerTelephoneValue, "cell 2 5,aligny top");
		
		labelBusinessCustomerEmail = new JLabel("E-mail:");
		businessCustomerInfo.add(labelBusinessCustomerEmail, "cell 0 6,aligny top");
		
		labelBusinessCustomerEmailValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerEmailValue, "cell 2 6,aligny top");
		
		separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBackground(Color.WHITE);
		businessCustomerInfo.add(separator_1, "cell 0 7 5 1,growx,aligny center");
		
		labelBusinessCustomerMinimumDiscount = new JLabel("Minimum rabat:");
		businessCustomerInfo.add(labelBusinessCustomerMinimumDiscount, "cell 0 8,aligny top");
		
		labelBusinessCustomerMinimumDiscountValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerMinimumDiscountValue, "cell 2 8,aligny top");
		
		labelBusinessCustomerMaximumDiscount = new JLabel("Maksimal rabat:");
		businessCustomerInfo.add(labelBusinessCustomerMaximumDiscount, "cell 0 9,aligny top");
		
		labelBusinessCustomerMaximumDiscountValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerMaximumDiscountValue, "cell 2 9,aligny top");
		
		labelBusinessCustomerMaximumCredit = new JLabel("Maksimal kredit:");
		businessCustomerInfo.add(labelBusinessCustomerMaximumCredit, "cell 0 10,aligny top");
		
		labelBusinessCustomerMaximumCreditValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerMaximumCreditValue, "cell 2 10,aligny top");
		
		labelBusinessCustomerUnusedCredit = new JLabel("Tilbagestående kredit:");
		labelBusinessCustomerUnusedCredit.setEnabled(false);
		businessCustomerInfo.add(labelBusinessCustomerUnusedCredit, "cell 0 11,aligny top");
		
		labelBusinessCustomerUnusedCreditValue = new JLabel("ukendt");
		labelBusinessCustomerUnusedCreditValue.setEnabled(false);
		businessCustomerInfo.add(labelBusinessCustomerUnusedCreditValue, "cell 2 11,aligny top");
		
		orderPanel = new JPanel();
		orderPanel.setBorder(new LineBorder(Color.GRAY));
		tabSale.add(orderPanel, "cell 1 0,grow");
		orderPanel.setLayout(new MigLayout("", "[grow][]", "[][grow][][][][]"));
		
		labelOrderNo = new JLabel("Ordrenummer: ");
		orderPanel.add(labelOrderNo, "cell 0 0 2 1");
		
		scrollPane = new JScrollPane();
		orderPanel.add(scrollPane, "cell 0 1 2 1,grow");
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object o = getSelectedOrderLine();
				currentOtherInfo = o;
				showInfoFromObject(o);
			}
		});
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		labelTotalNoVat = new JLabel("Total (ekskl. moms):");
		orderPanel.add(labelTotalNoVat, "cell 0 2,alignx right");
		
		labelTotalNoVatAmount = new JLabel("0.0");
		orderPanel.add(labelTotalNoVatAmount, "cell 1 2,alignx right");
		
		labelDiscount = new JLabel("Rabat:");
		orderPanel.add(labelDiscount, "cell 0 3,alignx right");
		
		labelDiscountAmount = new JLabel("-0.0");
		orderPanel.add(labelDiscountAmount, "cell 1 3,alignx right");
		
		labelVat = new JLabel("Moms:");
		orderPanel.add(labelVat, "cell 0 4,alignx right");
		
		labelVatAmount = new JLabel("0.0");
		orderPanel.add(labelVatAmount, "cell 1 4,alignx right");
		
		labelTotal = new JLabel("Total:");
		orderPanel.add(labelTotal, "cell 0 5,alignx right");
		
		labelTotalAmount = new JLabel("0.0");
		orderPanel.add(labelTotalAmount, "cell 1 5,alignx right");
		
		Buttons = new JPanel();
		Buttons.setBorder(new LineBorder(Color.GRAY));
		tabSale.add(Buttons, "cell 2 0,alignx left,growy");
		Buttons.setLayout(new MigLayout("", "[50px][5px][86px]", "[grow][20px][20px][23px][2px][23px][][][23px]"));
		
		labelDiscountInDkk = new JLabel("Rabat i kr.");
		labelDiscountInDkk.setEnabled(false);
		Buttons.add(labelDiscountInDkk, "cell 0 1,alignx right,aligny center");
		
		txtFieldDiscountInDkk = new JTextField();
		txtFieldDiscountInDkk.setEnabled(false);
		Buttons.add(txtFieldDiscountInDkk, "cell 2 1,growx,aligny center");
		txtFieldDiscountInDkk.setColumns(10);
		
		labelDiscountInPercent = new JLabel("Rabat i %");
		labelDiscountInPercent.setEnabled(false);
		Buttons.add(labelDiscountInPercent, "cell 0 2,alignx right,aligny center");
		
		txtFieldDiscountInPercent = new JTextField();
		txtFieldDiscountInPercent.setEnabled(false);
		Buttons.add(txtFieldDiscountInPercent, "cell 2 2,growx,aligny center");
		txtFieldDiscountInPercent.setColumns(10);
		
		buttonGiveTotalDiscount = new JButton("Giv samlet rabat");
		buttonGiveTotalDiscount.setEnabled(false);
		Buttons.add(buttonGiveTotalDiscount, "cell 0 3 3 1,growx,aligny center");
		
		separator_3 = new JSeparator();
		separator_3.setForeground(Color.GRAY);
		Buttons.add(separator_3, "cell 0 4 3 1,growx,aligny center");
		
		ButtonPrintInvoice = new JButton("Print faktura");
		ButtonPrintInvoice.setEnabled(false);
		Buttons.add(ButtonPrintInvoice, "cell 0 5 3 1,growx,aligny bottom");
		
		ButtonEndSale = new JButton("Afslut køb");
		ButtonEndSale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				endOrder();
			}
		});
		
		separator_13 = new JSeparator();
		Buttons.add(separator_13, "cell 0 6 3 1,growx");
		
		btnNewButton = new JButton("Annuller ordre");
		btnNewButton.setEnabled(false);
		Buttons.add(btnNewButton, "cell 0 7 3 1,growx");
		Buttons.add(ButtonEndSale, "cell 0 8 3 1,grow");
		
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
	
		init();
		fillCurrentCustomer();
		labelLogin.setText(orderController.getCurrentOrder().getEmployee().getName() + " er logget på");
	}

	private void initializeList() {
		ListableCellRenderer cellRenderer = new ListableCellRenderer();
		list.setCellRenderer(cellRenderer);	
	}
	
	private void updateList(String controllerChoice , String input) {
		listRepresentation = new DefaultListModel<Listable>();
		ArrayList<Listable> modelList = null;
		switch(controllerChoice) {
		case "product":
			modelList = orderController.getProductController().searchViaInput(input);
			break;
			
		case "customer":
			modelList = orderController.getCustomerController().searchViaInput(input);
			break;
		}
		
		for(Listable element : modelList) {
			listRepresentation.addElement(element);
		}
		list.setModel(listRepresentation);
	}
	
	private void showInfoFromObject(Object o) {
		if(o != null) {
			String objectType = o.getClass().getName();
			CardLayout cl = (CardLayout)(OtherInfo.getLayout());
			cl.show(OtherInfo, objectType);
			
			switch(objectType) {
			case "model.Product":
				Product p = (Product) o;
				labelProductDescriptionValue.setText(p.getDescription());
				labelProductIDValue.setText(String.valueOf(p.getBarcode()));
				labelProductCatalogPriceValue.setText(String.valueOf(p.getCatalogPrice()));
				labelProductCostPriceValue.setText(String.valueOf(p.getCostPrice()));
				break;
			
			case "model.PrivateCustomer":
				PrivateCustomer pc = (PrivateCustomer) o;
				labelPrivateCustomerNameValue_1.setText(pc.getName());
				labelPrivateCustomerIDValue_1.setText(String.valueOf(pc.getID()));
				labelPrivateCustomerCprValue_1.setText(pc.getCPR());
				labelPrivateCustomerTelephoneValue_1.setText(String.valueOf(pc.getTelephoneNo()));
				labelPrivateCustomerEmailValue_1.setText(pc.getEmail());
				labelPrivateCustomerMinimumDiscountValue_1.setText(String.valueOf(pc.getDiscountMin()));
				labelPrivateCustomerMaximumDiscountValue_1.setText(String.valueOf(pc.getDiscountMax()));
				labelPrivateCustomerMaximumCreditValue_1.setText(String.valueOf(pc.getCredit()));
				break;
				
			case "model.BusinessCustomer":
				BusinessCustomer bc = (BusinessCustomer) o;
				labelBusinessCustomerFirmNameValue_1.setText(bc.getName());
				labelBusinessCustomerIDValue_1.setText(String.valueOf(bc.getID()));
				labelBusinessCustomerCvrValue_1.setText(String.valueOf(bc.getCVR()));
				labelBusinessCustomerNameValue_1.setText(bc.getContactName());
				labelBusinessCustomerTelephoneValue_1.setText(String.valueOf(bc.getContactTelephoneNo()));
				labelBusinessCustomerEmailValue_1.setText(bc.getContactEmail());
				labelBusinessCustomerMinimumDiscountValue_1.setText(String.valueOf(bc.getDiscountMin()));
				labelBusinessCustomerMaximumDiscountValue_1.setText(String.valueOf(bc.getDiscountMax()));
				labelBusinessCustomerMaximumCreditValue_1.setText(String.valueOf(bc.getCredit()));
				break;
			
			case "model.OrderLine":
				OrderLine ol = (OrderLine) o;
				labelOrderLineProductDescriptionValue.setText(ol.getProduct().getDescription());
				labelOrderLineProductIDValue.setText(String.valueOf(ol.getProduct().getBarcode()));
				labelOrderLineProductCatalogPriceValue.setText(String.valueOf(ol.getProduct().getCatalogPrice()));
				labelOrderLineProductCostPriceValue.setText(String.valueOf(ol.getProduct().getCostPrice()));
				txtFieldOrderLineProductDiscountInDkk.setText(String.valueOf(ol.getDiscountFlat()));
				txtFieldOrderLineProductDiscountInPercent.setText(String.valueOf(ol.getDiscountPercent()));
				txtFieldOrderLineQuantity.setText(String.valueOf(ol.getQuantity()));
				
			}
		}
	}
	
	private OrderLine getSelectedOrderLine() {
		int row = table.getSelectedRow();
		OrderLine currentOl = null;
		if (row >= 0) {
			currentOl = oltm.getOrderLine(row); 
		}
		return currentOl;
	}
	
	private void init() {
		orderController.createOrder();
		String nextOrderNo = String.valueOf(OrderContainer.getInstance().getOrders().size());
		labelOrderNo.setText("Ordrenummer:   " + nextOrderNo);
		fillTable();
		
		// sets info panel to the empty card
		CardLayout cl = (CardLayout)(OtherInfo.getLayout());
		cl.show(OtherInfo, "empty");
		
	}
	
	private void fillTable() {
		oltm = new OrderLineTableModel();
		this.table.setModel(oltm);
		List<OrderLine> data = orderController.getCurrentOrder().getOrderLines();
		oltm.setData(data);
	}
	
	private int findQuantity(JTextField txtF) {
		String quantityString = txtF.getText();
		int quantity = 0;
		try {
			quantity = Integer.parseInt(quantityString);
		} catch(NumberFormatException ee) {
			quantity = 1;
		}
		
		if(quantity < 1) {
			quantity = 1;
		}
		
		return quantity;
	}
	
	private double findDiscount(JTextField txtF) {
		String discountString = txtF.getText();
		double discount = 0;
		try {
			discount = Double.parseDouble(discountString);
		} catch(NumberFormatException ee) {
			discount = 0.0;
		}
		
		if(discount < 0.0) {
			discount = 0.0;
		}
		
		return discount;
	}
	
	private void resetTxtFieldsProduct() {
		txtFieldProductDiscountInDkk.setText("0.0");
		txtFieldProductDiscountInPercent.setText("0.0");
		txtFieldProductQuantity.setText("1");
	}
	
	private void addProductToOrder(Product p) {
		int quantity = findQuantity(txtFieldProductQuantity);
		double discountFlat = findDiscount(txtFieldProductDiscountInDkk);
		double discountPercent = findDiscount(txtFieldProductDiscountInPercent);
		this.orderController.addProduct(p, quantity, discountFlat, discountPercent);
		resetTxtFieldsProduct();
		fillTable();
		fillPrice();
	}
	
	private void updateOrderLine(OrderLine ol) {
		int quantity = findQuantity(txtFieldOrderLineQuantity);
		double discountFlat = findDiscount(txtFieldOrderLineProductDiscountInDkk);
		double discountPercent = findDiscount(txtFieldOrderLineProductDiscountInPercent);
		ol.setQuantity(quantity);
		ol.setDiscountFlat(discountFlat);
		ol.setDiscountPercent(discountPercent);
		Order currentOrder = orderController.getCurrentOrder();
		currentOrder.calculateTotals();
		fillTable();
		fillPrice();
	}
	
//	private void deleteOrderLine(OrderLine ol) {
//		fillTable();
//	}
	
	private void endOrder() {
		try{
			orderController.endOrder();
		} catch(IllegalStateException e) {
			JOptionPane.showMessageDialog(new JFrame(), "Der skal være tilføjet mindst et produkt for at afslutte en ordre.");
		}
		init();
		fillPrice();
	}
	
	private void fillCurrentCustomer() {
		Customer c = orderController.getCurrentOrder().getCustomer();
		String customerType = c.getClass().getName();
		
		CardLayout cl = (CardLayout)(customerInfo.getLayout());
		cl.show(customerInfo, customerType);
		
		switch(customerType) {
		case "model.PrivateCustomer":
			PrivateCustomer pc = (PrivateCustomer) c;
			labelPrivateCustomerNameValue.setText(pc.getName());
			labelPrivateCustomerIDValue.setText(String.valueOf(pc.getID()));
			labelPrivateCustomerCprValue.setText(pc.getCPR());
			labelPrivateCustomerTelephoneValue.setText(String.valueOf(pc.getTelephoneNo()));
			labelPrivateCustomerEmailValue.setText(pc.getEmail());
			labelPrivateCustomerMinimumDiscountValue.setText(String.valueOf(pc.getDiscountMin()));
			labelPrivateCustomerMaximumDiscountValue.setText(String.valueOf(pc.getDiscountMax()));
			labelPrivateCustomerMaximumCreditValue.setText(String.valueOf(pc.getCredit()));
			break;
		
		case "model.BusinessCustomer":
			BusinessCustomer bc = (BusinessCustomer) c;
			labelBusinessCustomerFirmNameValue.setText(bc.getName());
			labelBusinessCustomerIDValue.setText(String.valueOf(bc.getID()));
			labelBusinessCustomerCvrValue.setText(String.valueOf(bc.getCVR()));
			labelBusinessCustomerNameValue.setText(bc.getContactName());
			labelBusinessCustomerTelephoneValue.setText(String.valueOf(bc.getContactTelephoneNo()));
			labelBusinessCustomerEmailValue.setText(bc.getContactEmail());
			labelBusinessCustomerMinimumDiscountValue.setText(String.valueOf(bc.getDiscountMin()));
			labelBusinessCustomerMaximumDiscountValue.setText(String.valueOf(bc.getDiscountMax()));
			labelBusinessCustomerMaximumCreditValue.setText(String.valueOf(bc.getCredit()));
			break;
		}
	}
	
	private void addCustomerToOrder(Customer c) {
		orderController.addCustomer(c);
		fillCurrentCustomer();
	}
	
	private void fillPrice() {
		Order activeOrder = orderController.getCurrentOrder();
		double totalNet = activeOrder.getNetTotal();
		double totalDiscount = activeOrder.calculateDiscount();
		double totalVat = activeOrder.getVatTotal();
		labelTotalNoVatAmount.setText(String.valueOf(totalNet));
		labelDiscountAmount.setText(String.valueOf(totalDiscount));
		labelVatAmount.setText(String.valueOf(totalVat));
		labelTotalAmount.setText(String.valueOf(totalNet + totalVat));
		
	}
}
