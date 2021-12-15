package basic;

public class Robot {

	public static void main(String[] args) {
		int x = 0, y = 0;
		String s = "LDRRLRUULR";
	     s=s.toLowerCase();
	     System.out.println(s);
		char[] c1 = s.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == 'u') {
				y++;
			} else if (c1[i] == 'd') {
				y--;
			} else if (c1[i] == 'l') {
				x--;
			} else if (c1[i] == 'r') {
				x++;
			}
		}
		System.out.println("x is:"+x+"  y is:"+y);
	
		if (x == 0 && y == 0) {
			System.out.println("robo is in intial place");
		}
		else
		{
			System.out.println("robo is not there in intial place");
		}

	}

}
