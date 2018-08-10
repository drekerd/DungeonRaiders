import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;

public class MainFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private JButton bAttack; 
	private JLabel championLabel;
	private JLabel combatLabel;
	String combatLog="asdasd";
	private int i =0;

//	BufferedImage champion = ImageIO.read(MainFrame.class.getClassLoader().getResourceAsStream("images/champion.png"));
	public static void launcFrame() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MainFrame() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException{
		frame = new JFrame();
		frame.setBounds(0,0,1280,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		bAttack = new JButton("Attack");
		bAttack.setBounds(222, 524, 85, 29);
		bAttack.addActionListener(this);
		frame.getContentPane().add(bAttack);
		
//		Panel championPanel = new Panel() {
//			protected void championPaint(Graphics img) {
//				img.drawImage(champion, 0,200,Color.white,null);
////				img.drawString(this.getBounds().toString(),5,15);
//			}
//		};
//		panel.setBounds(81, 133, 94, 80);
//		frame.getContentPane().add(championPanel);
		
		championLabel = new JLabel();
		Image championImage = new ImageIcon(getClass().getResource("champion.png")).getImage();
		championLabel.setIcon(new ImageIcon(championImage));
		championLabel.setBounds(10, 0, 512, 512);
		frame.getContentPane().add(championLabel);
		
//		JLabel lblCombatLog = new JLabel("Combat log");
//		lblCombatLog.setBounds(693, 6, 111, 16);
//		frame.getContentPane().add(lblCombatLog);
		
		combatLabel = new JLabel("New label");
		combatLabel.setBounds(595, 563, 269, 66);
		combatLabel.setBackground(Color.BLUE);
		combatLabel.setForeground(Color.BLACK);
		frame.getContentPane().add(combatLabel);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getSource() == bAttack) {
			i++;
			System.out.println(i);
			combatLog = combatLog + "new Attack\n";
			combatLabel.setText(combatLog+"\n");
			combatLabel.setForeground(Color.DARK_GRAY);
	
		}
		frame.getContentPane().add(combatLabel);
	}
}
