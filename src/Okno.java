import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;

public class Okno {
	

	
	private JFrame frame;
	private JTextField PoleSciezki;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno window = new Okno();
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
	//DEKLARACJE SCIEZEK===================================================================
	String sciezka = "D://STEAM//steamapps//common//Hearts of Iron 3//tfh//mod//";
	String NazwaModa = "LegionMore";
	String sciezkaCommon = sciezka+NazwaModa+"//common//";
	String sciezkaDecisions = sciezka+NazwaModa+"//decisions//";
	String sciezkaEvents = sciezka+NazwaModa+"//events//";
	String sciezkaGfx = sciezka+NazwaModa+"//gfx//";
	String sciezkaUnits = sciezka+NazwaModa+"//units//";
	String sciezkaHistory = sciezka+NazwaModa+"//history//";
	String sciezkaMap = sciezka+NazwaModa+"//map//";
	private JTextField completion_Field;
	private JTextField capacity_Field;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public Okno() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Pliki");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNowy = new JMenuItem("Tworz Folder");
		mnNewMenu.add(mntmNowy);
		
		JMenuItem mntmDrugi = new JMenuItem("Tworz plik MOD");
		mnNewMenu.add(mntmDrugi);
		
		JMenu mnTworz = new JMenu("Modyfikuj");
		menuBar.add(mnTworz);
		
		JMenuItem mntmBudynki = new JMenuItem("Budynki");
		mnTworz.add(mntmBudynki);

		
		JMenuItem mntmJednostki = new JMenuItem("Jednostki");
		mnTworz.add(mntmJednostki);
		
		JMenuItem mntmMinistrw = new JMenuItem("Ministrów");
		mnTworz.add(mntmMinistrw);
		
		JMenuItem mntmEfekty = new JMenuItem("Efekty");
		mnTworz.add(mntmEfekty);
		frame.getContentPane().setLayout(null);
		
		Panel panelsciezki = new Panel();
		panelsciezki.setBounds(0, 34, 302, 125);
		frame.getContentPane().add(panelsciezki);
		panelsciezki.setLayout(null);
		panelsciezki.setVisible(false);
		
		PoleSciezki = new JTextField();
		PoleSciezki.setBounds(10, 58, 282, 20);
		panelsciezki.add(PoleSciezki);
		PoleSciezki.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scieżka docelowa np:");
		lblNewLabel.setBounds(10, 11, 169, 14);
		panelsciezki.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(sciezka);
		lblNewLabel_1.setBounds(10, 36, 259, 11);
		panelsciezki.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		JButton btnNewButton = new JButton("Zatwierdz");
		btnNewButton.setBounds(10, 89, 112, 23);
		panelsciezki.add(btnNewButton);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 659, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Wybierz ściezkę");
		btnNewButton_2.setBounds(10, 5, 143, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel(sciezka);
		lblNewLabel_2.setBounds(190, 9, 506, 14);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 165, 497, 328);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		
		JComboBox<String> BoxBudynki = new JComboBox<String>();
		BoxBudynki.setBounds(10, 11, 153, 20);
		panel_1.add(BoxBudynki);
		
		JComboBox<String> BoxOnCompletion = new JComboBox<String>();
		BoxOnCompletion.setBounds(149, 73, 179, 20);
		panel_1.add(BoxOnCompletion);
		
		completion_Field = new JTextField();
		completion_Field.setBounds(149, 42, 109, 20);
		panel_1.add(completion_Field);
		completion_Field.setColumns(10);
		
		capacity_Field = new JTextField();
		capacity_Field.setBounds(149, 104, 109, 20);
		panel_1.add(capacity_Field);
		capacity_Field.setColumns(10);
		
		JLabel completionSize_Label = new JLabel("Completion_size");
		completionSize_Label.setBounds(20, 45, 109, 14);
		panel_1.add(completionSize_Label);
		
