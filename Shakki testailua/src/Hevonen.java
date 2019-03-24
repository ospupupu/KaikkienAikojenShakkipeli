public class Hevonen extends Nappula{
	
	public Hevonen(int sijaintiX, int sijaintiY, int vari, int elossa, String type){
		super(sijaintiX, sijaintiY, vari, elossa, type);
	}
	
	public boolean Onkosiirtosallittu(int x, int y){
		boolean a = true;
		boolean b = false;
		if (elossa == 1) {
			if (y > 0 && y <= 8 && x > 0 && x <= 8) {
				if(    (x == this.sijaintiX +2 && y == this.sijaintiY +1)
					|| (x == this.sijaintiX +2 && y == this.sijaintiY -1)
					|| (x == this.sijaintiX -2 && y == this.sijaintiY +1)
					|| (x == this.sijaintiX -2 && y == this.sijaintiY -1)
					|| (x == this.sijaintiX +1 && y == this.sijaintiY +2)
					|| (x == this.sijaintiX +1 && y == this.sijaintiY -2)
					|| (x == this.sijaintiX -1 && y == this.sijaintiY +2)
					|| (x == this.sijaintiX -1 && y == this.sijaintiY -2)) {
					return a;
				}
				else {
					return b;
				
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