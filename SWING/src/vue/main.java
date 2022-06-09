package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// on crée une fenêtre dont le titre est "Hello World!"
        JFrame frame = new JFrame("Hello World!");
        // la fenêtre doit se fermer quand on clique sur la croix rouge
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //setsize
        frame.setSize(500,500);
        // on ajoute le texte "Hello, World!" dans la fenêtre
       
        
        
       //ajouter une image 
       ImageIcon image=new ImageIcon(main.class.getResource("/images/img5.jpg"));
       frame.setIconImage(image.getImage());
       //Jpanel
       //JPanel jp= new JPanel();
       //jp.setBackground(Color.red);
        JPanel jp = (JPanel) frame.getContentPane();
	       jp.setLayout(new FlowLayout(FlowLayout.LEFT));
	       jp.add(new JLabel("CDA"));
	       jp.add(new JLabel("AFPA"));
	        JButton monBouton = new JButton("Clique");
	        monBouton.setFocusable(false);
	        jp.add(monBouton);
        //textfield(inputs)
	        JTextField input= new JTextField();
	        input.setPreferredSize(new Dimension(300,200));
	        input.setSize(500,200);
	        jp.add(input);
        
	    /*frame.getContentPane().add(new JLabel("Hello, World!"));
        frame.getContentPane().add(new JLabel("blink"));
        //frame.getContentPane().add(jp);
        frame.getContentPane().setBackground(Color.blue);
        frame.getContentPane().setLayout(new FlowLayout());*/
        
        
        /*frame.getContentPane().add(monBouton);*/
        
        
        // on centre la fenêtre
        frame.setLocationRelativeTo(null);
        // on rend la fenêtre visible
        frame.setVisible(true);

	}

}
