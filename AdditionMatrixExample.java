package additionmatrix;

public class AdditionMatrixExample {

public static void main(String[] args){
		// creating two matrices
int a[][]= {{1,3,4},{2,3,4},{3,4,5}};
int b[][]= {{1,3,4},{2,3,4},{3,4,5}};
		
		//creating another matrix to store sum of two matrices
		
int c[][]= new int[3][3];//3 row & 3 column
		//addition and printing of two matrices
		
for(int i=0; i<3; i++) { 
for( int j=0; j<3; j++) {
	
c[i][j] = a[i][j] +b[i][j]; //use for substraction
System.out.println(c[i][j] +" ");
	}
System.out.println();//new line 
	    	
    }
    }
} 
