
public class pattern1 {

	
public static void main(String[] args) {
	int n= 5;
	//INEURON
 //I   pattern
	for (int i = 0; i <n; i++ ) 
	{
		for (int j = 0 ; j <n; j++ ) 
		{
			if (  j==(n-1)/2) 
				System.out.print("*");
			
			else 
				System.out.print(" ");
			
		}
		System.out.print( "");
			
	//N pattern
	
		for (int j = 0 ; j <n; j++ ) 
		{
			if ( j==0 || j==n-1 || i==j || j==i) 
				System.out.print("*");
			
			else 
				System.out.print(" ");
			
		}
		System.out.print( "");
	//E pattern	
		for (int j = 0 ; j <n; j++ ) 
		{
			if ( j==0 ||i==0 || i==(n-1)/2 || i==n-1 ) 
				System.out.print("*");
			
			else 
				System.out.print(" ");
			
		}
		System.out.print( " ");
		
		
		
		//U pattern
		for (int j = 0 ; j <n; j++ ) 
		{
			if (i == n - 1 || j == 0    && j<n-1 || j == n- 1  )
				System.out.print("*");
			
			else 
				System.out.print(" ");
			
		}
		System.out.print( " ");
		
	//R pattern	
		
		for (int j = 0 ; j <n; j++ ) 
		{
			if((i == 0 || i == n/2) && j < (n- 2) ||j==0) 
				System.out.print("*");
			else if( j == (n - 2) && !(i == 0 || i == n/2))
                System.out.printf("*");  
			else 
				System.out.print(" ");
			
		}
		System.out.print( " ");
		
		
	//o pattern	
		for (int j = 0 ; j <n; j++ ) 
		{
			if (i == 0 && j!=0 && j!=n-1 || j == 0 && i>0 && i<n-1 || j == n-1 && i>0 && i<n-1  || i==n-1 && j!=0 && j!=n-1   )
				System.out.print("*");
			
			else 
				System.out.print(" ");
			
		}
		System.out.print( "  ");
		
	//	N  pattern
		for (int j = 0 ; j <n; j++ ) 
		{
			 if ( j==0 || j==n-1 || i==j || j==i)
				System.out.print("*");
			
			else 
				System.out.print(" ");
			
		}
		System.out.print( " ");
		
		System.out.println();
	
	}
}

}
