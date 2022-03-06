class Test
{
	void display(int a)
	{
		System.out.println("First method : "+a);
	}
	void display(int... a)
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class MethodOverloading1
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display();
		t.display(10);
		t.display(20,30);
	}
}
