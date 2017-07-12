class Calculator
{
	static int a=11;
	int multiplication(int number1)
	{
		return number1*a;
	}
	float multiplication(float number1,float number2)
	{
		return number1*number2;
	}
	public static void main(String args[])
	{
		Calculator calculator =new Calculator();
		int mul1 = calculator.multiplication(10);
		System.out.println("The multiplication of two integers:"+mul1);
		float mul2 = calculator.multiplication(10.00f,23.25f);
		System.out.println("The multiplication of two float numbers:"+mul2);
	}
}