package assignmentday3;

public class answer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower = 1, higher = 10000;

	     for(int num = lower + 1; num < higher; ++num) {
	       int dig= 0, result = 0;
	       int temp = num;

	       while (temp != 0) {
	        temp /= 10;
	         ++dig;
	       }

	       temp = num;

	       while (temp != 0) {
	         int rem = temp % 10;
	         result += Math.pow(rem, dig);
	         temp /= 10;
	       }
	       
	       
	       if (result == num) 
	    	   System.out.print(num+ " ");
	     }
	}

}
