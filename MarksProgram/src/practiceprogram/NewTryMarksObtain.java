package practiceprogram;

public class NewTryMarksObtain {

	int maths;
	int physics;
	int chemistry;
	
	public static void main(String[]args) {
		
		NewTryMarksObtain ankush = new NewTryMarksObtain();
				ankush.maths = 99;
				ankush.physics = 98;
				ankush.chemistry = 97;
				
		NewTryMarksObtain rahul	= new NewTryMarksObtain();
		rahul.maths = 66;
		rahul.physics = 55;
		rahul.chemistry = 88;
		
		NewTryMarksObtain sonu = new NewTryMarksObtain();
			sonu.maths = 78;
			sonu.physics = 75;
			sonu.chemistry = 79;
		 System.out.println("Marks Of Student " );
		 System.out.println("ankush  maths " + ankush.maths + " physics " + ankush.physics + "  chemistry " + ankush.chemistry);
		 System.out.println("rahul  maths " + rahul.maths + " rahul " + rahul.physics + "  rahul " + rahul.chemistry);
		 System.out.println("sonu  maths " + sonu.maths + " sonu " + sonu.physics + "  sonu " + sonu.chemistry);
	}
}
