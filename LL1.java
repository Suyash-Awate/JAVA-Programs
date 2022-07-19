import java.util.*;

class LL1
{
	public static void main(String args[])
	{
		ArrayList <Integer> obj = new ArrayList<Integer>();

		obj.add(10);
		obj.add(20);
		obj.add(30);

		System.out.println("Data from Array list");
		System.out.println(obj);
		obj.add(1,55);
		obj.add(10);

		Iterator <Integer> iobj = obj.iterator();
		System.out.println("Data from Array Lists using iterator is");
		while(iobj.hasNext())
		{
			System.out.println(iobj.next());
		}

		obj = null;
	}
}