import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.rmi.CORBA.Util;
public class PrimitiveProblem{
	public static BigInteger primitiveRootSearch(BigInteger p) throws Exception {
		if (p == null || !MillerRabin.testStrongPrime(p))
			throw new Exception("Invalid p for primitive root search");
		BigInteger n = p.subtract(BigInteger.ONE);
		Set<BigInteger> factors = findPrimeFactors(n);
		BigInteger g = Util.randomBigInteger(Util.TWO,
				n.subtract(BigInteger.ONE));
		while (!checkPrimitiveRoot(g, p, n, factors)) {
			g = g.add(BigInteger.ONE);
		}
		return g;
	}
	private static boolean checkPrimitiveRoot(BigInteger g, BigInteger p,
		BigInteger n, Set<BigInteger> factors) {
	    Iterator<BigInteger> i = factors.iterator();
		while (i.hasNext()) {
			if (FastExponentiation.fastExponentiation(g, n.divide(i.next()), p)
					.equals(BigInteger.ONE)) {
				return false;
			}
		}
		return true;
	}
	private static Set<BigInteger> findPrimeFactors(BigInteger n) {
		Set<BigInteger> factors = new HashSet<BigInteger>();
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i
				.add(BigInteger.ONE)) {
			while (n.mod(i).equals(BigInteger.ZERO)) {
				factors.add(i);
				n = n.divide(i);
				if (MillerRabin.testStrongPrime(n))
					return factors;
			}
		}
		return factors;
	}
}