package koe2_MenuManager;


import java.awt.event.*;
import java.io.FileNotFoundException;
import javax.swing.*;
import javax.swing.border.*;

public class MenuManagerGUI {
	private JFrame MenuManagerWindow;
	private JLabel lblEntree, lblSide, lblSalad, lblDessert, lblCreateMenu, lblMenu, lblGenMenu, toCal, toPri;
	private JComboBox cboEntree, cboSide, cboSalad, cboDessert;
	private JButton btnCreate, btnGenR, btnDetails, btnMin, btnMax;
	private JTextArea txtTextMenus, txtTextEnt, txtTextSid, txtTextSal, txtTextDes;
	
	private JFrame frmChildWindow;
	
	private MenuManager MM;
	
	public MenuManagerGUI() throws FileNotFoundException {
		MM = new MenuManager("data/dishes.txt");
		buildMenuManagerWindow();
	}
	
	@SuppressWarnings("unchecked")
	private void buildMenuManagerWindow() {
		MenuManagerWindow = new JFrame("Menu Manager");
		MenuManagerWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuManagerWindow.setBounds(20, 20, 750, 750);
		MenuManagerWindow.setLayout(null);
		
		/*add border
		Border byom = BorderFactory.createTitledBorder("Title");
		 * JPanel panel = new JPanel();
	     	panel.setBorder(byom);
			MenuManagerWindow.getContentPane().add(panel, BorderLayout.CENTER);

		      Border blackline = BorderFactory.createTitledBorder("Title");
		      JPanel panel = new JPanel();
		      LayoutManager layout = new FlowLayout();  
		      panel.setLayout(layout);       

		      JPanel panel1 = new JPanel();
		      String spaces = "                   ";

		      panel1.add(new JLabel(spaces + "Title border to JPanel" + spaces));  
		      panel1.setBorder(blackline);

		      panel.add(panel1);
		      MenuManagerWindow.getContentPane().add(panel, BorderLayout.CENTER); 
*/
		lblCreateMenu = new JLabel("Build Your own Menu");
		lblCreateMenu.setBounds(10, 10, 200, 10);
		MenuManagerWindow.getContentPane().add(lblCreateMenu);

		// Add a label
		lblEntree = new JLabel("Entree: ");
		lblEntree.setBounds(10, 20, 80, 30);
		MenuManagerWindow.getContentPane().add(lblEntree);
		
		// Add a combo box with a list of accounts
		
		cboEntree = new JComboBox(MM.getEntrees().toArray());
		cboEntree.setBounds(lblEntree.getX() + lblEntree.getWidth(), lblEntree.getY(), 250, 30);
		MenuManagerWindow.getContentPane().add(cboEntree);
		
		// Add a textbox for withdrawal and deposit amounts
		lblSide = new JLabel("Side: ");
		lblSide.setBounds(lblEntree.getX(), lblEntree.getY() + lblEntree.getHeight() + 10, lblEntree.getWidth(), lblEntree.getHeight());
		MenuManagerWindow.getContentPane().add(lblSide);
		
		
		cboSide = new JComboBox(MM.getSides().toArray());
		cboSide.setBounds(lblSide.getX() + lblSide.getWidth(), lblSide.getY(), 250, 30);
		MenuManagerWindow.getContentPane().add(cboSide);
		
		// Add a textbox for withdrawal and deposit amounts
		lblSalad = new JLabel("Salad: ");
		lblSalad.setBounds(lblEntree.getX(), lblSide.getY() + lblEntree.getHeight() + 10, lblEntree.getWidth(), lblEntree.getHeight());
		MenuManagerWindow.getContentPane().add(lblSalad);
		
		// Add a combo box with a list of accounts
		
		cboSalad = new JComboBox(MM.getSalads().toArray());
		cboSalad.setBounds(lblSalad.getX() + lblSalad.getWidth(), lblSalad.getY(), 250, 30);
		MenuManagerWindow.getContentPane().add(cboSalad);
		
		// Add a textbox for withdrawal and deposit amounts
		lblDessert = new JLabel("Dessert: ");
		lblDessert.setBounds(lblEntree.getX(), lblSalad.getY() + lblEntree.getHeight() + 10, lblEntree.getWidth(), lblEntree.getHeight());
		MenuManagerWindow.getContentPane().add(lblDessert);
		
		// Add a combo box with a list of accounts
		
		cboDessert = new JComboBox(MM.getDesserts().toArray());
		cboDessert.setBounds(lblDessert.getX() + lblDessert.getWidth(), lblDessert.getY(), 250, 30);
		MenuManagerWindow.getContentPane().add(cboDessert);
		
		// Add buttons
		btnCreate = new JButton("Create Menu with these dishes");
		btnCreate.setBounds(lblEntree.getX(), lblDessert.getY() + lblDessert.getHeight() + 10, 300, 30);
		MenuManagerWindow.getContentPane().add(btnCreate);
		
		lblGenMenu = new JLabel("Or generate a Menu");
		lblGenMenu.setBounds(btnCreate.getX(), btnCreate.getY()+btnCreate.getHeight(), 300, 30);
		MenuManagerWindow.getContentPane().add(lblGenMenu);

		
		btnGenR = new JButton("Generate a Random Menu");
		btnGenR.setBounds(btnCreate.getX(), lblGenMenu.getY()+btnCreate.getHeight(), 300, 30);
		MenuManagerWindow.getContentPane().add(btnGenR);
		
		btnMin = new JButton("Generate a Minimum Menu");
		btnMin.setBounds(btnCreate.getX(), btnGenR.getY()+btnCreate.getHeight(), 300, 30);
		MenuManagerWindow.getContentPane().add(btnMin);
		
		btnMax = new JButton("Generate a Maximum Menu");
		btnMax.setBounds(btnCreate.getX(), btnMin.getY()+btnCreate.getHeight(), 300, 30);
		MenuManagerWindow.getContentPane().add(btnMax);
		
		lblMenu = new JLabel("Created Menus:");
		lblMenu.setBounds(360, 10, 300, 10);
		MenuManagerWindow.getContentPane().add(lblMenu);
		// Add report label
		txtTextMenus = new JTextArea();
		txtTextMenus.setBounds(360, 20, 300, 120);
		MenuManagerWindow.getContentPane().add(txtTextMenus);
		txtTextMenus.setEditable(false);


		btnDetails = new JButton("Details");
		btnDetails.setBounds(MenuManagerWindow.getX(), MenuManagerWindow.getY() + MenuManagerWindow.getHeight() - 100, 150, 30);
		MenuManagerWindow.getContentPane().add(btnDetails);
		
		MenuManagerWindow.setVisible(true);

	
		
		// Add event handlers
		btnCreate.addActionListener(new ActionListener() {
			
			public MenuItem findItemByName(String ItemName) {
				for(Entree a : MM.getEntrees()) {
					if(a.getName().equalsIgnoreCase(ItemName)) {
						return a;
					}
				}
				for(Side a : MM.getSides()) {
					if(a.getName().equalsIgnoreCase(ItemName)) {
						return a;
					}
				}
				for(Salad a : MM.getSalads()) {
					if(a.getName().equalsIgnoreCase(ItemName)) {
						return a;
					}
				}
				for(Dessert a : MM.getDesserts()) {
					if(a.getName().equalsIgnoreCase(ItemName)) {
						return a;
					}
				}
				return null;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
						String selEntree = cboEntree.getSelectedItem().toString();
						String selSide = cboSide.getSelectedItem().toString();
						String selSalad = cboSalad.getSelectedItem().toString();
						String selDessert = cboDessert.getSelectedItem().toString();
						Entree entree = (Entree) findItemByName(selEntree);
						Side side = (Side) findItemByName(selSide);
						Salad salad = (Salad) findItemByName(selSalad);
						Dessert dessert = (Dessert) findItemByName(selDessert);
						Menu w = new Menu("New Menu",entree,side,salad,dessert);
						System.out.println(entree+" "+side+" "+salad+" "+dessert+w.toString());
						txtTextMenus.setText(txtTextMenus.getText()+w.toString()+"\n");
				
			}
		});
		
		btnGenR.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			Menu w =  MM.randomMenu("New Menu");
			txtTextMenus.setText(txtTextMenus.getText()+w.toString()+"\n");
				
			}
		});
		
		btnMax.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			Menu w =  MM.maxCaloriesMenu();
			txtTextMenus.setText(txtTextMenus.getText()+w.toString()+"\n");
				
			}
		});

		btnMin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			Menu w =  MM.minCaloriesMenu();
			txtTextMenus.setText(txtTextMenus.getText()+w.toString()+"\n");
				
			}
		});

		btnDetails.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				createChildWindow();
				
			}
		});
		
	}
	private void createChildWindow() {
		frmChildWindow = new JFrame("Child Window");
		frmChildWindow.setBounds(MenuManagerWindow.getX() + 20, MenuManagerWindow.getY() + 20, 500, 750);
		frmChildWindow.setLayout(null);
		int ecal = 0;int sidcal = 0;int salcal = 0;int descal = 0; int totocal = 0;
		double epri = 0;double sidpri = 0;double salpri = 0;double despri = 0; double totopri =0;

		txtTextEnt = new JTextArea();
		
		lblEntree = new JLabel("Entree: ");
		lblEntree.setBounds(10, 20, 80, 30);
		frmChildWindow.getContentPane().add(lblEntree);

		txtTextEnt.setBounds(lblEntree.getX() + lblEntree.getWidth(), lblEntree.getY(), 300, 100);
		frmChildWindow.getContentPane().add(txtTextEnt);
		txtTextEnt.setLineWrap(true);
		txtTextEnt.setWrapStyleWord(true);
		txtTextEnt.setEditable(false);
		
		lblSide = new JLabel("Side: ");
		lblSide.setBounds(lblEntree.getX(), lblEntree.getY() + txtTextEnt.getHeight() + 10, lblEntree.getWidth(), lblEntree.getHeight());
		frmChildWindow.getContentPane().add(lblSide);
		
		txtTextSid = new JTextArea();
		txtTextSid.setBounds(lblSide.getX() + lblSide.getWidth(), lblSide.getY(), 250, 100);
		frmChildWindow.getContentPane().add(txtTextSid);
		txtTextSid.setLineWrap(true);
		txtTextSid.setWrapStyleWord(true);
txtTextSid.setEditable(false);

		// Add a textbox for withdrawal and deposit amounts
		lblSalad = new JLabel("Salad: ");
		lblSalad.setBounds(lblEntree.getX(), lblSide.getY() + txtTextEnt.getHeight() + 10, lblEntree.getWidth(), lblEntree.getHeight());
		frmChildWindow.getContentPane().add(lblSalad);
		
		// Add a combo box with a list of accounts
		
		txtTextSal = new JTextArea();
		txtTextSal.setBounds(lblSalad.getX() + lblSalad.getWidth(), lblSalad.getY(), 250, 100);
		frmChildWindow.getContentPane().add(txtTextSal);
		txtTextSal.setLineWrap(true);
		txtTextSal.setWrapStyleWord(true);
txtTextSal.setEditable(false);

		// Add a textbox for withdrawal and deposit amounts
		lblDessert = new JLabel("Dessert: ");
		lblDessert.setBounds(lblEntree.getX(), lblSalad.getY() +txtTextEnt.getHeight() + 10, lblEntree.getWidth(), lblEntree.getHeight());
		frmChildWindow.getContentPane().add(lblDessert);
		
		txtTextDes = new JTextArea();
		txtTextDes.setBounds(lblDessert.getX() + lblDessert.getWidth(), lblDessert.getY() + 10, 250, 100);
		frmChildWindow.getContentPane().add(txtTextDes);
		txtTextDes.setLineWrap(true);
		txtTextDes.setWrapStyleWord(true);
txtTextDes.setEditable(false);

		
		for(Entree a : MM.getEntrees()) {
			if(a.getName().equalsIgnoreCase(cboEntree.getSelectedItem().toString())) {
				txtTextEnt.setText (a.getName()+"\n"+a.getDescription()+" Calories: "+a.getCalories()+" Price: $"+a.getPrice());
			ecal = a.getCalories(); epri = a.getPrice();}
		}
		for(Side a : MM.getSides()) {
			if(a.getName().equalsIgnoreCase(cboSide.getSelectedItem().toString())) {
				txtTextSid.setText (a.getName()+"\n"+a.getDescription()+" Calories: "+a.getCalories()+" Price: $"+a.getPrice());
				sidcal = a.getCalories(); sidpri = a.getPrice();}

		}
		for(Salad a : MM.getSalads()) {
			if(a.getName().equalsIgnoreCase(cboSalad.getSelectedItem().toString())) {
				txtTextSal.setText(a.getName()+"\n"+a.getDescription()+" Calories: "+a.getCalories()+" Price: $"+a.getPrice());
				salcal = a.getCalories(); salpri = a.getPrice();}

		}
		for(Dessert a : MM.getDesserts()) {
			if(a.getName().equalsIgnoreCase(cboDessert.getSelectedItem().toString())) {
				txtTextDes.setText(a.getName()+"\n"+a.getDescription()+" Calories: "+a.getCalories()+" Price: $"+a.getPrice());
				descal = a.getCalories(); despri = a.getPrice();}

		}
totocal = ecal+sidcal+salcal+descal;
totopri = epri+salpri+sidpri+despri;
		toCal = new JLabel("Total calories: "+totocal);
		toCal.setBounds(lblEntree.getX(), lblDessert.getY() +txtTextEnt.getHeight() + 10, 150, lblEntree.getHeight());
		frmChildWindow.getContentPane().add(toCal);
		toPri = new JLabel("Total Price: $"+totopri);
		toPri.setBounds(lblEntree.getX(), toCal.getY() +toCal.getHeight() + 10, 150, lblEntree.getHeight());
		frmChildWindow.getContentPane().add(toPri);

		frmChildWindow.setVisible(true);
	}
	

public static void main(String[] args) throws FileNotFoundException {
MenuManagerGUI gui = new MenuManagerGUI();
}

}