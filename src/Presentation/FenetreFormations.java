package Presentation;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Metier.Doctorant;
import Metier.Formation;
import Metier.Module;
import Metier.Professeur;
import Persistance.ModelTableformation;

public class FenetreFormations extends JFrame implements ActionListener {
	JTable formationsTable;
	JScrollPane scrollPane;
	ModelTableformation forms;
	JButton delete;
	JButton addButton;
	JButton modify,disconnect;
	JLabel formaNameLabel, formaDescLabel, formaRespoLabel,person_connected;
	JTextField formaName, formaDesc, formaRespo;
	JPanel panel, right_side, left_side,header;
	//Controleur c;
	
	public FenetreFormations(ArrayList<Formation> formations, Integer idRespoUFR) {
		super("Liste des formations");
		
		this .setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		delete = new JButton("Delete");
		//delete.addActionListener(this);
		
		addButton = new JButton("Add");
		//addButton.addActionListener(this);
		
		forms = new ModelTableformation(formations);
		formationsTable = new JTable(forms);
		
		formationsTable.setAutoCreateRowSorter(true);
		
		scrollPane = new JScrollPane(formationsTable);
		right_side=new JPanel();
		
		left_side=new JPanel();
		left_side.setLayout(new GridLayout(3,2));
		formaNameLabel=new JLabel("Libellé de formation");
		formaDescLabel=new JLabel("Description de formation");
		formaRespoLabel=new JLabel("id Résponsable de formation");
		formaName=new JTextField();
		formaDesc=new JTextField();
		formaRespo=new JTextField();
		left_side.add(formaNameLabel);
		left_side.add(formaName);
		left_side.add(formaDescLabel);
		left_side.add(formaDesc);
		left_side.add(formaRespoLabel);
		left_side.add(formaRespo);
		right_side.add(scrollPane) ;
		
		
		modify=new JButton("Modifier");
		panel.add(addButton, BorderLayout.WEST);
		panel.add(modify, BorderLayout.CENTER);
		panel.add(delete, BorderLayout.EAST);
		
		header = new JPanel();
		header.setLayout(new GridLayout(1,1));
		person_connected=new JLabel("Votre id est : "+idRespoUFR.toString());
		disconnect=new JButton("Se deconnecter");
		header.add(person_connected);
		header.add(disconnect);
		
		
		this.add(right_side, BorderLayout.EAST);
		this.add(left_side, BorderLayout.WEST);
		this.add(panel, BorderLayout.SOUTH);
		this.add(header, BorderLayout.NORTH);
		this.setSize(900,180);
		
	    this.setVisible(true);
	    
	}


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HomeWindow f = new HomeWindow();
		Formation f1=new Formation();
		f1.setLibelle("gffuy");
		f1.setDescription("desc");
		Professeur p=new Professeur();
		p.setEmail("dd");
		p.setNom("gf");
		p.setNummerSomme(5454);
		f1.setP(p);
		ArrayList<Formation> formats = new ArrayList<Formation>();
		formats.add(f1);

		FenetreFormations fd=new FenetreFormations(formats, p.getNummerSomme());
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
