package by.epam.lesson4.hometask4;

public class Task1 {
	public static void main(String[] args) {
		int[]A= {1, 2, 3, 4, 5, 6};
		int k=2;
		int sum=0;
		for (int i=0; i<A.length; i++){
			if (A[i]%k==0) 
				sum=sum+A[i];
			}
		System.out.println("Sum = " + sum);
		}
		}
