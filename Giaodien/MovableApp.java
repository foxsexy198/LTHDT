package Giaodien;

public class MovableApp {

	public static void main(String[] args) {
		Movable m = new MovablePoint();
		m.input(); //MovablePoint.input
		m.show();  //MovablePoint.show
		m.moveUp();
		m.moveDown();
		
		Movable n = new MovableStudent();
		n.input();
		n.show();
		n.moveDown();
		n.moveDown();
			
		MovableStudent s = new MovableStudent();
		s.input();
		s.show();
		s.setName("Mai Lan");
		s.moveUp();
		
	}

}
