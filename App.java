
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] skaiciai = {1, 2, 3, 4, 5,4}; // Masyvas su skaičiais
	    Mas mas = new Mas();
	    int suma = mas.suma(skaiciai); // Iškviečiame "suma" metodą
	    
	     System.out.println("Suma: " + suma);
	     int[] skaiciai1 = {1, 2, 3, 4,-5 ,6,7}; // Masyvas su skaičiais
	    Mas mas1 = new Mas();
	  
	    mas1.syso(skaiciai1);
	
	    
	     
	    int a =suma;
		int b= Math.max(skaiciai.length,suma);
		int c= Math.min(skaiciai1.length,suma);
		String name = "Herkus";
		Bov bov = new Bov(a, b,c);
		bov.add(suma, a,c);
		Bov bov1 = new Bov(a, b);
	bov1.add(suma,mas.syso(skaiciai1) );
	    Bov bov2= new Bov( b,name);
		//System.out.println (new bov);
		bov2.print( mas.syso(skaiciai1), "Herkus");
		
		
	    }

	
}
	
	
