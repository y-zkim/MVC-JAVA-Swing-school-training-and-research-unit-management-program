package Presentation;


import java.awt.BorderLayout;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import Persistance.ModelTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Metier.Doctorant;


public class FenetreDoctorant extends JFrame implements ActionListener{

	JTable doctorantTable;
	JScrollPane scrollPane;
	ModelTable docs;
	JButton delete;
	JButton addButton;
	JPanel buttons;
	Controleur c;
	
	public  FenetreDoctorant(ArrayList<Doctorant> doctorants) {
		super("Liste des Doctorants");
		
		this.setLayout(new BorderLayout());
		buttons = new JPanel();
		buttons.setLayout(new BorderLayout());
		
		delete = new JButton("Delete");
		//delete.addActionListener(this);
		
		addButton = new JButton("Add");
		//addButton.addActionListener(this);
		
		docs = new ModelTable(doctorants);
		doctorantTable = new JTable(docs);
		
		doctorantTable.setAutoCreateRowSorter(true);
		
		scrollPane = new JScrollPane(doctorantTable);
		this.add(scrollPane, BorderLayout.CENTER);
		
		buttons.add(delete, BorderLayout.EAST);
		buttons.add(addButton, BorderLayout.WEST);
		
		this.add(buttons, BorderLayout.SOUTH);
	    this.setSize(700, 250);
	    this.setVisible(true);
	    this.addButton.addActionListener(this);
	    
	}

	


		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//HomeWindow f = new HomeWindow();
			Doctorant d1=new Doctorant();
			d1.setNom("ahmed");
			//d1.setNummerEtudiant(15);
			d1.setEmail("hhd15@ddf5");
			d1.setSujetThese("sujet hfhfh");
			//d1.setProfesseur(null, 0);;
			//d1.setChargeHoraire(null);
			d1.setDateInscription(null);
			System.out.println(d1.getNom());
			System.out.println(d1.getEmail());
			System.out.println(d1.getSujetThese());
			System.out.println(d1.getEncadrant());
			
			Doctorant d2=new Doctorant();
			d2.setNom("hemmadi");
			//d2.setNummerEtudiant(16);
			d2.setEmail("ds8@545454");
			d2.setSujetThese("sujet 87878415");
			//d2.setProfesseur(null, 0);
			//d2.setChargeHoraire(null);
			d2.setDateInscription(null);
			ArrayList<Doctorant> doctos = new ArrayList<Doctorant>();
			doctos.add(d2);
			doctos.add(d1);
			
			FenetreDoctorant fd=new FenetreDoctorant(doctos);
			

		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == addButton) {
				//Doctorant doc = new Doctorant();
			}
			
		}

}
