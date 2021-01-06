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
import javax.swing.JSeparator;
import java.awt.Dimension;

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
	private JLabel labelBusinessCustomerCprValue;
	private JLabel labelBusinessCustomerTelephone;
	private JLabel labelBusinessCustomerTelephoneValue;
	private JLabel labelBusinessCustomerEmail;
	private JLabel labelBusinessCustomerEmailValue;
	private JSeparator separator_1;
	private JLabel labelPrivateCustomerMinimumDiscount_1;
	private JLabel labelPrivateCustomerMinimumDiscountValue_1;
	private JLabel labelPrivateCustomerMaximumDiscount_1;
	private JLabel labelPrivateCustomerMaximumDiscountValue_1;
	private JLabel labelPrivateCustomerMaximumCredit_1;
	private JLabel labelPrivateCustomerMaximumCreditValue_1;
	private JLabel labelPrivateCustomerUnusedCredit_1;
	private JLabel labelPrivateCustomerUnusedCreditValue_1;
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
	private JButton buttonProductGiveDiscount;
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
	private JLabel labelPrivateCustomerMinimumDiscount_2;
	private JLabel labelPrivateCustomerMinimumDiscountValue_2;
	private JLabel labelPrivateCustomerMaximumDiscount_2;
	private JLabel labelPrivateCustomerMaximumDiscountValue_2;
	private JLabel labelPrivateCustomerMaximumCredit_2;
	private JLabel labelPrivateCustomerMaximumCreditValue_2;
	private JLabel labelPrivateCustomerUnusedCredit_2;
	private JLabel labelPrivateCustomerUnusedCreditValue_2;
	private JPanel businessCustomerInfo_1;
	private JLabel labelBusinessCustomerID_1;
	private JLabel labelBusinessCustomerIDValue_1;
	private JLabel labelBusinessCustomerFirmName_1;
	private JLabel labelBusinessCustomerFirmNameValue_1;
	private JLabel labelBusinessCustomerCvr_1;
	private JLabel labelBusinessCustomerCprValue_1;
	private JSeparator separator_6;
	private JLabel labelBusinessCustomerName_1;
	private JLabel labelBusinessCustomerNameValue_1;
	private JLabel labelBusinessCustomerTelephone_1;
	private JLabel labelBusinessCustomerTelephoneValue_1;
	private JLabel labelBusinessCustomerEmail_1;
	private JLabel labelBusinessCustomerEmailValue_1;
	private JSeparator separator_7;
	private JLabel labelPrivateCustomerMinimumDiscount_3;
	private JLabel labelPrivateCustomerMinimumDiscountValue_3;
	private JLabel labelPrivateCustomerMaximumDiscount_3;
	private JLabel labelPrivateCustomerMaximumDiscountValue_3;
	private JLabel labelPrivateCustomerMaximumCredit_3;
	private JLabel labelPrivateCustomerMaximumCreditValue_3;
	private JLabel labelPrivateCustomerUnusedCredit_3;
	private JLabel labelPrivateCustomerUnusedCreditValue_3;
	private JSeparator separator_8;
	private JButton buttonBusinessCustomerAddToOrder;
	private JSeparator separator_9;
	private JButton buttonPrivateCustomerAddToOrder;

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
		frame.setBounds(100, 100, 1000, 600);
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
		tabSale.setLayout(new MigLayout("", "[grow][grow][]", "[grow]"));
		
		infoPanel = new JPanel();
		tabSale.add(infoPanel, "cell 0 0,grow");
		infoPanel.setLayout(new MigLayout("", "[grow,fill]", "[grow,fill][fill]"));
		
		OtherInfo = new JPanel();
		OtherInfo.setBorder(new LineBorder(Color.GRAY));
		infoPanel.add(OtherInfo, "cell 0 0,grow");
		OtherInfo.setLayout(new CardLayout(0, 0));
		
		productInfo = new JPanel();
		OtherInfo.add(productInfo, "name_8317650808799");
		productInfo.setLayout(new MigLayout("", "[right][10px:n][right][][grow]", "[][][][][][][][][][][][]"));
		
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
		productInfo.add(labelProductStorageStatus, "cell 0 4");
		
		labelProductStorageStatusValue = new JLabel("ukendt");
		productInfo.add(labelProductStorageStatusValue, "cell 2 4");
		
		labelProductLocation = new JLabel("Lokation:");
		productInfo.add(labelProductLocation, "cell 0 5");
		
		labelProductLocationValue = new JLabel("ukendt");
		productInfo.add(labelProductLocationValue, "cell 2 5");
		
		separator_4 = new JSeparator();
		separator_4.setForeground(Color.GRAY);
		productInfo.add(separator_4, "cell 0 6 5 1,growx");
		
		labelProductDiscountInDkk = new JLabel("Rabat i kr.:");
		productInfo.add(labelProductDiscountInDkk, "cell 0 8,alignx trailing");
		
		txtFieldProductDiscountInDkk = new JTextField();
		productInfo.add(txtFieldProductDiscountInDkk, "cell 2 8 2 1,growx");
		txtFieldProductDiscountInDkk.setColumns(10);
		
		labelProductDiscountInPercent = new JLabel("Rabat i %:");
		productInfo.add(labelProductDiscountInPercent, "cell 0 9,alignx trailing");
		
		txtFieldProductDiscountInPercent = new JTextField();
		productInfo.add(txtFieldProductDiscountInPercent, "cell 2 9 2 1,growx");
		txtFieldProductDiscountInPercent.setColumns(10);
		
		buttonProductGiveDiscount = new JButton("Giv Rabat");
		productInfo.add(buttonProductGiveDiscount, "cell 0 10 4 1,growx");
		
		buttonProductAddToOrder = new JButton("Tilføj til ordre");
		productInfo.add(buttonProductAddToOrder, "cell 0 11 4 1,growx");
		
		privateCustomerInfo_1 = new JPanel();
		OtherInfo.add(privateCustomerInfo_1, "name_600343852600");
		privateCustomerInfo_1.setLayout(new MigLayout("", "[48px,right][10px:n][33px,right][grow][1px]", "[14px][][][][][][][][][][][]"));
		
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
		privateCustomerInfo_1.add(separator_5, "cell 0 5 4 1,growx,aligny center");
		
		labelPrivateCustomerMinimumDiscount_2 = new JLabel("Minimum rabat:");
		privateCustomerInfo_1.add(labelPrivateCustomerMinimumDiscount_2, "cell 0 6,aligny top");
		
		labelPrivateCustomerMinimumDiscountValue_2 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerMinimumDiscountValue_2, "cell 2 6,aligny top");
		
		labelPrivateCustomerMaximumDiscount_2 = new JLabel("Maksimal rabat:");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumDiscount_2, "cell 0 7,aligny top");
		
		labelPrivateCustomerMaximumDiscountValue_2 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumDiscountValue_2, "cell 2 7,aligny top");
		
		labelPrivateCustomerMaximumCredit_2 = new JLabel("Maksimal kredit:");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumCredit_2, "cell 0 8,aligny top");
		
		labelPrivateCustomerMaximumCreditValue_2 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerMaximumCreditValue_2, "cell 2 8,aligny top");
		
		labelPrivateCustomerUnusedCredit_2 = new JLabel("Tilbagestående kredit:");
		privateCustomerInfo_1.add(labelPrivateCustomerUnusedCredit_2, "cell 0 9,aligny top");
		
		labelPrivateCustomerUnusedCreditValue_2 = new JLabel("ukendt");
		privateCustomerInfo_1.add(labelPrivateCustomerUnusedCreditValue_2, "cell 2 9,aligny top");
		
		separator_9 = new JSeparator();
		privateCustomerInfo_1.add(separator_9, "cell 0 10 4 1,growx");
		
		buttonPrivateCustomerAddToOrder = new JButton("Tilføj til ordre");
		privateCustomerInfo_1.add(buttonPrivateCustomerAddToOrder, "cell 0 11 3 1,growx");
		
		businessCustomerInfo_1 = new JPanel();
		OtherInfo.add(businessCustomerInfo_1, "name_963075195100");
		businessCustomerInfo_1.setLayout(new MigLayout("", "[48px,right][10px:n][33px,right][57px,grow]", "[14px][][][][][][][][][][][][][]"));
		
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
		
		labelBusinessCustomerCprValue_1 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelBusinessCustomerCprValue_1, "cell 2 2,aligny top");
		
		separator_6 = new JSeparator();
		separator_6.setForeground(Color.GRAY);
		businessCustomerInfo_1.add(separator_6, "cell 0 3 4 1,growx,aligny center");
		
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
		businessCustomerInfo_1.add(separator_7, "cell 0 7 4 1,growx,aligny center");
		
		labelPrivateCustomerMinimumDiscount_3 = new JLabel("Minimum rabat:");
		businessCustomerInfo_1.add(labelPrivateCustomerMinimumDiscount_3, "cell 0 8,aligny top");
		
		labelPrivateCustomerMinimumDiscountValue_3 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelPrivateCustomerMinimumDiscountValue_3, "cell 2 8,aligny top");
		
		labelPrivateCustomerMaximumDiscount_3 = new JLabel("Maksimal rabat:");
		businessCustomerInfo_1.add(labelPrivateCustomerMaximumDiscount_3, "cell 0 9,aligny top");
		
		labelPrivateCustomerMaximumDiscountValue_3 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelPrivateCustomerMaximumDiscountValue_3, "cell 2 9,aligny top");
		
		labelPrivateCustomerMaximumCredit_3 = new JLabel("Maksimal kredit:");
		businessCustomerInfo_1.add(labelPrivateCustomerMaximumCredit_3, "cell 0 10,aligny top");
		
		labelPrivateCustomerMaximumCreditValue_3 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelPrivateCustomerMaximumCreditValue_3, "cell 2 10,aligny top");
		
		labelPrivateCustomerUnusedCredit_3 = new JLabel("Tilbagestående kredit:");
		businessCustomerInfo_1.add(labelPrivateCustomerUnusedCredit_3, "cell 0 11,aligny top");
		
		labelPrivateCustomerUnusedCreditValue_3 = new JLabel("ukendt");
		businessCustomerInfo_1.add(labelPrivateCustomerUnusedCreditValue_3, "cell 2 11,aligny top");
		
		separator_8 = new JSeparator();
		businessCustomerInfo_1.add(separator_8, "cell 0 12 4 1,growx");
		
		buttonBusinessCustomerAddToOrder = new JButton("Tilføj til ordre");
		businessCustomerInfo_1.add(buttonBusinessCustomerAddToOrder, "cell 0 13 3 1,growx");
		
		customerInfo = new JPanel();
		customerInfo.setBorder(new LineBorder(Color.GRAY));
		infoPanel.add(customerInfo, "cell 0 1,alignx left,aligny top");
		customerInfo.setLayout(new CardLayout(0, 0));
		
		privateCustomerInfo = new JPanel();
		customerInfo.add(privateCustomerInfo, "name_8322905822600");
		privateCustomerInfo.setLayout(new MigLayout("", "[48px,right][10px:n][33px,right][grow,fill]", "[14px][][][][][][][][][][grow]"));
		
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
		privateCustomerInfo.add(separator, "cell 0 5 4 1,growx");
		
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
		privateCustomerInfo.add(labelPrivateCustomerUnusedCredit, "cell 0 9");
		
		labelPrivateCustomerUnusedCreditValue = new JLabel("ukendt");
		privateCustomerInfo.add(labelPrivateCustomerUnusedCreditValue, "cell 2 9,alignx right");
		
		businessCustomerInfo = new JPanel();
		customerInfo.add(businessCustomerInfo, "name_12834471710700");
		businessCustomerInfo.setLayout(new MigLayout("", "[48px,right][10px:n][33px,right][29px,grow][1px]", "[14px][][][][][][][][][][][]"));
		
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
		
		labelBusinessCustomerCprValue = new JLabel("ukendt");
		businessCustomerInfo.add(labelBusinessCustomerCprValue, "cell 2 2,aligny top");
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		businessCustomerInfo.add(separator_2, "cell 0 3 4 1,growx");
		
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
		businessCustomerInfo.add(separator_1, "cell 0 7 4 1,growx,aligny center");
		
		labelPrivateCustomerMinimumDiscount_1 = new JLabel("Minimum rabat:");
		businessCustomerInfo.add(labelPrivateCustomerMinimumDiscount_1, "cell 0 8,aligny top");
		
		labelPrivateCustomerMinimumDiscountValue_1 = new JLabel("ukendt");
		businessCustomerInfo.add(labelPrivateCustomerMinimumDiscountValue_1, "cell 2 8,aligny top");
		
		labelPrivateCustomerMaximumDiscount_1 = new JLabel("Maksimal rabat:");
		businessCustomerInfo.add(labelPrivateCustomerMaximumDiscount_1, "cell 0 9,aligny top");
		
		labelPrivateCustomerMaximumDiscountValue_1 = new JLabel("ukendt");
		businessCustomerInfo.add(labelPrivateCustomerMaximumDiscountValue_1, "cell 2 9,aligny top");
		
		labelPrivateCustomerMaximumCredit_1 = new JLabel("Maksimal kredit:");
		businessCustomerInfo.add(labelPrivateCustomerMaximumCredit_1, "cell 0 10,aligny top");
		
		labelPrivateCustomerMaximumCreditValue_1 = new JLabel("ukendt");
		businessCustomerInfo.add(labelPrivateCustomerMaximumCreditValue_1, "cell 2 10,aligny top");
		
		labelPrivateCustomerUnusedCredit_1 = new JLabel("Tilbagestående kredit:");
		businessCustomerInfo.add(labelPrivateCustomerUnusedCredit_1, "cell 0 11,aligny top");
		
		labelPrivateCustomerUnusedCreditValue_1 = new JLabel("ukendt");
		businessCustomerInfo.add(labelPrivateCustomerUnusedCreditValue_1, "cell 2 11,aligny top");
		
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
		Buttons.setLayout(new MigLayout("", "[50px][5px][86px]", "[grow][20px][20px][23px][2px][23px][23px]"));
		
		labelDiscountInDkk = new JLabel("Rabat i kr.");
		Buttons.add(labelDiscountInDkk, "cell 0 1,alignx right,aligny center");
		
		txtFieldDiscountInDkk = new JTextField();
		Buttons.add(txtFieldDiscountInDkk, "cell 2 1,growx,aligny center");
		txtFieldDiscountInDkk.setColumns(10);
		
		labelDiscountInPercent = new JLabel("Rabat i %");
		Buttons.add(labelDiscountInPercent, "cell 0 2,alignx right,aligny center");
		
		txtFieldDiscountInPercent = new JTextField();
		Buttons.add(txtFieldDiscountInPercent, "cell 2 2,growx,aligny center");
		txtFieldDiscountInPercent.setColumns(10);
		
		buttonGiveTotalDiscount = new JButton("Giv samlet rabat");
		Buttons.add(buttonGiveTotalDiscount, "cell 0 3 3 1,growx,aligny center");
		
		separator_3 = new JSeparator();
		separator_3.setForeground(Color.GRAY);
		Buttons.add(separator_3, "cell 0 4 3 1,growx,aligny center");
		
		ButtonPrintInvoice = new JButton("Print faktura");
		Buttons.add(ButtonPrintInvoice, "cell 0 5 3 1,growx,aligny bottom");
		
		ButtonEndSale = new JButton("Afslut køb");
		Buttons.add(ButtonEndSale, "cell 0 6 3 1,grow");
		
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
