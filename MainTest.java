import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void testV1() {
    Assertions.assertFalse(Main.isPowerOf4V1(0));
    Assertions.assertFalse(Main.isPowerOf4V1(2));
    Assertions.assertFalse(Main.isPowerOf4V1(3));
    Assertions.assertFalse(Main.isPowerOf4V1(5));
    Assertions.assertFalse(Main.isPowerOf4V1(6));
    Assertions.assertFalse(Main.isPowerOf4V1(7));
    Assertions.assertFalse(Main.isPowerOf4V1(8));
    Assertions.assertFalse(Main.isPowerOf4V1(32));
    Assertions.assertFalse(Main.isPowerOf4V1(128));
    Assertions.assertFalse(Main.isPowerOf4V1(10));
    Assertions.assertFalse(Main.isPowerOf4V1(80));
    Assertions.assertFalse(Main.isPowerOf4V1(1 << 29));
    Assertions.assertFalse(Main.isPowerOf4V1(1 << 27));
    Assertions.assertFalse(Main.isPowerOf4V1(1 << 25));
    Assertions.assertFalse(Main.isPowerOf4V1(1 << 23));
    Assertions.assertFalse(Main.isPowerOf4V1(1 << 21));
    Assertions.assertFalse(Main.isPowerOf4V1(Integer.MIN_VALUE));

    Assertions.assertTrue(Main.isPowerOf4V1(1));
    Assertions.assertTrue(Main.isPowerOf4V1(4));
    Assertions.assertTrue(Main.isPowerOf4V1(16));
    Assertions.assertTrue(Main.isPowerOf4V1(64));
    Assertions.assertTrue(Main.isPowerOf4V1(256));
    Assertions.assertTrue(Main.isPowerOf4V1(1024));
    Assertions.assertTrue(Main.isPowerOf4V1(1 << 30));
    Assertions.assertTrue(Main.isPowerOf4V1(1 << 28));
    Assertions.assertTrue(Main.isPowerOf4V1(1 << 26));
    Assertions.assertTrue(Main.isPowerOf4V1(1 << 24));
    Assertions.assertTrue(Main.isPowerOf4V1(1 << 22));
    Assertions.assertTrue(Main.isPowerOf4V1(1 << 20));
  }

  @Test
  public void testV2() {
    Assertions.assertFalse(Main.isPowerOf4V2(0));
    Assertions.assertFalse(Main.isPowerOf4V2(2));
    Assertions.assertFalse(Main.isPowerOf4V2(3));
    Assertions.assertFalse(Main.isPowerOf4V2(5));
    Assertions.assertFalse(Main.isPowerOf4V2(6));
    Assertions.assertFalse(Main.isPowerOf4V2(7));
    Assertions.assertFalse(Main.isPowerOf4V2(8));
    Assertions.assertFalse(Main.isPowerOf4V2(32));
    Assertions.assertFalse(Main.isPowerOf4V2(128));
    Assertions.assertFalse(Main.isPowerOf4V2(10));
    Assertions.assertFalse(Main.isPowerOf4V2(80));
    Assertions.assertFalse(Main.isPowerOf4V2(1 << 29));
    Assertions.assertFalse(Main.isPowerOf4V2(1 << 27));
    Assertions.assertFalse(Main.isPowerOf4V2(1 << 25));
    Assertions.assertFalse(Main.isPowerOf4V2(1 << 23));
    Assertions.assertFalse(Main.isPowerOf4V2(1 << 21));
    Assertions.assertFalse(Main.isPowerOf4V2(Integer.MIN_VALUE));

    Assertions.assertTrue(Main.isPowerOf4V2(1));
    Assertions.assertTrue(Main.isPowerOf4V2(4));
    Assertions.assertTrue(Main.isPowerOf4V2(16));
    Assertions.assertTrue(Main.isPowerOf4V2(64));
    Assertions.assertTrue(Main.isPowerOf4V2(256));
    Assertions.assertTrue(Main.isPowerOf4V2(1024));
    Assertions.assertTrue(Main.isPowerOf4V2(1 << 30));
    Assertions.assertTrue(Main.isPowerOf4V2(1 << 28));
    Assertions.assertTrue(Main.isPowerOf4V2(1 << 26));
    Assertions.assertTrue(Main.isPowerOf4V2(1 << 24));
    Assertions.assertTrue(Main.isPowerOf4V2(1 << 22));
    Assertions.assertTrue(Main.isPowerOf4V2(1 << 20));
  }
}
