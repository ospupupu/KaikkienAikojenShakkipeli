import java.util.ArrayList;
public class Pelilauta {
	int indeksi;
	String tyhja = "---";
	ArrayList<Nappula> pelilauta = new ArrayList<Nappula>();
	public Pelilauta() {
		super();
		for(int i = 0; i<15*8; i++) {
			pelilauta.add(i, null);
		}
	}
	public void add(int kohde, Nappula a) {
		pelilauta.add(kohde, a);
	}
	public Nappula get(int kohde){
		pelilauta.get(kohde);
	}
	public void set(int kohde) {
		pelilauta.set(kohde, null);
	}
	public Nappula test(int kohde) {
		if (pelilauta.get(kohde) == null) {
			return tyhja;
		}
		else {
			pelilauta.get(kohde);
		}
	}
	public void Start() {
		for(int i = 0; i<8*100; i++) {
			pelilauta.add(i, null);
		}
	}
	public void piirraLauta() {
		System.out.println("__________________________________________");
		System.out.println("|"+ pelilauta.get(18) + "|" + pelilauta.get(28) + "|" + pelilauta.get(38) + "|" + pelilauta.get(48) + "|" + pelilauta.get(58) +"|" + pelilauta.get(68) + "|" + pelilauta.get(78) + "|" + pelilauta.get(88) + "|");
		System.out.println("|"+ pelilauta.get(17) + "|" + pelilauta.get(27) + "|" + pelilauta.get(37) + "|" + pelilauta.get(47) + "|" + pelilauta.get(57) +"|" + pelilauta.get(67) + "|" + pelilauta.get(77) + "|" + pelilauta.get(87) + "|");
		System.out.println("|"+ pelilauta.get(16) + "|" + pelilauta.get(26) + "|" + pelilauta.get(36) + "|" + pelilauta.get(46) + "|" + pelilauta.get(56) +"|" + pelilauta.get(66) + "|" + pelilauta.get(76) + "|" + pelilauta.get(86) + "|");
		System.out.println("|"+ pelilauta.get(15) + "|" + pelilauta.get(25) + "|" + pelilauta.get(35) + "|" + pelilauta.get(45) + "|" + pelilauta.get(55) +"|" + pelilauta.get(65) + "|" + pelilauta.get(75) + "|" + pelilauta.get(85) + "|");
		System.out.println("|"+ pelilauta.get(14) + "|" + pelilauta.get(24) + "|" + pelilauta.get(34) + "|" + pelilauta.get(44) + "|" + pelilauta.get(54) +"|" + pelilauta.get(64) + "|" + pelilauta.get(74) + "|" + pelilauta.get(84) + "|");
		System.out.println("|"+ pelilauta.get(13) + "|" + pelilauta.get(23) + "|" + pelilauta.get(33) + "|" + pelilauta.get(43) + "|" + pelilauta.get(53) +"|" + pelilauta.get(63) + "|" + pelilauta.get(73) + "|" + pelilauta.get(83) + "|");
		System.out.println("|"+ pelilauta.get(12) + "|" + pelilauta.get(22) + "|" + pelilauta.get(32) + "|" + pelilauta.get(42) + "|" + pelilauta.get(52) +"|" + pelilauta.get(62) + "|" + pelilauta.get(72) + "|" + pelilauta.get(82) + "|");
		System.out.println("|"+ pelilauta.get(11) + "|" + pelilauta.get(21) + "|" + pelilauta.get(31) + "|" + pelilauta.get(41) + "|" + pelilauta.get(51) +"|" + pelilauta.get(61) + "|" + pelilauta.get(71) + "|" + pelilauta.get(81) + "|");
		System.out.println("_________________________________________");
	}
}