		JLabel onCopletion_Label = new JLabel("On Completion");
		onCopletion_Label.setBounds(20, 76, 109, 14);
		panel_1.add(onCopletion_Label);
		
		JLabel capacity_Label = new JLabel("Capacity");
		capacity_Label.setBounds(20, 105, 109, 14);
		panel_1.add(capacity_Label);
		
		JLabel lblNewLabel_3 = new JLabel("Cost");
		lblNewLabel_3.setBounds(20, 130, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Time");
		lblNewLabel_4.setBounds(20, 161, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Max Level");
		lblNewLabel_5.setBounds(20, 186, 77, 14);
		panel_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(149, 127, 109, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 158, 109, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 183, 109, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		//======================================================================================================
		BoxBudynki.addItem("Lotnisko");
		BoxBudynki.addItem("Port");
		BoxBudynki.addItem("Fort Morski");
		BoxBudynki.addItem("Fort");
		BoxBudynki.addItem("Anti Air");
		BoxBudynki.addItem("Radar Station");
		BoxBudynki.addItem("Underground");
		BoxBudynki.addItem("Nuclear Reaktor");
		BoxBudynki.addItem("Rocket Test");
		BoxBudynki.addItem("Industry");
		BoxBudynki.addItem("Infrastrukture");
		
		BoxOnCompletion.addItem("Construction practical");
		BoxOnCompletion.addItem("Artillery practical");
		BoxOnCompletion.addItem("Electornicegineering practical");
		BoxOnCompletion.addItem("Nuclear Bomb");
		BoxOnCompletion.addItem("rocket practical");
		BoxOnCompletion.addItem("militia_theory");

		
		//===================================================================================
		
		
		
		//BUTTON listeners============================================================
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelsciezki.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelsciezki.setVisible(false);
				sciezka = PoleSciezki.getText();
				lblNewLabel_2.setText(sciezka);
				
			}
		});
		mntmDrugi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				UtworzPlik Budynki = new UtworzPlik(sciezkaCommon, "Buildings",".txt","EloELo");
				UtworzPlik Modfile = new UtworzPlik(sciezka, NazwaModa,".mod",NazwaModa,"tfh/mod/" + NazwaModa ,NazwaModa);				
			}
		});
		
		mntmNowy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Foldery Glowny = new Foldery(sciezka, NazwaModa);
				Foldery Common = new Foldery(sciezka,NazwaModa+"//","common");
				Foldery Decisions = new Foldery(sciezka,NazwaModa+"//", "decisions");
				
			}
		});
		
		mntmBudynki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				BoxBudynki.setSelectedIndex(0);
				BoxBudynki.addActionListener(new ActionListener() { // Obsluga combobox od budynkow
					public void actionPerformed(ActionEvent e) {
						
						CBoxItem LotniskoBoxItem = new CBoxItem(BoxBudynki,capacity_Label,"Lotnisko","Air Capacity");
						
						
						CBoxItem PortBoxItem = new CBoxItem(BoxBudynki,capacity_Label,"Port","Port Capacity");
						
						
						CBoxItem FortBoxItem = new CBoxItem(BoxBudynki,capacity_Label,"Fort","Fort Level");
						
						
						CBoxItem NavalFortBoxItem = new CBoxItem(BoxBudynki,capacity_Label,"Fort Morski","Fort Level");
					}
				});
				/*Budynki czysc = new Budynki(sciezkaCommon,"Buildings",".txt");
				Budynki Lotnisko = new Budynki(sciezkaCommon,"Buildings",".txt","construction_practical",0.15,1,"yes",5,100,10,"yes");
				Budynki Port = new Budynki(sciezkaCommon,"Buildings",".txt","construction_practical",0.15,1,"yes",5,100,10,"yes","yes");*/
				
			}
		});
		double completion_size;
		int cost;
		int time;
		int max_level;			
	}

	void Wiadomosc(String message) {JOptionPane.showMessageDialog(null, message);}  // Message Dialog, przydatne		
}
