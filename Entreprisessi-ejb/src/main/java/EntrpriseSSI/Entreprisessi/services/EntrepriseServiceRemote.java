package EntrpriseSSI.Entreprisessi.services;

import javax.ejb.Remote;

import EntrpriseSSI.Entreprisessi.persistence.Entreprise;

@Remote
public interface EntrepriseServiceRemote {
	
	public int ajouterEntreprise(Entreprise entreprise);

}
