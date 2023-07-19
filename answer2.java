package assignmentday3;

public class answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1;
		  
		  for(int i=1;i<=6;i++) {
		   for(int j=1; j<=6-i; j++)
		    System.out.print(" ");
		   for(int j=1;j<=i;j++) {
		    System.out.print(s);
		    s++;
		    if(s==10)
		     s=0;
		   }
		   System.out.println();
	}
	}
}
