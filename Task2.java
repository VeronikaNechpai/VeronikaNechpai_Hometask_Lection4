package by.epam.lesson4.hometask4;

public class Task2 {
	public static void main(String[] args) {
		int[]A= {1, 2, 3, 5, 6, 7};
		boolean inc=false;
		for (int i=1; i<A.length; i++){
			if (A[i]>A[i-1]){
				inc=true;
				break;
			}
		}
		if(inc=true) {
			System.out.println("Increment mass");
        } else {
		System.out.println("Not Increment mass");
		}
		}
		}
