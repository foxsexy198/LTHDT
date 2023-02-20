package Giaodien;

import java.util.Scanner;

public class MovableStudent implements Movable{
	private String ID, Name;
	
	public MovableStudent() {
		ID = new String();
		Name = new String();
	}
	
	public MovableStudent(MovableStudent s) {
		ID = new String(s.ID);
		Name = new String(s.Name);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ID: ");
		ID = sc.nextLine();
		System.out.print("Nhap ten: ");
		Name = sc.nextLine();
	}
	
	public void moveUp() {
		System.out.print("Go up!");
	}
	public void moveDown() {
		System.out.print("Go down!");
	}
	public void setName(String n) {
		Name = new String(n);
	}
	
}
