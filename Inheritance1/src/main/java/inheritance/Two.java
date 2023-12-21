package inheritance;

public class Two extends One {
	public void show()
	{
		System.out.println("This is two");
	}

	public static void main(String[] args) {
		Two obj=new Two();
		obj.show();
		obj.display();
		// TODO Auto-generated method stub

	}

}
