class Add 
{
	int addNumber(int num1,int num2)
	{
		return  num1+num2;
	}
	public static void main(String args[])
	{
		Add addition = new Add();
		int addition1=addition.addNumber(10,23);
		System.out.println("Addition of two numbers:"+addition1);
	}
}