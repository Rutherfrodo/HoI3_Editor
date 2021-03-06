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
import javax.swing.border.BevelBorder;

public class Okno {

	private JFrame frame;
	private JTextField PoleSciezki;

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
	private JTextField cost_Field;
	private JTextField time_Field;
	private JTextField level_Field;
	String completion_size;
	String cost;
	String time;
	String max_level;
	String capacity;
	int building_save_control_value = 0;
	
	public Okno() {
		initialize();
	}
	//Tworzenie buttonów
	JButton btnNewButton = new JButton("Zatwierdz");
	JButton btnNewButton_2 = new JButton("Wybierz ściezkę");
	JButton buttonZapiszBudynek = new JButton("Zapisz");
	
	JMenuItem mntmNowy = new JMenuItem("Tworz Folder");
	JMenuItem mntmDrugi = new JMenuItem("Tworz plik MOD");
	JMenuItem mntmBudynki = new JMenuItem("Budynki");
	JMenuItem mntmJednostki = new JMenuItem("Jednostki");
	JMenuItem mntmMinistrw = new JMenuItem("Ministrów");
	JMenuItem mntmEfekty = new JMenuItem("Efekty");
	
	JComboBox<String> BoxBudynki = new JComboBox<String>();
	JComboBox<String> BoxOnCompletion = new JComboBox<String>();
	
	JLabel completionSize_Label = new JLabel("Completion_size");
	JLabel onCopletion_Label = new JLabel("On Completion");
	JLabel capacity_Label = new JLabel("Capacity");
	JLabel lblNewLabel_5 = new JLabel("Max Level");
	JLabel lblNewLabel_3 = new JLabel("Cost");
	JLabel lblNewLabel_4 = new JLabel("Time");
	JPanel panel_Budynki = new JPanel();
	JLabel lblNewLabel_2 = new JLabel(sciezka);
	JLabel lblNewLabel = new JLabel("Scieżka docelowa np:");
	JLabel lblNewLabel_1 = new JLabel(sciezka);
	
	Panel panelsciezki = new Panel();
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Pliki");
		menuBar.add(mnNewMenu);	
		
		mnNewMenu.add(mntmNowy);	
	
		mnNewMenu.add(mntmDrugi);
		
		JMenu mnTworz = new JMenu("Modyfikuj");
		menuBar.add(mnTworz);	
		
		mnTworz.add(mntmBudynki);	
		
		mnTworz.add(mntmJednostki);
			
		mnTworz.add(mntmMinistrw);
				
		mnTworz.add(mntmEfekty);
		frame.getContentPane().setLayout(null);
				
		panelsciezki.setBounds(0, 34, 302, 125);
		frame.getContentPane().add(panelsciezki);
		panelsciezki.setLayout(null);
		panelsciezki.setVisible(false);
		
		PoleSciezki = new JTextField();
		PoleSciezki.setBounds(10, 58, 282, 20);
		panelsciezki.add(PoleSciezki);
		PoleSciezki.setColumns(10);	
		
		lblNewLabel.setBounds(10, 11, 169, 14);
		panelsciezki.add(lblNewLabel);	
		
		lblNewLabel_1.setBounds(10, 36, 259, 11);
		panelsciezki.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		btnNewButton.setBounds(10, 89, 112, 23);
		panelsciezki.add(btnNewButton);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 659, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(null);	
		
		btnNewButton_2.setBounds(10, 5, 143, 23);
		panel.add(btnNewButton_2);
			
		lblNewLabel_2.setBounds(190, 9, 506, 14);
		panel.add(lblNewLabel_2);
		
		panel_Budynki.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_Budynki.setBounds(10, 165, 497, 328);
		frame.getContentPane().add(panel_Budynki);
		panel_Budynki.setLayout(null);
		panel_Budynki.setVisible(false);
			
		BoxBudynki.setBounds(10, 11, 153, 20);
		panel_Budynki.add(BoxBudynki);	
		
		BoxOnCompletion.setBounds(149, 73, 179, 20);
		panel_Budynki.add(BoxOnCompletion);
		
		completion_Field = new JTextField();
		completion_Field.setBounds(149, 42, 109, 20);
		panel_Budynki.add(completion_Field);
		completion_Field.setColumns(10);
		
		capacity_Field = new JTextField();
		capacity_Field.setBounds(149, 104, 109, 20);
		panel_Budynki.add(capacity_Field);
		capacity_Field.setColumns(10);
				
		completionSize_Label.setBounds(20, 45, 109, 14);
		panel_Budynki.add(completionSize_Label);
				
		onCopletion_Label.setBounds(20, 76, 109, 14);
		panel_Budynki.add(onCopletion_Label);
				
		capacity_Label.setBounds(20, 105, 109, 14);
		panel_Budynki.add(capacity_Label);		
		
		lblNewLabel_3.setBounds(20, 130, 46, 14);
		panel_Budynki.add(lblNewLabel_3);
				
		lblNewLabel_4.setBounds(20, 161, 46, 14);
		panel_Budynki.add(lblNewLabel_4);		
		
		lblNewLabel_5.setBounds(20, 192, 77, 14);
		panel_Budynki.add(lblNewLabel_5);
		
		cost_Field = new JTextField();
		cost_Field.setBounds(149, 127, 109, 20);
		panel_Budynki.add(cost_Field);
		cost_Field.setColumns(10);
			
		time_Field = new JTextField();
		time_Field.setBounds(149, 158, 109, 20);
		panel_Budynki.add(time_Field);
		time_Field.setColumns(10);
		
		level_Field = new JTextField();
		level_Field.setBounds(149, 189, 109, 20);
		panel_Budynki.add(level_Field);
		level_Field.setColumns(10);
		
		buttonZapiszBudynek.setBounds(10, 294, 143, 23);
		panel_Budynki.add(buttonZapiszBudynek);
		PrzyciskiAkcje();
	}
	void ComboBoxItems() {
		//Przypisanie elementow do ComboBoxow
		BoxBudynki.addItem("");
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
	}
	void PrzyciskiAkcje() {
		ComboBoxItems(); // Przypisanie elementow do ComboBoxow
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
				panel_Budynki.setVisible(true);
				BoxBudynki.setSelectedIndex(0);
				BoxBudynki.addActionListener(new ActionListener() { // Obsluga combobox od budynkow
					public void actionPerformed(ActionEvent e) {
		
						CBoxItem LotniskoBoxItem = new CBoxItem(BoxBudynki,capacity_Label,"Lotnisko","Air Capacity");
							buttonZapiszBudynek.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(BoxBudynki.getSelectedItem()=="Lotnisko") {	
										
										if(building_save_control_value < 1) {
											Wiadomosc("Dziala Lotnisko");
											cost = cost_Field.getText();
											int costINT = Integer.parseInt(cost);
											completion_size = completion_Field.getText();
											double completionDOUB = Double.parseDouble(completion_size);
											time = time_Field.getText();
											int timeINT = Integer.parseInt(time);
											max_level = level_Field.getText();
											int levelINT = Integer.parseInt(max_level);
											capacity = capacity_Field.getText();
											int capacityINT = Integer.parseInt(capacity);
											Budynki Lotnisko = new Budynki(sciezkaCommon,"Buildings",".txt","construction_practical",completionDOUB, capacityINT,"yes",costINT,timeINT,levelINT,"yes");
											}
										building_save_control_value++;
									}
								}
							});
						
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
		
	}
	void Wiadomosc(String message) {JOptionPane.showMessageDialog(null, message);}  // Message Dialog, przydatne		
}
