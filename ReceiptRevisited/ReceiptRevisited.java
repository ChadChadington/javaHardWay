import java.io.PrintWriter;

public class ReceiptRevisited
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout = new PrintWriter("receipt.txt");
		
		fileout.println( "+------------------------+" );
		fileout.println( "|                        |" );
		fileout.println( "|      CORNER STORE      |" );
		fileout.println( "|                        |" );
		fileout.println( "|  2016-01-26 11:22 AM   |" );            
		fileout.println( "|                        |" );
		fileout.println( "| Gallons:      12.464   |" );
		fileout.println( "| Price/gallon: $ 3.459  |" );
		fileout.println( "|                        |" );
		fileout.println( "| Fuel total:   $ 43.11  |" );
		fileout.println( "|                        |" );
		fileout.println( "+------------------------+" );
		fileout.close();
	}
}