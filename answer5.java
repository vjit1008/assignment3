package assignmentday3;

public class answer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower = 1, higher = 10000;

	     for(int num = lower + 1; num < higher; ++num) {
	       int dig= 0, result = 0;
	       int tem = num;

	       while (tem != 0) {
	        tem =tem/ 10;
	         ++dig;
	       }

	       tem= num;

	       while (tem != 0) {
	         int rem = tem % 10;
	         result += Math.pow(rem, dig);
	         tem =tem/ 10;
	       }
	       
	       
	       if (result == num) 
	    	   System.out.print(num+ " ");
	     }
	}

}
