package Presentation;

import Metier.*;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Metier.Etudiant;

public class Login extends JFrame implements ActionListener {

	JButton seConnecter;
	JPanel innerPanel, containerPanel;
	JLabel emailLabel, mdpFieldLabel, statut;
	JTextField email;
	JPasswordField mdpField;
	JRadioButton etudRadio, profRadio, ufrRadio;
	Controleur c;

	public Login() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super("Login");

		this.setLayout(new BorderLayout());
		seConnecter = new JButton("Valider");
		emailLabel = new JLabel("Email : ");
		email = new JTextField();
		mdpFieldLabel = new JLabel("Mot de passe (votre nom) : ");
		mdpField = new JPasswordField();
		seConnecter = new JButton("Se connecter");

		innerPanel = new JPanel();
		innerPanel.setLayout(new GridLayout(2, 2));
		innerPanel.add(emailLabel);
		innerPanel.add(email);
		innerPanel.add(mdpFieldLabel);
		innerPanel.add(mdpField);

		statut = new JLabel("Selectioner votre Statut :");

		etudRadio = new JRadioButton("Etudiant");
		profRadio = new JRadioButton("Professeur");
		ufrRadio = new JRadioButton("Responsable UFR");
		etudRadio.setBounds(75, 50, 100, 30);
		profRadio.setBounds(75, 100, 100, 30);
		ufrRadio.setBounds(75, 100, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(etudRadio);
		bg.add(profRadio);
		bg.add(ufrRadio);
		JPanel p = new JPanel();
		p.add(etudRadio);
		p.add(profRadio);
		p.add(ufrRadio);
		p.setLayout(new FlowLayout());

		containerPanel = new JPanel();
		containerPanel.setLayout(new BorderLayout());
		containerPanel.add(statut, BorderLayout.NORTH);
		containerPanel.add(innerPanel, BorderLayout.CENTER);
		containerPanel.add(p, BorderLayout.EAST);
		containerPanel.add(seConnecter, BorderLayout.SOUTH);

		this.add(containerPanel, BorderLayout.CENTER);
		this.add(seConnecter, BorderLayout.SOUTH);
		seConnecter.addActionListener(this);
		this.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(seConnecter)) {
			if (etudRadio.getSelectedObjects() != null) {
				Etudiant et = new Etudiant(new String( mdpField.getPassword()), email.getText());
				c.etudCompte(et);
			}
//			if (profRadio.getSelectedObjects() != null) {
//				Etudiant et = new Etudiant(new String( mdpField.getPassword()), email.getText());
//				System.out.println(mdpField.getPassword());
//				System.out.println(email.getText() );
//				c.profCompte(et);
//			}
			if (ufrRadio.getSelectedObjects() != null) {
				Professeur et = new Professeur(new String( mdpField.getPassword()), email.getText());
//				System.out.println(mdpField.getPassword());
//				System.out.println(email.getText() );
				c.ufrCompte(et);
			}
		}
		/*
		 * if (e.getSource().equals(b2)) { f.setTitle(b2.getText()); }else if
		 * (e.getSource().equals(b3)){ f.setTitle(b3.getText()); }
		 */
	}
	/*
	 * private void actionAjouter() { this.personnel.addActionListener(new
	 * ActionListener() {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * FentreDoctorant etudiant = new FentreDoctorant(null); dispose(); } }); }
	 */


}
