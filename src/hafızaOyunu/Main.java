package hafýzaOyunu;

import java.util.Scanner;

public class Main {
	public static Kart[][] kartlar= new Kart[4][4];
	
	public static void oyunTahtasý() {
		System.out.println("-----------------");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(kartlar[i][j].isTahmin()) {
					System.out.print(" |" + kartlar[i][j].getDeger() +"| ");
				}else {
					System.out.print(" | | ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("-----------------");
	}
	
	public static boolean oyunBittimi() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(kartlar[i][j].isTahmin()== false) { //YANÝ EN AZ 1 TANE BÝLE KART TAHMÝN EDÝLMEMÝÞÞE
					return false;                      //FALSE DÖNECEK,DEVAM ETMESÝ LAZIM
				}
			}
		}
		return true;
	}
	
	public static void tahminEt() {
	 Scanner scanner = new Scanner(System.in);
    
    System.out.print("Birinci Tahmin (i ve j deðerlerini bir boþluklu girin...): ");
    int i1 = scanner.nextInt();
    int j1 = scanner.nextInt();
    
    kartlar[i1][j1].setTahmin(true);
    oyunTahtasý();
    
    System.out.print("Ýkinci Tahmin (i ve j deðerlerini bir boþluklu girin...): ");
    int i2 = scanner.nextInt();
    int j2 = scanner.nextInt();
    
    if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
        System.out.println("Doðru Tahmin. Tebrikler!");
        kartlar[i2][j2].setTahmin(true);
        
    }
    else {
        System.out.println("Yanlýþ Tahmin...");
        kartlar[i1][j1].setTahmin(false);
        
    }
    
}

	public static void main(String[] args) {
		// 4*4 matrikslik ,
	//  Kart[][] kartlar= new Kart[4][4]; //BÖYLE YAZARSAK EÐER GLOBAL DEÐÝÞKEN OLDUÐU ÝÇÝN
		kartlar[0][0]=new Kart("A");       // PARANTEZDEN ÇIKINCA KARTLAR GÖRÜNMEZ .
		kartlar[0][1]=new Kart("B");          //O YÜZDEN EN ÜSTE CLASSIN ÖZELLÝÐÝ OLARAK YAZICAÐIZ
		kartlar[0][2]=new Kart("A");
		kartlar[0][3]=new Kart("D");
		kartlar[1][0]=new Kart("C");
		kartlar[1][1]=new Kart("F");
		kartlar[1][2]=new Kart("E");
		kartlar[1][3]=new Kart("H");
		kartlar[2][0]=new Kart("I");
		kartlar[2][1]=new Kart("H");
		kartlar[2][2]=new Kart("I");
		kartlar[2][3]=new Kart("F");
		kartlar[3][0]=new Kart("D");
		kartlar[3][1]=new Kart("E");
		kartlar[3][2]=new Kart("C");
		kartlar[3][3]=new Kart("B");
		//oyunTahtasý();
		
		 while (oyunBittimi() == false) {
	            
	            oyunTahtasý();
	            
	            tahminEt();
	            
	        }
	        
	}
	

}
