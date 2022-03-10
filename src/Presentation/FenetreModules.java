package Presentation;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Metier.Doctorant;
import Metier.Formation;
import Metier.Module;
import Metier.Professeur;
import Persistance.ModelTableModules;
import Persistance.ModelTableformation;

public class FenetreModules extends JFrame implements ActionListener{
	JTable moduleTable;
	JScrollPane scrollPane;
	ModelTableModules mods;
	JButton delete;
	JButton addButton;
	JPanel panel;
	Controleur c;
	
	public FenetreModules(ArrayList<Module> modules) {
		super("Liste des modules");
		
		this .setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		delete = new JButton("Delete");
		
		addButton = new JButton("Add");
		
		mods = new ModelTableModules(modules);
		moduleTable = new JTable(mods);
		
		moduleTable.setAutoCreateRowSorter(true);
		
		scrollPane = new JScrollPane(moduleTable);
		this.add(scrollPane, BorderLayout.CENTER);
		
		panel.add(delete, BorderLayout.EAST);
		panel.add(addButton, BorderLayout.WEST);
		
		this.add(panel, BorderLayout.SOUTH);
	    this.setSize(700, 250);
	    this.addButton.addActionListener(this);
	    this.delete.addActionListener(this);
	    this.setVisible(true);
	    
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == delete) {
			int [] selectedRows = moduleTable.getSelectedRows();
			for (int row : selectedRows)
				c.supprimerModule(row);
		}
	}
	
	

}
