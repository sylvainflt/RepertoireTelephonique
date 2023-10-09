package repTel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Telephone extends JDialog implements ActionListener{

	private JTextField saisiNom;
	
	private JTextField saisiTel;
		
	private RepertoireTelephonique rt;
	
	public Telephone(RepertoireTelephonique rt) {
		super();
		this.rt = rt;
		
		this.pack();
        this.setVisible(true);
        this.setSize(200, 200);
        
        BoxLayout bl = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        this.setLayout(bl);
        
        JLabel nom = new JLabel("nom");
        this.add(nom);
        
        saisiNom = new JTextField();
        this.add(saisiNom);
        
        JLabel telephone = new JLabel("téléphone");
        this.add(telephone);
        
        saisiTel = new JTextField();
        this.add(saisiTel);
        
        JButton ajouterContact = new JButton("ajouterContact");
        ajouterContact.setActionCommand("ajouterContact");
        ajouterContact.addActionListener(this);
        this.add(ajouterContact);
        
	}

	public void actionPerformed(ActionEvent e) {
		if ("ajouterContact".equals(e.getActionCommand())) {
			       	
        	rt.getModel().addRow(
           	     new Object[]{
           	    		saisiNom.getText(), 
           	    		saisiTel.getText()
           	     }
          	);
        	dispose();
        } 
	}
	
	public JTextField getSaisiNom() {
		return saisiNom;
	}

	public void setSaisiNom(JTextField saisiNom) {
		this.saisiNom = saisiNom;
	}

	public JTextField getSaisiTel() {
		return saisiTel;
	}

	public void setSaisiTel(JTextField saisiTel) {
		this.saisiTel = saisiTel;
	}
	
}
