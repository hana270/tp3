package tp4;

public class Vehicule {

	private int numero =0;
	private String marque;
	private String modele;
	private int annee;
	private double prix;
	private static int count;

	public Vehicule(String marque, String modèle, int année, double prix) {
		count++;
		this.numero=count;
		this.marque=marque;
		this.modele=modèle;
		this.annee=année;
		this.prix=prix;
		
	}
	
@Override
public String toString() {
		
	return "Vehicule numero=" + numero + " , marque=" + marque + ", modele=" + modele + ", annee=" + annee
				+ ", prix=" + prix;
	}

	public void decrisVehicule() {
		System.out.println(toString());
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public int getCount() { 
		return count;
	}
	public int getAnnee() {
		return annee;
	}
	
	
}
