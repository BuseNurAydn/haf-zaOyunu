package haf�zaOyunu;

public class Kart {
	private String deger;
	private boolean tahmin=false; //ilk ba�ta tahmin olmad��� i�in false e�itledik
	
	public Kart(String deger) {
		this.deger = deger;
	}

	public String getDeger() {
		return deger;
	}

	public void setDeger(String deger) {
		this.deger = deger;
	}

	public boolean isTahmin() {
		return tahmin;
	}

	public void setTahmin(boolean tahmin) {
		this.tahmin = tahmin;
	}
	
	

}
