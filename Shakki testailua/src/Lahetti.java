public class Lahetti extends Nappula {
	public Lahetti(int SijaintiX, int SijaintiY, int vari, int elossa, String type) {
		super(SijaintiX, SijaintiY, vari, elossa, type);
	}
	public boolean Onkosiirtosallittu(int x, int y) {
		boolean a = true;
		boolean b = false;
		if (elossa == 1) {
			if (y > 0 && y <= 8 && x > 0 && x <= 8) {
				if (x < sijaintiX) {
					if (y < sijaintiY) {
						if (sijaintiX - x == sijaintiY - y) {
							return a;
						}
						else {
							return b;
						}
				
					}
					else {
						if (sijaintiX - x == y - sijaintiY) {
							return a;
						}
						else {
							return b;
						}
					}
				}
				else {
					if (y < sijaintiY) {
						if (x - sijaintiX == sijaintiY - y) {
							return a;
						}
						else {
							return b;
						}
					}
					else {
						if (x - sijaintiX == y - sijaintiY) {
							return a;
						}
						else {
							return b;
						}
					}
				}
			}
			else {
				return b;
			}
		}
		else {
			return b;
		}
	}
}

