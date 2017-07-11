class Circle
{
	double area,r,pi=3.14;;

	Circle(double r)
	{
		area=pi*r*r;
		System.out.println("Area of circle is:"+area);
	}
	public static void main(String args[])
	{
		Circle c= new Circle(3);
		

	}
}