package nhapthang;
import java.util.Scanner;

public class chanle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.println(">> Kiểm tra số chẳn lẽ <<");
		 System.out.print("Vui lòng nhập số cần kiểm tra: ");
		 int so = scanner.nextInt();
		 if (so % 2 == 0) {		
		 System.out.println("Số " + so + " là số chẵn.");
		 } else {
		 System.out.println("Số " + so + " là số lẽ.");
		 }
	}
		

	}


