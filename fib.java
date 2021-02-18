package assignment2Fib;

public class fib 
{	public static void main(String[] args)
	{	int term
			, first = 0
			, second = 1;
	
		System.out.println( "This program lists the Fibonnacci sequence.\n" + first + "\n" + second );
		term = first + second;
		while( term < MAX_TERM_VALUE )
		{	System.out.println( term );
			first = second;
			second = term;
			term = first + second;
		}
	}

	private static final int MAX_TERM_VALUE = 10000;
}
