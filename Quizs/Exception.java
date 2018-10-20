import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	
	public static void main(String[] args)
	{
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-mm-dd");
		List<Date>list=new ArrayList<>(10);
		for(int cnt=0;cnt<10;cnt++) 
		{
			try 
			{
				Date date=dateformat.parse("09-12");
				list.add(date);
			}
			catch(ParseException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("endd"+"\n");
			try 
			{
				for(int cnt=0;cnt<10;cnt++) 
				{
					Date date=dateformat.parse("09-12");
					list.add(date);
				}
			}
			catch(ParseException e)
			{
				e.printStackTrace();
			}
		
	}
}
/*
   retusltjava.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
endd
java.text.ParseException: Unparseable date: "09-12"

	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:30)
*/

/*
   retusltjava.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
java.text.ParseException: Unparseable date: "09-12"
	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:17)
endd
java.text.ParseException: Unparseable date: "09-12"

	at java.base/java.text.DateFormat.parse(Unknown Source)
	at Test.main(Test.java:30)
*/
