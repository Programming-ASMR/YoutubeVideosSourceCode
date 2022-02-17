class Rectangle{
	
	int length = 0, width = 0;

	public Rectangle(){} //default constructor

	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}

	public int getLength(){ return length; }

	public int getWidth(){ return width; }

	public void setLength(int length){
		this.length = length;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getPerimeter(){
		//perimeter of a rectangle is 2L + 2W
		return getLength() * 2 + getWidth() * 2;
	}

	public int getArea(){
		//area of a rectangle is L x W
		return getLength() * getWidth(); 
	}

	@Override
	public String toString(){
		return "Length: " + getLength() + " Width: " + getWidth();
	}
}