package Presentation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class HomeWindow extends JFrame implements ActionListener {
	
	JButton parcoursScolaire,personnel, doctorats, publications, soutenances, formations, modules, statistiques ;
	JPanel innerPanel, containerPanel;
	final JLabel header = new JLabel("Menu principal\n Panneau de gestion de l'UFR") ;
	Controleur c;
	public HomeWindow() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		
		this.setLayout(new BorderLayout());
		parcoursScolaire = new JButton("Parcours Scolaire des étudiants");
		personnel = new JButton("Personnel");
		doctorats = new JButton("Doctorats");
		publications = new JButton("Publications");
		soutenances = new JButton("Soutenances");
		formations = new JButton("Formations");
		modules = new JButton("Modules");
		
		innerPanel = new JPanel();
		innerPanel.setLayout(new GridLayout(4,2));
		innerPanel.add(parcoursScolaire);
		innerPanel.add(personnel);
		innerPanel.add(doctorats);
		innerPanel.add(publications);
		innerPanel.add(soutenances);
		innerPanel.add(formations);
		innerPanel.add(modules);
		
		containerPanel = new JPanel();
		containerPanel.setLayout(new BorderLayout());
		containerPanel.add(innerPanel, BorderLayout.CENTER);
		statistiques = new JButton("Statistiques");
		containerPanel.add(statistiques, BorderLayout.SOUTH);
		
		this.add(containerPanel, BorderLayout.CENTER);
		this.add(header, BorderLayout.NORTH);
		this.setSize(700, 250);
	    this.setVisible(true);
	    this.formations.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == formations) {
			//c.lancerFenForm();
		}
		
	}   
}
