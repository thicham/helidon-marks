package demo.gestion.notes.mp.model;

public class Notes {
	
	private String idEtudiant;
	private String matiere;
	private String resultat;
	
	
	
	
	public Notes(String idEtudiant, String matiere, String resultat) {
		super();
		this.idEtudiant = idEtudiant;
		this.matiere = matiere;
		this.resultat = resultat;
	}
	
	public String getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(String idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	
	
	
	

}
