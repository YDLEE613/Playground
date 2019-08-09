public class ReverseInteger {
//	public static int reverse(int x) {
//		if (x == 0) {
//			return 0;
//		}
//
//		String num = x + "";
//		String result = "";
//
//		boolean isNegative = false;
//
//		for (int i = num.length() - 1; i >= 0; i--) {
//
//			if (num.charAt(i) == '-') {
//				isNegative = true;
//			} else {
//				result += num.charAt(i);
//			}
//		}
//
//		long longResult = isNegative ? Long.parseLong("-" + result) : Long.parseLong(result);
//
//		if (longResult > Integer.MAX_VALUE || longResult < Integer.MIN_VALUE) {
//			return 0;
//		} else {
//			return isNegative ? Integer.parseInt("-" + result) : Integer.parseInt(result);
//		}
//	}

	public static int reverse(int x) {
		if (x == 0) {
			return 0;
		}

		char[] num = (x + "").toCharArray();

		for (int i = 0; i < num.length / 2; i++) {
			char start = num[i];
			char end = num[num.length - 1 - i];

			num[i] = end;
			num[num.length - 1 - i] = start;
		}

		String result = String.copyValueOf(num);

		long longResult = 0;
		
		if (result.charAt(result.length()-1) == '-') {
			longResult = Long.parseLong("-" + result.substring(0, result.length() - 1));
		}else {
			longResult = Long.parseLong(result);
		}
		
		// check min and max
		if (longResult > Integer.MAX_VALUE || longResult < Integer.MIN_VALUE) {
			return 0;
		} else {
			if(result.charAt(result.length()-1) == '-') {
				return Integer.parseInt("-" + result.substring(0, result.length() - 1));
			}else {
				return Integer.parseInt(result);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(reverse(1090000));
	}
}
