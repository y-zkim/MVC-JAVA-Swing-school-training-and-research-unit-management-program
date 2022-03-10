package Presentation;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import Persistance.ModelTable;
import Persistance.ModelTableSoutenances;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Metier.Doctorant;
import Metier.Soutenance;


public class FenetreSoutenances extends JFrame {

	JTable SoutenanceTable;
	JScrollPane scrollPane;
	ModelTableSoutenances etuds;
	JButton delete;
	JButton addButton,modify;
	JPanel buttons,right_side, left_side,header,panel;
	JLabel soutIdLabel, docNameLabel, juryLabel,soutDateLabel;
	JTextField soutId, docName, jury,soutDate;
	Controleur c;
	
	public  FenetreSoutenances(ArrayList<Soutenance> Soutenances) {
		super("Liste des Soutenances");
		
		this.setLayout(new BorderLayout());
		buttons = new JPanel();
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		
		delete = new JButton("Delete");
		//delete.addActionListener(this);
		
		addButton = new JButton("Add");
		//addButton.addActionListener(this);
		
		etuds = new ModelTableSoutenances(Soutenances);
		SoutenanceTable = new JTable(etuds);
		
		SoutenanceTable.setAutoCreateRowSorter(true);
		
		scrollPane = new JScrollPane(SoutenanceTable);
		//this.add(scrollPane, BorderLayout.CENTER);
		
		right_side=new JPanel();
		
		left_side=new JPanel();
		left_side.setLayout(new GridLayout(4,2));
		soutIdLabel=new JLabel("Id soutenance");
		docNameLabel=new JLabel("Nom doctorant");
		juryLabel=new JLabel("Jury");
		soutDateLabel=new JLabel("Date");
		soutId=new JTextField();
		docName=new JTextField();
		jury=new JTextField();
		soutDate=new JTextField();
		left_side.add(soutIdLabel);
		left_side.add(soutId);
		left_side.add(docNameLabel);
		left_side.add(docName);
		left_side.add(juryLabel);
		left_side.add(jury);
		left_side.add(soutDateLabel);
		left_side.add(soutDate);
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
			Soutenance st1=new Soutenance();
			st1.setIdSoutenance(1);
			Doctorant d = new Doctorant();
			d.setNom("doctorant 1");
			st1.setDoc(d);
			Date d1 = new Date();
			d1.setYear(2021);
			d1.setMonth(10);
			d1.setDate(12);
			st1.setDateSoutenance(d1);
			
			
			Soutenance st2=new Soutenance();
			st2.setIdSoutenance(2);
			//Doctorant d0 = new Doctorant();
			d.setNom("doctorant 1");
			st2.setDoc(d);
			Date d2 = new Date();
			d2.setYear(2021);
			d2.setMonth(6);
			d2.setDate(16);
			st2.setDateSoutenance(d2);
			ArrayList<Soutenance> etu = new ArrayList<Soutenance>();
			etu.add(st1);
			etu.add(st2);
			
			FenetreSoutenances fd=new FenetreSoutenances(etu);
			

		}

}
