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
		
		int diagonal1 =0;
		
		diagonal1 = x[0][0] + x[1][1] + x[2][2];
		
		System.out.println("La suma de la primer diagonal es: " + diagonal1);
		
		int diagonal2 =0;
		
		diagonal2 = x[2][0] + x[1][1] + x[0][2];
		
		System.out.println("La suma de la segunda diagonal es: " + diagonal2);
		
		int diagonal3 =0;
		
		diagonal3 = diagonal1 + diagonal2;
		
		System.out.println("La suma de las dos diagonales es: " + diagonal3);
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) {
				
				System.out.print(x[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
	
}

//for (int i =0 ; i < 2; i ++)
	//for (int j=0; j<2; j++)
	//System.out.println(arr);
//System.out.println("x["+i+"]["+j+"] = "+x[i][j]);
