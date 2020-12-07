package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals(Object obj) {
		//x=x
		Point xp = (Point)obj;
		if(this.x == xp.x) {
			return true;
		} else {
			return false;
		}
		
		
	}

	
}
