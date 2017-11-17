import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String namaDosen;
		String matkul;

		Scanner scan = new Scanner(System.in);

		System.out.print("a. web1 ");
		System.out.print("b. algoritma ");
		System.out.print("c. kalulus (pilih mata kuliah):");
		matkul= scan.nextLine();

		System.out.print("a. Hadi ");
		System.out.print("b. Firman ");
		System.out.print("c. Riki Aef (Pilih dosen):");
		namaDosen = scan.nextLine();

		Notif notif = new Notif();
		notif.allert();

		notif.mhs();
	}
}