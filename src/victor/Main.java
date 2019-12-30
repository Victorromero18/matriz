package victor;
public class Main {
	public static void main(String[]args) {
		
		int x[][];
		x = new int[4][4];
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 3;
		x[0][3] = 3;
		x[1][0] = 5;
		x[1][1] = 6;
		x[1][2] = 7;
		x[1][3] = 8;
		x[2][0] = 9;
		x[2][1] = 10;
		x[2][2] = 11;
		x[2][3] = 12;
		x[3][0] = 13;
		x[3][1] = 14;
		x[3][2] = 15;
		x[3][3] = 16;
		
		int diagonal=0;
		int diagonal2=0;
		int e= x.length;
		for(int i=0; i<x.length; i++) {
			diagonal = diagonal + x[i][i];
			e--;
			diagonal2 = diagonal2 + x[i][e];
		}
			
		System.out.println(diagonal);
		System.out.println(diagonal2);
	}
	
}


