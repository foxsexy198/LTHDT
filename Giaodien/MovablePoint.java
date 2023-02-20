package Giaodien;

import java.util.Scanner;

public class MovablePoint implements Movable{
	private int x, y; 
	
	
	public MovablePoint() {
		x = 0;
		y = 0;
	}
	public MovablePoint(MovablePoint d) {
		x = d.x;
		y = d.y;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x = sc.nextInt();
		System.out.print("Nhap y: ");
		y = sc.nextInt();
	}
	public void show() {
		System.out.print("(" + x + "," + y + ")");
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public void moveUp() {
		y++;
	}
	public void moveDown() {
		x++;
	}
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
