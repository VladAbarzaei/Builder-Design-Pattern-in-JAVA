import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Image;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JMenu;


public class GUI {

	private JFrame frame;
	private JTextField txtCarne;
	private JTextField txtSos;
	private JTextField txtChifla;
	private JTextField txtBranza;
	private JTextField txtLegume;
	private JTextField txtVerdeata;
	private JTextField txtDiverse;
	private JPanel container2;
	private JPanel container;
	private static float volume = 2f;
	private JTextArea afisare;
	private static JLabel poza;
	//private JPanel container;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GUI() {
		initialize();
	}

	
	private void initialize() {

		Font font_optiuni = new Font("Arial", Font.BOLD, 18);
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 0, 0));
		frame.setBounds(100, 100, 650, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		
		JButton btnNewButton = new JButton("Comanda");
		
		ImageIcon img_border = new ImageIcon(".\\src\\frame.png");
		Image buff_border = img_border.getImage();
		Image buffScaled = buff_border.getScaledInstance(frame.getWidth()+20, frame.getHeight()+10, Image.SCALE_SMOOTH);
		ImageIcon border_scaled = new ImageIcon(buffScaled);
		
		poza = new JLabel("");
		poza.setBounds(346, 278, 239, 237);
		ImageIcon img_burgir = new ImageIcon(".\\src\\cropped.jpg");
		Image buff_burgir = img_burgir.getImage();
		buffScaled = buff_burgir.getScaledInstance(poza.getWidth(), poza.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon burgir_scaled = new ImageIcon(buffScaled);
		
		poza.setIcon(burgir_scaled);
	
		
		poza.setVisible(false);
		frame.getContentPane().add(poza);

		JComboBox<String> comboBox_0 = new JComboBox<>();
		comboBox_0.setFont(font_optiuni);
		comboBox_0.addItem("Simpla");
		comboBox_0.addItem("Susan");
		comboBox_0.addItem("Integrala");
		comboBox_0.setBounds(-2, 30, 96, 21);
		//frame.getContentPane().add(comboBox_0);

		txtChifla = new JTextField();
		setAtributeText(txtChifla);
		txtChifla.setBounds(-2, 5, 100, 15);
		txtChifla.setText("Chifla");
		//frame.getContentPane().add(txtChifla);


		JComboBox<String> comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(112, 28, 96, 21);
		//frame.getContentPane().add(comboBox_1);
		comboBox_1.setFont(font_optiuni);
		comboBox_1.addItem("Vita");
		comboBox_1.addItem("Porc");
		comboBox_1.addItem("Pui");
		comboBox_1.addItem("Curcan");


		txtCarne = new JTextField();
		setAtributeText(txtCarne);
		txtCarne.setText("Carne");
		txtCarne.setBounds(108, 5, 100, 15);
		//frame.getContentPane().add(txtCarne);

		JComboBox<String> comboBox_2 = new JComboBox<>();
		comboBox_2.setBounds(225, 30, 96, 21);
		//frame.getContentPane().add(comboBox_2);
		comboBox_2.setFont(font_optiuni);
		comboBox_2.addItem("Ketchup");
		comboBox_2.addItem("Mustar");
		comboBox_2.addItem("Maioneza");

		txtSos = new JTextField();
		setAtributeText(txtSos);
		txtSos.setText("Sosuri");
		txtSos.setBounds(218, 5, 100, 15);
		//frame.getContentPane().add(txtSos);

		JComboBox<String> comboBox_3 = new JComboBox<>();
		comboBox_3.setBounds(335, 30, 96, 21);
		comboBox_3.setFont(font_optiuni);
		comboBox_3.addItem("Cascaval");
		comboBox_3.addItem("Cheddar");
		comboBox_3.addItem("Gouda");
		//frame.getContentPane().add(comboBox_3);
		
		txtBranza = new JTextField();
		setAtributeText(txtBranza);
		txtBranza.setText("Branza");
		txtBranza.setBounds(332, 5, 100, 15);
		//frame.getContentPane().add(txtBranza);

		txtLegume = new JTextField();
		setAtributeText(txtLegume);
		txtLegume.setText("Legume");
		txtLegume.setBounds(55, 82, 100, 15);
		//frame.getContentPane().add(txtLegume);

		JComboBox<String> comboBox_4 = new JComboBox<String>();
		comboBox_4.setBounds(55, 107, 96, 21);
		//frame.getContentPane().add(comboBox_4);
		comboBox_4.setFont(font_optiuni);
		comboBox_4.addItem("Rosii");
		comboBox_4.addItem("Castraveti");
		comboBox_4.addItem("Castraveti murati");
		comboBox_4.addItem("Ardei");
		comboBox_4.addItem("Ciuperci");


	

		txtVerdeata = new JTextField();
		setAtributeText(txtVerdeata);
		txtVerdeata.setText("Verdeata");
		txtVerdeata.setBounds(168, 80, 100, 15);
		//frame.getContentPane().add(txtVerdeata);

		JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.setBounds(167, 107, 96, 21);
		//frame.getContentPane().add(comboBox_6);
		comboBox_6.setFont(font_optiuni);
		comboBox_6.addItem("Salata iceberg");
		comboBox_6.addItem("Salata coleslaw");
		comboBox_6.addItem("Spanac");

		txtDiverse = new JTextField();
		setAtributeText(txtDiverse);
		txtDiverse.setText("Diverse");
		txtDiverse.setBounds(278, 82, 100, 15);
		//frame.getContentPane().add(txtDiverse);

		JComboBox<String> comboBox_7 = new JComboBox<String>();
		comboBox_7.setBounds(282, 107, 124, 21);
		//frame.getContentPane().add(comboBox_7);
		
		comboBox_7.setFont(font_optiuni);
		comboBox_7.addItem("Guacamole");
		comboBox_7.addItem("Ciuperci");
		comboBox_7.addItem("Ceapa Prajita");
		comboBox_7.addItem("Sos de hrean");

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Select meniu");
		menuBar.add(mnNewMenu);

		JButton menuPredefinit = new JButton("Meniul Nostru");
		mnNewMenu.add(menuPredefinit);

		JButton menuCostum = new JButton("Personalizat");
		mnNewMenu.add(menuCostum);

		container = new JPanel();
		container.setOpaque(false);
		container.setBounds(101, 78, 446, 144);
		container.setLayout(null);
		container.add(txtBranza);
		container.add(txtCarne);
		container.add(txtChifla);
		container.add(txtDiverse);
		container.add(txtLegume);
		container.add(txtSos);
		container.add(txtVerdeata);
		container.add(comboBox_0);
		container.add(comboBox_1);
		container.add(comboBox_2);
		container.add(comboBox_3);
		container.add(comboBox_4);
		container.add(comboBox_6);
		container.add(comboBox_7);

		container.setVisible(false);
		menuCostum.addActionListener(e -> {
			// Invertim vizibilitatea containerului
			if(!container2.isVisible()) {
				container.setVisible(!container.isVisible());
			}
			else {
				container2.setVisible(!container2.isVisible());
				container.setVisible(!container.isVisible());
			}



		});

		frame.getContentPane().add(container);


		JRadioButton opt_1 = new JRadioButton("<html>Standard<br> Burger</html>");
		setAtributeRadioButton(opt_1);
		opt_1.setBounds(10, 110, 197, 59);
		//frame.getContentPane().add(opt_2);
		
		JRadioButton opt_2 = new JRadioButton("<html>Premium<br>Burger</html>");
		opt_2.setBounds(180, 110, 198, 59);
		
		setAtributeRadioButton(opt_2);
		
		
		JRadioButton opt_3 = new JRadioButton("<html>Deluxe<br>Burger</html>");
		setAtributeRadioButton(opt_3);
		opt_3.setBounds(350, 110, 198, 59);
		//frame.getContentPane().add(opt_3);

		ButtonGroup buttonGroup = new ButtonGroup();

		buttonGroup.add(opt_1);
		buttonGroup.add(opt_2);
		buttonGroup.add(opt_3);



		container2 = new JPanel();
		container2.setOpaque(false);
		container2.setBounds(30, 78, 579, 190);
		container2.setLayout(null);

		container2.setVisible(false);

		menuPredefinit.addActionListener(e -> {
			// Invertim vizibilitatea containerului
			if(!container.isVisible()) {
				container2.setVisible(!container2.isVisible());
			}
			else {
				container.setVisible(!container.isVisible());
				container2.setVisible(!container2.isVisible());
			}
		});

		frame.getContentPane().add(container2);
		
		JLabel poza_standard = new JLabel("");
		ImageIcon standard_init = new ImageIcon(".\\src\\standard.jpg");
		Image buff = standard_init.getImage();
		Image buffScale = buff.getScaledInstance(100,130, Image.SCALE_SMOOTH);
		ImageIcon img_scaled = new ImageIcon(buffScale);
		
		
		poza_standard.setIcon(img_scaled);
		
		poza_standard.setBounds(47, 0, 158, 113);
		poza_standard.setVisible(true);
		
		JLabel poza_premium = new JLabel("");
		ImageIcon premium_init = new ImageIcon(".\\src\\premium.jpg");
		buff = premium_init.getImage();
		buffScale = buff.getScaledInstance(100,130,Image.SCALE_SMOOTH);
		img_scaled = new ImageIcon(buffScale);
		poza_premium.setIcon(img_scaled);
		
		poza_premium.setBounds(221, 0, 158, 113);
		
		JLabel poza_deluxe = new JLabel("");
		ImageIcon deluxe_init = new ImageIcon(".\\src\\deluxe.jpg");
		buff = deluxe_init.getImage();
		buffScale = buff.getScaledInstance(100,110,Image.SCALE_SMOOTH);
		img_scaled = new ImageIcon(buffScale);
		poza_deluxe.setIcon(img_scaled);
		
		
		poza_deluxe.setBounds(415, 0, 158, 118);
		container2.add(opt_1);
		container2.add(opt_3);
		container2.add(opt_2);
		container2.add(poza_standard);
		container2.add(poza_premium);
		container2.add(poza_deluxe);
		
		
				
		
				//JButton btnNewButton = new JButton("Comanda");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						String text = new String();
						
						if(container.isVisible()) {
							String chifla = comboBox_0.getSelectedItem().toString();
							String carne = comboBox_1.getSelectedItem().toString();
							String sos = comboBox_2.getSelectedItem().toString();
							String branza = comboBox_3.getSelectedItem().toString();
							String legume = comboBox_4.getSelectedItem().toString();
							String verdeata = comboBox_6.getSelectedItem().toString();
							String diverse = comboBox_7.getSelectedItem().toString();
							
							Burger custom = new Burger();
							custom.setBurgerBun(chifla);
							custom.setBurgerGreens(verdeata);
							custom.setBurgerSauce(sos);
							custom.setBurgerVeggies(legume);
							custom.setBurgerMeat(carne);
							custom.setBurgeCheese(branza);
							custom.setBurgerOthers(diverse);
				
							afisare.setText(custom.print());
							burgir();
							//System.out.println(big);
						}

						if(container2.isVisible()) {
							BurgerDirector burgerDirector = new BurgerDirector();
							if(opt_1.isSelected()) {
								burgerDirector.setBuilder(new StandardBurgerBuilder());
								text = buildBurger(burgerDirector);
								afisare.setText(text);
								burgir();
							}
							if(opt_2.isSelected()) {
								burgerDirector.setBuilder(new PremiumBurgerBuilder());
								text = buildBurger(burgerDirector);
								afisare.setText(text);
								burgir();
							}
							if(opt_3.isSelected()) {
								burgerDirector.setBuilder(new DeluxeBurgerBuilder());
								text = buildBurger(burgerDirector);
								afisare.setText(text);
								burgir();
							}

						}
						Font font_afis = new Font("Arial", Font.PLAIN, 15);
						afisare.setFont(font_afis);
						afisare.setLineWrap(true);
						afisare.setWrapStyleWord(true);

					}
				});
				btnNewButton.setFont(new Font("Aileron Bold", Font.PLAIN, 19));
				btnNewButton.setBorder(null);
				btnNewButton.setBounds(250, 550, 140, 62);
				frame.getContentPane().add(btnNewButton);

		afisare = new JTextArea();
		afisare.setFont(new Font("Monospaced", Font.PLAIN, 13));
		afisare.setEditable(false);
		afisare.setBounds(50, 278, 293, 237);
		frame.getContentPane().add(afisare);
		afisare.setColumns(10);
		
		JLabel border = new JLabel("");
		border.setBounds(0, 0, 636, 641);
		border.setIcon(border_scaled);
		
		border.setVisible(true);
		border.setVerticalAlignment(SwingConstants.CENTER);
		border.setHorizontalAlignment(SwingConstants.CENTER);	
		
		frame.getContentPane().add(border);
	}
	private static void playSound(String filePath, float volume) {
		try {
			File soundFile = new File(filePath);
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);

			// Obtine FloatControl pentru volum
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

			// Seteaza volumul (în unitati de dB)
			float dB = (float) (Math.log(volume) / Math.log(10.0) * 20.0);
			gainControl.setValue(dB);

			// Reda sunetul
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void setAtributeText(JTextField text) {
		text.setFont(new Font("Arial Black", Font.PLAIN, 20));
		text.setForeground(Color.WHITE);
		text.setCaretColor(new Color(255, 255, 255));
		text.setOpaque(false);
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setEditable(false);
		text.setColumns(10);
		text.setBorder(null);

	}
	public static void setAtributeRadioButton(JRadioButton button) {

		button.setFont(new Font("Arial Black", Font.PLAIN, 20));
		button.setForeground(Color.WHITE);
		button.setOpaque(false);
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.setBorder(null);
	}

	public static void burgir() {		
		poza.setVisible(true);
		playSound(".\\src\\Borgir Sound Effect.wav", volume);
	}
	private static String buildBurger(BurgerDirector burgerDirector) {
		Burger burger = burgerDirector.makeBurger();
		return burger.print();
	}
}
