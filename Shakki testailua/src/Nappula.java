public abstract class Nappula {
	public int sijaintiX;
	public int sijaintiY;
	public int vari;
	public int elossa = 1;
	public int SSM;  //sijainti syönti metodille //ei käytössä
	String nimi;
	String nappulatyyppi;
	// nimetään esim näin Ensin väri M tai V sitten nappula Esim sotilas S sitten numero esim. MS1
	public Nappula(int SijaintiX, int SijaintiY, int vari, int elossa, String type) {
		this.sijaintiX = SijaintiX;
		this.sijaintiY = SijaintiY;
		this.vari = vari;
		this.nappulatyyppi = type;
	}
	public void asetaSijainti(int x, int y) {
		this.sijaintiX = x;
		this.sijaintiY = y;
	}
	public String annaNappula() {
		return nappulatyyppi;
	}
	public int annaSijaintiX() {
		return this.sijaintiX;
	}
	public int  annaSijaintiY() {
		return this.sijaintiY;
	}
	public int Elossa(){
		return elossa; // 0 eli on elossa 1 eli kuollut
	}
	public int annaVari() {
		return this.vari;
	}
	public void tapa() {
		this.elossa = 0;
	}
}
