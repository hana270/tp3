package tp4;

public class testagence {
	public static void main(String...args) {
		
		agencemobiliere A=new agencemobiliere(3);
		Vehicule v=new Vehicule("Clio","Classique",2000,20.000); 
		Vehicule w=new Vehicule("Mercedes","Fantome",2008,60.000);
		Vehicule x=new Vehicule("KIA","Picanto",2012,35.000);
	
		A.ajoutVehicule(v);
		A.ajoutVehicule(w);
		A.ajoutVehicule(x);
		
		System.out.println("Les elements du tableau sont :");
		v.decrisVehicule();
		w.decrisVehicule();
		x.decrisVehicule();
		System.out.println("\n");
		
		A.selection("Mercedes");
		//A.Selection(2);
		System.out.println("\nVehicule la plus ancienne est :");
		A.plusAncienne();
		
		
			
		}
		
		
		
		
		
		
		
	}

