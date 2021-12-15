package basic;

public class Studentreward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PPALLP";
		int k = 0, p = 1;
		boolean flag = false, flag1 = false;
		char s1[] =s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			//s1[i] = s.charAt(i);
			if (s1[i] == 'A') {
				k = k + 1;
			}
			if (k >= 2) {
				flag = true;
				System.out.println("since the student is absent for more than 1 day not eligible for student award ");
				break;
			}
			if (s1[i]=='L'&&(i+2)<s.length()) {
				p=1;
				for (int j=i+1;j<i+3; j++) {
					if (s1[j] == 'L') {
						p = p + 1;
						if (p == 3) {
							System.out.println("since the student is not eligible for student award because of three continuous leaves ");
							flag1 = true;
				
						}
					} 

				}
			}

		}
		if (flag == true||flag1== true) {
			System.out.println("false----not eligible");
		} else {
			System.out.println("true---student is eligible");
		
		}

	}

}
