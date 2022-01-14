package Practical;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				
				System.out.println();
				
				continue;
				
			  }
			System.out.println(i);
						
			}
		      
		     System.out.println();
		     
		     int num=11;
		     
		     while(num>1) {
		    	 
		    	 num--;
		    	 
		    	 if(num==6) {
		    		 
		    		 System.out.println();
		    		 
		    		 continue;
		    	 }
		    	 
		    	 System.out.println(num);
		     }
		
	}

}
