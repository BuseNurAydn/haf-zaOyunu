package haf�zaOyunu;

import java.util.Scanner;

public class Main {
	public static Kart[][] kartlar= new Kart[4][4];
	
	public static void oyunTahtas�() {
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
				if(kartlar[i][j].isTahmin()== false) { //YAN� EN AZ 1 TANE B�LE KART TAHM�N ED�LMEM���E
					return false;                      //FALSE D�NECEK,DEVAM ETMES� LAZIM
				}
			}
		}
		return true;
	}
	
	public static void tahminEt() {
	 Scanner scanner = new Scanner(System.in);
    
    System.out.print("Birinci Tahmin (i ve j de�erlerini bir bo�luklu girin...): ");
    int i1 = scanner.nextInt();
    int j1 = scanner.nextInt();
    
    kartlar[i1][j1].setTahmin(true);
    oyunTahtas�();
    
    System.out.print("�kinci Tahmin (i ve j de�erlerini bir bo�luklu girin...): ");
    int i2 = scanner.nextInt();
    int j2 = scanner.nextInt();
    
    if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
        System.out.println("Do�ru Tahmin. Tebrikler!");
        kartlar[i2][j2].setTahmin(true);
        
    }
    else {
        System.out.println("Yanl�� Tahmin...");
        kartlar[i1][j1].setTahmin(false);
        
    }
    
}

	public static void main(String[] args) {
		// 4*4 matrikslik ,
	//  Kart[][] kartlar= new Kart[4][4]; //B�YLE YAZARSAK E�ER GLOBAL DE���KEN OLDU�U ���N
		kartlar[0][0]=new Kart("A");       // PARANTEZDEN �IKINCA KARTLAR G�R�NMEZ .
		kartlar[0][1]=new Kart("B");          //O Y�ZDEN EN �STE CLASSIN �ZELL��� OLARAK YAZICA�IZ
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
		//oyunTahtas�();
		
		 while (oyunBittimi() == false) {
	            
	            oyunTahtas�();
	            
	            tahminEt();
	            
	        }
	        
	}
	

}
