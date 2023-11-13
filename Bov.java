
public class Bov {
	
 private int b;
 private int a;
 private int c;
 private String name;
 
     public Bov(int a, int b) {
	 this.a=a;
	 this.b =b;
	 
     };
     public Bov(int a, int b, int c) {
    	 this.a=a;
    	 this.b =b;
    	 this.c=c;
         };
     
     public Bov(int a, String name) {
	 this.a=a;
	 this.name =name;
 	 }	 
    
     public void add(int a,int b) {
     int z= a + b;
	 System.out.println (z) ;
	 System.out.println (" Du intai");
	 }
     public void add(int a,int b,int c) {
         int z= a + b+ c;
    	 System.out.println (z) ;
    	 System.out.println (" Trys intai");}
     public void print(int a, String name) {
    	 
    	 String pranesimas = (name.equals("Herkus")&a<=18) ? "Jis " : "Ne jis";
    	 System.out.println(pranesimas);
    	 
    		 
     }
     
}
