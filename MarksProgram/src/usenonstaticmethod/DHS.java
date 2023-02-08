package usenonstaticmethod;

public class DHS {
int english;
int marathi;
int hindi;

 public void avdhut(){
	 english = 78;
	 marathi = 65;
	 hindi = 70;
	 System.out.println(" marks of avdhut  : " + (  english + marathi + hindi) );
 }
	 
	 public void guru () {
		 english = 88;
		 marathi = 99;
		 hindi = 77;
		 System.out.println(" marks of guru  : " + ( english + marathi + hindi) );
		 
	 
 }
	 public static void main(String[] args) {
		 DHS ob = new DHS();
		ob.avdhut();
		ob.guru();		 
	 }
	 
 }
 
