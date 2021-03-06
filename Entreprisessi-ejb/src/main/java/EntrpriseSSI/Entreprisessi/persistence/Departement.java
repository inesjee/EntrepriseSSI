package EntrpriseSSI.Entreprisessi.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Departement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 971187750708604392L;
	
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@ManyToMany
	private List<Employe> employes;
	
	@ManyToOne
	private Entreprise entreprise;
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	
}
