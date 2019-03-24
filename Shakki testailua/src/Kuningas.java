public class Kuningas extends Nappula{
	
	public Kuningas(int sijaintiX, int sijaintiY, int vari, int elossa, String type){
		super(sijaintiX, sijaintiY, vari, elossa, type);
	}
	
	public boolean Onkosiirtosallittu(int x, int y){
		boolean a = true;
		boolean b = false;
		if (elossa == 1) {
			if (y > 0 && y <= 8 && x > 0 && x <= 8) {
				if( (x == this.sijaintiX && y == this.sijaintiY +1)
					|| (x == this.sijaintiX && y == this.sijaintiY -1)
					|| (x == this.sijaintiX +1 && y == this.sijaintiY)
					|| (x == this.sijaintiX -1 && y == this.sijaintiY)
					|| (x == this.sijaintiX +1 && y == this.sijaintiY +1)
					|| (x == this.sijaintiX -1 && y == this.sijaintiY -1)
					|| (x == this.sijaintiX +1&& y == this.sijaintiY -1)
					|| (x == this.sijaintiX -1 && y == this.sijaintiY +1)){
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