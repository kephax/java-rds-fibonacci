import java.sql.Timestamp;

public class Apl
{
	public static void main( String args[] )
	{
//		Timestamp ts = new Timestamp( time );
	//	System.out.println( ts.getNanos() );
		fib_fast( 0, 1 , 0, 10 );
		System.out.println("I am done");
	//	System.out.println( fibonacci2( 40 ) );
		
	}
	
	public static void fib_fast_1( int x1, int x2, int limit )
	{
		int x3 = x1 + x2;
		x1 = x2;
		x2 = x3;
		if( x3 < limit )
		{
			System.out.println( x3 );
			fib_fast_1( x1, x2, limit );
		}
	}
	
	public static int fib_slow( int n )
	{
      if (n <= 1)
	  {
    	  return n;
	  }
      else 
	  {
    	  return fib_slow( n-1 ) + fib_slow( n-2 );
	  }

	}

	public static int fib_fast( int n )
	{
		return fib_fast( 0, 1, 0, n );
	}
	public static int fib_fast( int x1, int x2, int teller, int limit )
	{
		int x3 = x1 + x2;
		x1 = x2;
		x2 = x3;
		
		if( ( teller < limit )&&( x3 < 65536 ) )
		{
			System.out.println( x3 );
			teller ++;
			return fib_fast( x1, x2, teller, limit );
		}
		return -1;
	}
	
	
}
