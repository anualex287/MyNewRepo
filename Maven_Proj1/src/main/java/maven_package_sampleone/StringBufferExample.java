package maven_package_sampleone;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer obj = new StringBuffer("Hello") ;
		System.out.println(obj);
		StringBuilder obj1 = new StringBuilder("Anu Alex");
		System.out.println(obj1);
		
		//Append -this method is used to add a string in the last of a string//
		obj.append(" Dear");
		System.out.println(obj);
		//insert- based on index we can insert new element//
		obj.insert(5," Welcome to obsqura");
		System.out.println(obj);
		
		//replace - replace the value of starting and ending position//
		obj1.replace(4, 8, "philip");
		System.out.println(obj1);
		
		//reverse -- to reverse the string//
		obj1.reverse();
		System.out.println(obj1);
		
		//Delete - to delete specific part of a string//
		obj.delete(0, 6);
		System.out.println(obj);
		
	}

}
