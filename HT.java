import java.util.*;

class HT
{
	public static void main(String args[])
	{
		//			Key    Value
		Hashtable<String,Integer>hobj = new Hashtable<String,Integer>();

		hobj.put("PPA",15000);
		hobj.put("LB",14000);
		hobj.put("PML",12500);
		hobj.put("LSPUI",21000);
		hobj.put("Angular",15000);
		hobj.put("C#",14500);

		System.out.println(hobj.get("LB")); //data search with key

		System.out.println("Size of hashtable is : "+hobj.size()); //to give size of hashtable

		System.out.println("Data from HashTable");
		hobj.remove("C#");

		Enumeration eobj = hobj.keys();

		while(eobj.hasMoreElements())
		{
			System.out.println(eobj.nextElement());
		}

		hobj.clear();	//to flush all the data from table

		hobj = null;
	}
}