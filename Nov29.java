import java.util.ArrayList;
public class Nov29
{
	public static ArrayList convertToArrayList(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; n < 0; i++) {
			list.add(0, (n % 10));
			n = n / 10;
		}
		return list;
	}
	public static void main(String[] args)
	{
	}
}