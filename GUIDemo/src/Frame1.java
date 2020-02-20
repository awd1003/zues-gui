import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Font;

// 2/20/2020 This version of the GUI is to be utilized as a scale for the FRAMEWORK implementation
//This GUI is not the *most recent* GUI, rather it is the GUI that will be the easiest initially to understand the functionality that will be
//withheld by the workspace

//A more finished GUI will be uploaded by 2/23/2020 after pieces of code have been implemented 

//This projects assumes position on euclidean distance and the use of k-means and k-medoids

// -- Case Gryta 2/20/2020

//Routes > Centroids > Diagrams

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {						//Initialize and instantiate the frame
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
															// This button is for the importation of the button that will
			}												// Give the user the functionality for the cluster input
		});
		btnImport.setBounds(10, 11, 101, 34);
		frame.getContentPane().add(btnImport);
		
		JButton btnExport = new JButton("Export"); // This button gives the functionality for the user to send the GUI out as a .JPG or .GIF
		btnExport.setBounds(121, 11, 101, 34);
		frame.getContentPane().add(btnExport);
		
		
		JButton btnOptions = new JButton("Options"); // Drop-down for Scale,
		btnOptions.setBounds(230, 14, 95, 29);
		frame.getContentPane().add(btnOptions);
		Image img = new ImageIcon(this.getClass().getResource("/lightningbolt2.png")).getImage();
		
		
		JComboBox<?> comboBox = new JComboBox();
		comboBox.setBounds(664, 18, 101, 20);
		frame.getContentPane().add(comboBox);
		
		JButton button = new JButton("+"); // Zoom out the GUI
		button.setBounds(10, 462, 41, 41);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("-"); // Zoom in the GUI 
		button_1.setBounds(61, 462, 41, 41);
		frame.getContentPane().add(button_1);
		
		JLabel lblZeusClusteringGui = DefaultComponentFactory.getInstance().createTitle("Zeus Clustering GUI (Alpha 1)");
		lblZeusClusteringGui.setBounds(382, 21, 88, 14);
		frame.getContentPane().add(lblZeusClusteringGui);
		
		JScrollPane scrollPane = new JScrollPane(); //This pane is projected to be used for the graphical representation of the graphing
		scrollPane.setBounds(651, 462, 2, 2);		//mechanisms
		frame.getContentPane().add(scrollPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(585, 78, 180, 403);
		frame.getContentPane().add(tabbedPane);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
		JLabel lblNewLabel = new JLabel("Test Logo:");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(21, 0, 724, 514);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img));
		
		
		
	}
}
