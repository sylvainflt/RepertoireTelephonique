package repTel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RepertoireTelephonique extends JFrame implements ActionListener{

	private Telephone modal;
	
	private ArrayList contacts;
	
	private JTable contactTable;
	
	private DefaultTableModel model;
	
	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public RepertoireTelephonique(String name) {
		super(name);
	}
	
	public JTable getContactTable() {
		return contactTable;
	}

	public void setContactTable(JTable contactTable) {
		this.contactTable = contactTable;
	}

	public void setUpWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
        this.setVisible(true);
        this.setSize(300, 400);
        
        GridBagLayout gbl = new GridBagLayout();
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        this.setLayout(gbl);
        JButton ajouter = new JButton("ajouter");
        JButton supprimer = new JButton("supprimer");
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        ajouter.setActionCommand("ajouter");
        ajouter.addActionListener(this);
        this.add(ajouter, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        supprimer.setActionCommand("supprimer");
        supprimer.addActionListener(this);
        this.add(supprimer, gbc);
        
        String[] columns = new String[] {
                "nom", "téléphone"
            };
        model = new DefaultTableModel(columns, 0);
        
        contactTable = new JTable(model);
        //contactTable.setText("contact : ");
        //p.setSize(250, 350);
        //p.setBorder();
        //contact.setBackground(new Color(255,255,255));
        gbc.ipady = 200;
        gbc.insets = new Insets(10,0,0,0);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(contactTable, gbc);
	}
	
	public void actionPerformed(ActionEvent e) {
		if ("ajouter".equals(e.getActionCommand())) {
        	modal = new Telephone(this);
        } else if("supprimer".equals(e.getActionCommand())) {
        	model.removeRow(contactTable.getSelectedRow());
        }
	}
	
}
