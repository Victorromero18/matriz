package victor;
public class Main {
	public static void main(String[]args) {
		
		int x[][];
		x = new int[3][3];
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		x[1][2] = 6;
		x[2][0] = 7;
		x[2][1] = 8;
		x[2][2] = 9;
		
		int diagonal=0;
		
		for(int i=0; i<x.length; i++) {
			diagonal = diagonal + x[i][i];
			
		}
			
		System.out.println(diagonal);
		
	}
	
}


