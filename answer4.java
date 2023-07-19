package assignmentday3;

public class answer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       String S = "";
	        int count = 1;

	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                S += count % 2;
	                count++;

	                if (i == j && i != 5) {
	                    S = S+'\n';
	                }
	            }

	            if (i % 2 == 0) {
	                count = 1;
	            } else {
	                count = 0;
	            }
	        }

	        System.out.println(S);
	    }
	}


