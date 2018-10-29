package fr.iut;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Cart {
	private int prix =0;


	private HashMap<Item,Integer> tamere = new HashMap<>();
	

	


	public double calculCartHT() {
		Set<Item> cle=this.tamere.keySet();
		Iterator<Item> it = cle.iterator();
		while(it.hasNext())
		{
			Item clef = it.next();
			prix = clef.getPrix()*tamere.get(clef) + prix;	
	}
		return prix;
	}
	
	public void addItemtoCart(Item g,int quan)
	{
		tamere.put(g, quan);
	}
	
	public double calculcartHTreduc(double prix) {
		if (prix < 1000) {
			return prix-prix*0;
		}
		else if (prix < 5000) {
			return (prix-prix*0.03);
		}
		else if(prix < 7000) {
			return (prix-prix*0.05);
		}
		else if(prix < 10000) {
			return (prix-prix*0.07);
		}
		else if (prix <50000) {
			return (prix-prix*0.10);
		}
		else {
			return (prix-prix*0.15);
		}
	}
	
	public double calculcartTTC(String pays, double prix) {
		switch (pays) {
		case "FR" : return (prix + prix * 0.196);
		case "DE" : return (prix + prix * 0.19);
		case "DK" : return (prix + prix * 0.25);
		case "HR" : return (prix + prix * 0.25);
		case "IS" : return (prix + prix * 0.255);
		case "CH" : return (prix + prix * 0.08);
		default : return(prix + prix * 0.196);
		}
	}
}

