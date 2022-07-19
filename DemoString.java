
class DemoString
{
	public static void main(String arg[])
	{
		String str1= "Hello";	// 1

		String str2 = new String("Hello");	// 2

		char Arr[] = {'H','e','l','l','o'};	// 3
		String str3 = new String(Arr);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("String length is : "+str1.length()); //length method

		System.out.println("Array length is : "+Arr.length); //lenghth property
		
		//String Literals
		String s1 = "Demo";
		String s2 = "Demo";
		String s3 = "Demo";

		//String class object
		String s4 = new String("Demo");
		String s5 = new String("Demo");
		String s6 = new String("Demo");

		System.out.println(s6.charAt(3));	//To access character of string


		// To convert string into character array
		char Brr[] = s6.toCharArray();	
		for(int i =0; i<Brr.length; i++)
		{
			System.out.println(Brr[i]);
		}

					// OR

		for(int j =0;j<s6.length(); j++)
		{
			System.out.println(s6.charAt(j));
		}


		String sobj1 = "Hello"; //Memory gets inside String literal pool
		String sobj2 = "Hello";
		String sobj3 = new String("Hello"); //Memory gets inside Heap

		//Here address/referece gets compared
		if(sobj1 == sobj3)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");  //<------
		}

		if(sobj1.equals(sobj3))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Non equal");
		}
	}
}