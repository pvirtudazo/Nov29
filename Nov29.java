import java.util.ArrayList;
public class Nov29
{
	public static int convertFromArrayList(ArrayList<Integer> lista)
	{
		int or=0;
		int count=1;
		for (int i=lista.size();i>0;i--)
		{
			or+=(lista.get(i-1)*count);
			count*=10;
		}
		return or;
	}
	public static void main(String[] args)
	{
	}
}