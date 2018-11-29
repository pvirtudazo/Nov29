import java.util.ArrayList;
public class Nov29
{

	public static ArrayList convertToArrayList(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; n > 0; i++) {
			list.add(0, (n % 10));
			n = n / 10;
		}
		return list;
	}

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
		System.out.println(convertFromArrayList(convertToArrayList(8950)));
	}
}