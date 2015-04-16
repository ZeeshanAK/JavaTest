
public class Test2 
{

	public static void main(String[] args) 
	{
		Test2 t = new Test2();
		 a obj = t.new a();
		obj.print();
	}
	
class a
{
	public void print()
	{
		System.out.println("A");
	}
}

class b extends a 
{
	public void print()
	{
		System.out.println("b");
	}
}

}
