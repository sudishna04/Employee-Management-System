public class Conn  
{
	public conn()
	{
		try
		{
			class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}