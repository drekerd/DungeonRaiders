import java.awt.EventQueue;

import java.awt.Image;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.function.LongToDoubleFunction;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;

public class MainFrame extends JFrame implements ActionListener {

	private JFrame frame;
	
	private JButton bAttack; 
	private JButton bErase;
	
	private JLabel championLabel;
	private JLabel enemyLabel;
	
	private JLabel combatLabel;
	private JProgressBar progressBar;
	private JLabel enemyHpDisplay;
	
	String combatLog="";
	private int i =0;
	private JScrollPane combatScrollLog;
	private JPanel panel;
	private int playerDamageDone;
	VampyreKing enemy = new VampyreKing("Vlad");
	Player player = new Player();

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
	public void initialize() throws IOException{
		
//		Player player = new Player();
	
		
		frame = new JFrame();
		frame.setBounds(0,0,1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Buttons
		bAttack = new JButton("Attack");
		bAttack.setBounds(222, 524, 85, 29);
		bAttack.addActionListener(this);
		frame.getContentPane().add(bAttack);
		
//		bErase = new JButton("Erase Log");
//		bErase.setBounds(0,0,80,20);
//		frame.getContentPane().add(bErase);
//		bErase.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				combatLabel.setText("");
//			}
//		});
		
		
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
		
		enemyLabel = new JLabel();
		Image enemyImage = new ImageIcon(getClass().getResource("bat.png")).getImage();
		enemyLabel.setIcon(new ImageIcon(enemyImage));
		enemyLabel.setBounds(1300, 0, 512, 512);
		frame.getContentPane().add(enemyLabel);
		
//		JLabel lblCombatLog = new JLabel("Combat log");
//		lblCombatLog.setBounds(693, 6, 111, 16);
//		frame.getContentPane().add(lblCombatLog);
		
		//Combat Log
		combatLabel = new JLabel("Combat Log");
		combatLabel.setBounds(595, 37, 269, 592);
		combatLabel.setBackground(Color.BLUE);
		combatLabel.setForeground(Color.BLACK);
		frame.getContentPane().add(combatLabel);
		
		//Player Items List
		JLabel playerItems = new JLabel();
		playerItems.setBounds(10, 662, 512, 294);

		progressBar = new JProgressBar(0, enemy.getHitPoints());
		progressBar.setBounds(1300, 600, 200, 80);
        progressBar.setValue(enemy.getHitPoints());
        progressBar.setStringPainted(true);
        frame.add(progressBar);
        
        enemyHpDisplay = new JLabel();
        enemyHpDisplay.setBounds(1300, 550, 200, 80);
        enemyHpDisplay.setText(Integer.toString(enemy.getHitPoints()));;
        frame.add(enemyHpDisplay);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getSource() == bAttack) {
			String newText;
			
			i++;
			//player.setDamage();
			newText ="<html> <br/> Player performed an Attack <html>";
			combatLog = combatLog.concat(newText);
//			System.out.println("Weapon Damage "+ player.getWeapon().getDamageInflicted());
			enemy.takeDamage(player.getWeapon());
			combatLog = combatLog.concat(enemy.toString());
			progressBar.setValue(enemy.getHitPoints());
			enemyHpDisplay.setText(Integer.toString(enemy.getHitPoints()));
			combatLabel.setText(combatLog);
			combatLabel.paintImmediately(combatLabel.getVisibleRect());
			combatLabel.setForeground(Color.DARK_GRAY);
		
			
		}
		frame.getContentPane().add(combatLabel);
	}
}
