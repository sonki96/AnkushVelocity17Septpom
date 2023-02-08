package SarswatiVidyaMandir;

public class marksprogram {
int marathi;
int english;
int hindi;
int history;


public static void main (String []arg) {
	
	marksprogram ankush = new marksprogram ();
	marksprogram dinesh = new marksprogram ();
	marksprogram gaurav = new marksprogram();
	marksprogram geeta = new marksprogram();
	
	ankush.marathi= 75; ankush.english = 85; ankush.hindi= 80; ankush.history = 95;
	dinesh.marathi= 68; dinesh.english = 85; dinesh.hindi= 70; dinesh.history = 65;
	gaurav.marathi= 85; gaurav.english = 55; gaurav.hindi= 50; gaurav.history = 95;
	geeta.marathi= 88; geeta.english = 59; geeta.hindi= 56; geeta.history = 78;
	
	
	System.out.println("Marks of ankush: : " + " "+" M " + ankush.marathi  +" " + " e " + ankush.english + "  h " +ankush.hindi + " hi " + ankush.history );
    System.out.println("Total marks of all subject : " + ( ankush.marathi   +  ankush.english  + ankush.hindi + ankush.history));
	
    System.out.println("Marks of dinesh: : " + " "+" M " + dinesh.marathi  +" " + " e " + dinesh.english + "  h " +dinesh.hindi + " hi " + dinesh.history );
    System.out.println("Total marks of all subject : " + ( dinesh.marathi   +  dinesh.english  + dinesh.hindi + dinesh.history));
    
    System.out.println("Marks of gaurav: : " + " "+" M " + gaurav.marathi  +" " + " e " + gaurav.english + "  h " +gaurav.hindi + " hi " + gaurav.history );
    System.out.println("Total marks of all subject : " +  (gaurav.marathi   +  gaurav.english  + gaurav.hindi + gaurav.history));
    
    System.out.println("Marks of geeta: : " + " "+" M " + geeta.marathi  +" " + " e " + geeta.english + "  h " +geeta.hindi + " hi " + geeta.history );
    System.out.println("Total marks of all subject : " +  (geeta.marathi   +  geeta.english  + geeta.hindi + geeta.history));
}

}
