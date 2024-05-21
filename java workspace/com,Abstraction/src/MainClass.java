import javax.naming.spi.DirStateFactory.Result;

public class MainClass
	{
	    public static void main(String[] args)
	    {
	        @SuppressWarnings("unused")
			int result = new Calculate()
	        {   
	            @Override
	            int add(int a, int b)
	            {
	                return a+b;
	            }
	        }.add(11010, 022011);
	        System.out.println(result);
	    }
	}


