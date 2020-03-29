import java.util.Scanner;

public class InputOutput{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		String nama;
		int jumlahSks;
		double IPK;
		
		
		System.out.print("Input your name : ");
		nama = scanner.nextLine();
		System.out.println("Harooo, "+nama);
		
		System.out.print("Input accumulated SKS you've already taken: ");
		jumlahSks = scanner.nextInt();
		
		System.out.print("Input temporary IPK: ");
		IPK = scanner.nextDouble();
		
		double jumlah = IPK * jumlahSks;
		System.out.println("Total Value = "+jumlah);
		
		
	}
}

