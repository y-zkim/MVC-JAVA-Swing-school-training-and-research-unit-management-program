package Presentation;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import Persistance.ModelTable;
import Persistance.ModelTableEtudiants;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Metier.Doctorant;
import Metier.Etudiant;


public class FenetreEtudiants extends JFrame {

	JTable etudiantTable;
	JScrollPane scrollPane;
	ModelTableEtudiants etuds;
	JButton delete;
	JButton addButton,modify;
	JPanel buttons,right_side, left_side,header,panel;
	JLabel etudNumLabel, etudNomLabel, etudEmailLabel,etudNivLabel;
	JTextField etudNum, etudNom, etudEmail,etudNiv;
	Controleur c;
	
	public  FenetreEtudiants(ArrayList<Etudiant> etudiants) {
		super("Liste des etudiants");
		
		this.setLayout(new BorderLayout());
		buttons = new JPanel();
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		
		delete = new JButton("Delete");
		//delete.addActionListener(this);
		
		addButton = new JButton("Add");
		//addButton.addActionListener(this);
		
		etuds = new ModelTableEtudiants(etudiants);
		etudiantTable = new JTable(etuds);
		
		etudiantTable.setAutoCreateRowSorter(true);
		
		scrollPane = new JScrollPane(etudiantTable);
		//this.add(scrollPane, BorderLayout.CENTER);
		
		right_side=new JPanel();
		
		left_side=new JPanel();
		left_side.setLayout(new GridLayout(4,2));
		etudNumLabel=new JLabel("Numero etud");
		etudNomLabel=new JLabel("Nom");
		etudEmailLabel=new JLabel("Email");
		etudNivLabel=new JLabel("Niveau d'inscription");
		etudNum=new JTextField();
		etudNom=new JTextField();
		etudEmail=new JTextField();
		etudNiv=new JTextField();
		left_side.add(etudNumLabel);
		left_side.add(etudNum);
		left_side.add(etudNomLabel);
		left_side.add(etudNom);
		left_side.add(etudEmailLabel);
		left_side.add(etudEmail);
		left_side.add(etudNivLabel);
		left_side.add(etudNiv);
		right_side.add(scrollPane) ;
		
		modify=new JButton("Modifier");
		panel.add(addButton, BorderLayout.WEST);
		panel.add(modify, BorderLayout.CENTER);
		panel.add(delete, BorderLayout.EAST);
		
		header = new JPanel();
		header.setLayout(new GridLayout(1,1));
		JLabel person_connected=new JLabel("Votre id est : ");
		JButton disconnect=new JButton("Se deconnecter");
		header.add(person_connected);
		header.add(disconnect);
		
		
		this.add(right_side, BorderLayout.EAST);
		this.add(left_side, BorderLayout.WEST);
		this.add(panel, BorderLayout.SOUTH);
		this.add(header, BorderLayout.NORTH);
		this.setSize(900,180);

	    this.setSize(800, 200);
	    this.setVisible(true);
	    
	}

	


		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//HomeWindow f = new HomeWindow();
			Etudiant e1=new Etudiant();
			e1.setEmail("gfwdgvsd");
			e1.setIdNiveau(5);
			e1.setNom("ahmad");
			e1.setNummerEtudiant(1);
			
			
			Etudiant e2=new Etudiant();
			e2.setEmail("azerty");
			e2.setIdNiveau(4);
			e2.setNom("eaea");
			e2.setNummerEtudiant(2);
			ArrayList<Etudiant> etu = new ArrayList<Etudiant>();
			etu.add(e2);
			etu.add(e1);
			
			FenetreEtudiants fd=new FenetreEtudiants(etu);
			

		}

}
