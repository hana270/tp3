package tp4;

public class agencemobiliere {

	private Vehicule[] tab;
	private final int max;
	private int nb=0;
	
	public agencemobiliere(int max) {
		this.max=max;
		tab=new Vehicule[this.max];
	}
	
	 public void ajoutVehicule(Vehicule v) {
		 if(nb < max) {
			 tab[nb]=v;
			 nb++;
		 }else {
			 System.out.println("le nombre de vehicule est saturee");
		 }
	 }
	 
	 public void Selection(int n) {
		 boolean trouve = false;
		 if(n<nb || tab[n]!=null ) {
			 tab[n].decrisVehicule();
			 trouve=true;
		 }
		if(!trouve) {
			 System.out.println("cette case est introuvable dans ce tableau");
		 }
		 }
	 
	 public void selection(String mq) {
		    boolean a= false;
		    for (int i = 0; i < nb; i++) {
		        if (tab[i].getMarque().equals(mq)) {
		            tab[i].decrisVehicule();
		            a = true;
		        }
		    }

		    if (!a) {
		        System.out.println("Il n'y a pas de véhicules de la marque " + mq);
		    }
		}
	 public void selection(Double px) {
		 int i;
		 boolean exist=false;
		 for(i=0;i<nb;i++) {
			 if(tab[i].getPrix()<px){
				 tab[i].decrisVehicule();
				 exist=true;
			 	} 
			 
			 }
		 if(!exist){
				System.out.println("il n’y a pas de véhicules dans cette marge de prix");
			 }
		
	 }
	 public void plusAncienne() {
		 int i; 
		 Vehicule a=tab[0];
		 for(i=1 ; i<nb ; i++) {
			 if(a.getAnnee()>tab[i].getAnnee()) {
				  a=tab[i];
			 }
			
			
			}
		 a.decrisVehicule();
		 //System.out.println(a);
		 
	
	 }
		 

}
	

