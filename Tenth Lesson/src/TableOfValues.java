
public class TableOfValues {
	public static void main(String[] args) {
		//Variables
		int returnnumx = -1;
		int returnnumy = 2;
		int xrangestart;
		int xrangestop;
		int yrangestart = -2;
		int yrangestop = 1;
		System.out.print("x/y ");
		xrangestart = returnnumx;//define values 
		xrangestop = returnnumy;//define values 
		//Loop for top part
		for(;xrangestart<=xrangestop;xrangestart+=1) {
			System.out.print(xrangestart + "  ");
		}
		System.out.println(" ");
		//Loop for y values on a horizontal line
		for(;yrangestart<=yrangestop;yrangestart+=1) {
			xrangestart = returnnumx;//define values again
			xrangestop = returnnumy;//define values again
			if(yrangestart>=0) {
				System.out.print(" " +yrangestart + "  ");
			}
			else {
				System.out.print(yrangestart + "  ");
			}
			for(;xrangestart<=xrangestop;xrangestart+=1) {
				int Equation = 2*xrangestart - yrangestart*yrangestart;
				if(Equation >= 0) {
					System.out.print(" " + Equation + " ");
				}
				else{
					System.out.print(Equation + " ");
				}
				
			System.out.println(); //Spacing
		}
		
	}
}
}