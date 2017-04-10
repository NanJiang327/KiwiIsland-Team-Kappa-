package nz.ac.aut.ense701.gui;


import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IntroductionPage {

	    BackPanel IntroPanel;
		JFrame IntroFrame;
	    JButton JbStart,JbHelp,JbRank,JbExit, JbLogout;    
	    JPanel introPanel;
	    LoginPage loginPage;
	    RegisterPage registerPage;
	    ImageIcon startIcon,helpIcon, rankIcon, exitIcon,logoutIcon;
	    
	    public IntroductionPage()  
	    {  
	    	
	    	IntroFrame = new JFrame();
	    	int w = (Toolkit.getDefaultToolkit().getScreenSize().width - 1036) / 2;
	    	int h = (Toolkit.getDefaultToolkit().getScreenSize().height - 800) / 2;
	    	IntroFrame.setLocation(w, h);
	        //Components 
	    	//Read the images
	    	startIcon = new ImageIcon(getClass().getResource("/images/icon/start.png"));
	    	helpIcon = new ImageIcon(getClass().getResource("/images/icon/Help.png"));
	    	rankIcon = new ImageIcon(getClass().getResource("/images/icon/Rank.png"));
	    	exitIcon = new ImageIcon(getClass().getResource("/images/icon/exit.png"));
	    	logoutIcon = new ImageIcon(getClass().getResource("/images/icon/logout.png"));
	    	//set up start button
	        JbStart=new JButton();
	        JbStart.setBounds(450, 420, 150, 50);
	        JbStart.setIcon(startIcon);
	        JbStart.addActionListener(new java.awt.event.ActionListener() {
	        	@Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	        		IntroFrame.dispose();
	            	new StartPage();        
	            }
	        });
	        //set up help button       
	        JbHelp = new JButton();
	        JbHelp.setBounds(450, 480, 150, 50);
	        JbHelp.setIcon(helpIcon);
	        JbHelp.addActionListener(new java.awt.event.ActionListener() {
	        	@Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	        		//Todo
	            }
	        });
	        //set up the rank button
	        JbRank=new JButton();
	        JbRank.setBounds(450, 540, 150, 50);
	        JbRank.setIcon(rankIcon);
	        JbRank.addActionListener(new java.awt.event.ActionListener() {
	        	@Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                //Todo
	            }
	        });
	        //set up the logout button
	        JbLogout=new JButton();
	        JbLogout.setBounds(450, 600, 150, 50);
	        JbLogout.setIcon(logoutIcon);
	        JbLogout.addActionListener(new java.awt.event.ActionListener() {
	        	@Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	        		IntroFrame.dispose();
	        		new LoginPage();            
	            }
	        });
	        
	        //set up the exit button
	        JbExit=new JButton();
	        JbExit.setBounds(450, 660, 150, 50);
	        JbExit.setIcon(exitIcon);
	        JbExit.addActionListener(new java.awt.event.ActionListener() {
	        	@Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	        		System.exit(0);        
	            }
	        });
	        
	        //Create the a null layout panel
	        introPanel = new BackPanel();
	        introPanel.setLayout(null);
	        //add buttons into the panel
	        introPanel.add(JbStart);
	        introPanel.add(JbHelp);
	        introPanel.add(JbRank);
	        introPanel.add(JbLogout);
	        introPanel.add(JbExit);
	       
	        IntroFrame.add(introPanel);  

	        //Set frame size, title.
	        IntroFrame.setResizable(false);
	        IntroFrame.setTitle("Kiwi Island");  
	        IntroFrame.setSize(1036, 800);  
	        IntroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        IntroFrame.setVisible(true);  
	    } 
	    	  
}  



