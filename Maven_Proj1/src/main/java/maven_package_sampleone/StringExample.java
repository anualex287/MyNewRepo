package maven_package_sampleone;

public class StringExample
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	String name = "Anu"	;
	String s = new String("Welcome");
	
	System.out.println(name);
	System.out.println(s);	
	char arr[] = {'a', 'b','c', 'd'};
	String s4 = new String(arr); //*char converted to string
	System.out.println(s4);
	
	//*length*// this method is used to find the size of string//
	System.out.println(name.length());
	
	//charAt//- -to return charactor in the string in index //
	
	char var = s.charAt(2);
	System.out.println(var);
	
	//concat -for combining string/letter//
	System.out.println(name.concat(" "+ s));
	System.out.println(name.concat("  welcome to UST"));
	
	//Contains- to check whether any word containing inside a string //
	String k = "This is for test..";
	System.out.println(k.contains("anu"));
	
	//equals//
	
	String m = "java";
	String n = "java";
	String r = "Java";
	String p = "selenium";
	String q = "AMERICA";
	
	//equals// - to check whether two strings are equal//
	
	System.out.println(m.equals(n));
	System.out.println(n.equals(r));//case different -false
	System.out.println(r.equals(p));
	
	//equal-ignore case// to ignore case
	System.out.println(m.equalsIgnoreCase(r));
	
	//to UPPER case//
	System.out.println(m.toUpperCase());
	System.out.println(k.toUpperCase());
	
	// to Lower case//
	System.out.println(q.toLowerCase());
	System.out.println(k.toLowerCase());
	
	
	//Is empty - check to whether string is empty//
	String c = ""; //true the string is empty
	String l = "  ";  //false the string is not empty
	System.out.println(c.isEmpty());
	System.out.println(l.isEmpty());
	
	//valueof - this method is used to convert any datatype value to string//
	int i = 10;
	String var1 = String.valueOf(i); //convert integer to string
	System.out.println(var1);
	
	//==  --> operator to compare//
	
	System.out.println(m==n);
	
	String var2 = new String ("java");
	System.out.println(m==var2); //compare reference only,not values
	System.out.println(n.equals(var2));
	}

}
