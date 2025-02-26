public class PracticeProblem {

	public static void main(String args[]) {}

	public static int[] createIntArray() {

		int intArr[];
		intArr = new int[5];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i+1;
		}

		return intArr;
	
	}

	public static String[] createArray(String one, String two, String three, String four) {

		String[] strArr = new String[4];
		int i = 0;
	
		strArr[i] = one;
		strArr[i+1] = two;
		strArr[i+2] = three;
		strArr[i+3] = four;

		return strArr;
	}

	public static int findValue(int num, int[] intArr) {

		int occ = -1;

		for (int i=0; i<intArr.length; i++) {
			if (intArr[i] == num) {
				occ=i;
				break;
			}
		}

		return occ;

	}

	public static int findThirdValue(String word, String[] strArr) {

		int occ = 0;
		int index = 0;
		int tocc = -1;

		while (occ<3 && index<strArr.length) {

			for (int findex=0; findex<strArr.length; findex++) {

				if(strArr[findex]==word) {
					occ++;
				}

				index++;
			}

			if(occ>3) {
				tocc = index-2;
				index = strArr.length;
			}

			else if(occ==3) {
				tocc = index-1;
				index = strArr.length;
			}

		}

		return tocc; 

	}
}
