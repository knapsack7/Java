class SimpleCalculator {
	double getSum(double... a) {
		double sum = 0.0;
		for (double i : a)
			sum += i;
		return sum;
	}

	double getSub(double... a) {
		double sub = a[0];
		for (int i = 1; i < a.length; i++)
			sub -= a[i];
		return sub;
	}

	double getMul(double... a) {
		double mul = 0.0;
		for (double i : a)
			mul *= i;
		return mul;
	}

	double getDiv(double... a) {
		double div = a[0];
		try {
			for (int i = 1; i < a.length; i++)
				div /= a[i];
			return div;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		return -1;
	}
}

public class ScientificCalculator extends SimpleCalculator {
	double getSin(double rad) {
		return Math.sin(rad);
	}

	double getCos(double rad) {
		return Math.cos(rad);
	}

	double getTan(double rad) {
		return Math.tan(rad);
	}

	double getAsin(double rad) {
		return Math.asin(rad);
	}

	double getAcos(double rad) {
		return Math.acos(rad);
	}

	double getAtan(double rad) {
		return Math.atan(rad);
	}

	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();
		double temp = sc.getDiv(4, 2, 0);
		if (temp == -1)
			System.out.println("Exception Occurs");
		System.out.println(temp);
		System.out.println(sc.getSum(1, 2, 3, 4, 5, 6));
		System.out.println(sc.getSin(90));
		System.out.println(sc.getAsin(0.89));
	}
}
