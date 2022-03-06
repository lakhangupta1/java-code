class Test
{
	void display(Object a)
	{
		System.out.println("1");
	}
	void display(String a)
	{
		System.out.println("2");
	}
}
class MethodOverloading2
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display(t);       //output will be 1,  
        t.display(null);   //output will be 2,
	}
}