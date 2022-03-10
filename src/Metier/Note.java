package Metier;

public class Note {

	private int idNote;
	private Etudiant e;
	private Professeur p;
	private Module m;
	private float note;



	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Note(int idNote, Etudiant e, Professeur p, Module m, float note) {
		super();
		this.idNote = idNote;
		this.e = e;
		this.p = p;
		this.m = m;
		this.note = note;
	}



	public int getIdNote() {
		return idNote;
	}



	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}



	public Etudiant getE() {
		return e;
	}



	public void setE(Etudiant e) {
		this.e = e;
	}



	public Professeur getP() {
		return p;
	}



	public void setP(Professeur p) {
		this.p = p;
	}



	public Module getM() {
		return m;
	}



	public void setM(Module m) {
		this.m = m;
	}



	public float getNote() {
		return note;
	}



	public void setNote(float note) {
		this.note = note;
	}



	@Override
	public String toString() {
		return "Note [idNote=" + idNote + ", e=" + e + ", p=" + p + ", m=" + m + ", note=" + note + "]";
	}



	public void afficher() {
		System.out.println(this.toString());
	}

}
