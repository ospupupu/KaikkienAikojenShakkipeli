
public class Torni extends Nappula {
	public Torni(int SijaintiX, int SijaintiY, int vari, int elossa, String type) {
		super(SijaintiX, SijaintiY, vari, elossa, type);
	}
	public boolean Onkosiirtosallittu(int x, int y) {
		if(elossa == 1) {
			if (x == sijaintiX || y == sijaintiY) {
				if (y > 0 && y <= 8 && x > 0 && x <= 8) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
