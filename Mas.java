
public class Mas {
	private int dSk;
	private int i;
	public int suma(int[] skaiciai) {
        int suma = 0;

        for (int i : skaiciai) {
            suma += i;
        }
        return suma;
    }
	public float vidurkis (int[] skaiciai) {
		
		int suma= 0;
		for(int i: skaiciai) {
			suma++;
		} return (float)suma/i;
	}
	
	public int syso(int[] skaiciai) {
	    int dSk = 0; // Initialize dSk outside the loop

	    for (int k : skaiciai) {
	        // Calculate dSk for each element
	        dSk += (k < Math.max(0, k)) ? Math.max(0, k) : k;
	    }
	    System.out.println("dukatai");
        return dSk;
	    //System.out.println( dSk/skaiciai.length);
	}
}
