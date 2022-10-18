package edu.pitt.lab6;
// INFSCI0017 Lab 6 - Created by Dr. John Ramirez
// Fill in the indicated code sections to complete this class.  Then test it
// by compiling and executing Lab6.java.

public class MyRectangle
{
	// Declare instance variables here.  See toString() method below for names.
	private int width;
	private int height;
	private int startX;
	private int startY;

	public MyRectangle()
	{
		 width=0; height=0;startX=0; startY = 0;
		// Default constructor -- initialize all instance variables
		// to 0
	}

	public MyRectangle(int x, int y, int w, int h)
	{
		startX = x;
		startY = y;
		width = w;
		height = h;		
		// Initialize instance variables based on parameters shown.
		// Be careful to get the order correct!
	}

	public int area()
	{
		return width * height;
		// Return the area of this Rectangle
	}

	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " +width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y)
	{
		if ((x<width+startX)&&(x>startX)) {
			if ((y<height+startY)&&(y>startY)) {
				return true;
			}
		}
		// This is the trickiest of the methods to write.  This should
		// return true if point (x,y) is anywhere within the borders of the
		// current MyRectangle (including the borders themselves).  Use a
		// pencil and paper to figure out how this can be determined with
		// just a few simple relational operations.
	 //TODO return;
		return false;
	}

	public void setSize(int w, int h)
	{
		width = w;
		height = h;
	}

	public void setPosition(int x, int y)
	{
		startX = x;
		startY = y;
	}

}