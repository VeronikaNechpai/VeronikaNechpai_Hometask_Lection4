package by.epam.lesson4.hometask4;

public class Task3 {
	public static int[]B;
	public static boolean BIsEmpty = true;
	
	public static void main(String[] args) {
		int[]A= new int[5];
		A[0]=1;
		A[1]=0;
		A[2]=1;
		A[3]=0;
		A[4]=1;
	findnull(A); 
	}
	private static void findnull(int[] A) {{
		System.out.print("Massive A equals: ");
		for (int i=0; i<A.length; i++){
			if (A[i]==0){
				if (BIsEmpty){
					B[0]= i;
					BIsEmpty=false;
				}else {
					int[]temp=new int[B.length+1];
					System.arraycopy(B, 0, temp, 0, B.length);
					B=temp;
					B[B.length -1]=i;
			}
		}
	}
		System.out.println();
        for (int B1:B) {
System.out.print(B1 + " ");
        }
		}
	}
}