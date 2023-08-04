/**
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 *
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 *
 * Input: n = 16
 * Output: true
 *
 * Input: n = 5
 * Output: false
 *
 * https://leetcode.com/problems/power-of-four/
 */
public class Main {

  /**
   * One way to solve it would be to follow the fact that every position in the bit vector represents a power of 2. If we visualize
   * the values in a line, a power of 4 is actually every 2nd position, and for an int type, this leaves us with 32/2 = 16 positions. E.g. positions:
   *
   * 0 (2^0 = 4^0 = 1),
   * 2 (2^2 = 4^1 = 4),
   * 4 (2^4 = 4^2 = 16)
   * 6 (2^6 = 4^3 = 64)
   * ...
   *
   * Just like in problem: <link>Power of 2</link>, we need to:
   *
   * 1. Make sure only 1 non-zero bit exist: <b>(n & n - 1) == 0</b>
   * 2. That bit is located in any of the 16 power of 4 positions
   *
   * In the solution below, we make a mask with 1s at those positions and performing
   * AND on the input <b>n</b>. If the result is bigger than 0, the 1 bit was at power of 4
   * position, otherwise 0 is returned.
   */
  public static boolean isPowerOf4V1(int n) {
    // More than 1 bit, not a power of 4
    if ((n & n - 1) != 0) {
      return false;
    }

    int mask = 0;

    // builds a bit vector like the following:
    // 01010101010101010101010101010101
    for (int i = 0; i < 15; i++) {
      mask |= 1; // add 1 at LSB position
      mask <<= 2; // push it 2 positions to the MSB
    }

    // Add 1 at the LSB (4^0 = 1)
    mask |= 1;

    return (n & mask) > 0;
  }

  /**
   * Building upon the solution from V1, we could entirely get rid of building a proper mask
   * and find the number which has the exact same bit sequence.
   *
   * The number is <b>1431655765</b> (01010101010101010101010101010101).
   */
  public static boolean isPowerOf4V2(int n) {
    return (n & n - 1) == 0 && (n & 1431655765) > 0;
  }
}
