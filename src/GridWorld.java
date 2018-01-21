import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {


public static void main(String[] args) {
	World w1 = new World();
	w1.show();
	Bug bug = new Bug();
	Bug bug2 = new Bug();
	Flower f1 = new Flower();
	 w1.add(new Location(5,5), bug);
	 w1.add(new Location(7,9), bug2);
	
	bug2.setColor(Color.BLUE);
	bug2.setDirection(90);
	for(int i = 0; 1 <10; i++) {
		for(int a = 0; a<9;a++) {
			if(i != 5&& i!=7 && a !=5 && a!=9) {
				Location l = new Location(i,a);
				w1.add(l, f1);
				
			}
			
		}
		
	}


	
	

}
}
