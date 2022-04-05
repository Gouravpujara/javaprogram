package Unit_01;

public class P2_Task01_KeywordInJava {
	public static void main(String[] args)
	{
		//Keyword as identifier 
		int float=2.5f;//Syntax error
		
		//Keyword as function 
		
		int new()//Syntax error on token "new ",invalid Annotation Name
		{
			System.out.println();
			return 0;
		}
		//Key word as object 
		student int=new student();//student cannot be resolved to a variable 
	}
	
		
	}
class student{
	int b;
}


}
