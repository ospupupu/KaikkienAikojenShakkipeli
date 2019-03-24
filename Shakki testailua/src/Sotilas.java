public class Sotilas extends Nappula {
	public Sotilas(int SijaintiX, int SijaintiY, int vari, int elossa, String type) {
		super(SijaintiX, SijaintiY, vari, elossa, type);

	}
	public boolean Onkosiirtosallittu(int x, int y) {
		if (elossa == 1) {
			if (y > 0 && y <= 8 && x > 0 && x <= 8) {
				if( (x == this.sijaintiX && y == this.sijaintiY +1)
					|| (x == this.sijaintiX && y == this.sijaintiY -1)
					|| (x == this.sijaintiX +1 && y == this.sijaintiY +1)
					|| (x == this.sijaintiX -1 && y == this.sijaintiY -1)
					|| (x == this.sijaintiX +1&& y == this.sijaintiY -1)
					|| (x == this.sijaintiX -1 && y == this.sijaintiY +1)){
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
}	


