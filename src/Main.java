import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Değişkenler oluşturuluyor
		int mat, fiz, kim, tur, tar, muz;
		
		//Scanner sınıfı tanımlanıyor
		Scanner in= new Scanner(System.in);
		
		//Kullanıcıdan not değerleri alınıyor
		System.out.print("Matematik Notunuz : ");
		mat = in.nextInt();
		
		System.out.print("Fizik Notunuz : ");
		fiz = in.nextInt();
		
		System.out.print("Kimya Notunuz : ");
		kim = in.nextInt();
		
		System.out.print("Türkçe Notunuz : ");
		tur = in.nextInt();
		
		System.out.print("Tarih Notunuz : ");
		tar = in.nextInt();
		
		System.out.print("Müzik Notunuz : ");
		muz = in.nextInt();
		
		int toplam = (mat + fiz + kim + tur + tar + muz);
		double ort=toplam/6;
		String durum;
		durum =(ort>60) ? "Geçti" : "Kaldı";
		System.out.println("\nGirdiğiniz notlar: \nMatematik:" + mat 
				+"\nFizik\t:" + fiz
				+"\nKimya\t:" + kim
				+"\nTürkçe\t:" + tur
				+"\nTarih\t:" + tar
				+"\nMüzik\t:" + muz
				+"\n\nGirdiğiniz notlara göre ortalamanız: " + ort
				+"\n\nOrtalamanıza göre durumunuz: " + durum);
		
		
	}

}
