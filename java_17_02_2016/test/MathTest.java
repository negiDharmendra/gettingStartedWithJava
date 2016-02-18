import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import myUtil.*;
public class MathTest {
	@Test
	public void addTwoPositiveInt() {
	    int sum = myUtil.Math.add(3,4);
	    assertEquals(7, sum);
	}
	@Test
	public void addTwoNegativeInt() {
	    int sum = myUtil.Math.add(-3,-4);
	    assertEquals(-7, sum);
	}
	@Test
	public void subtrTwoPositiveInt() {
	    int sum = myUtil.Math.subtr(3,4);
	    assertEquals(-1, sum);
	}
	@Test
	public void subtrTwoNegativeInt() {
	    int sum = myUtil.Math.subtr(-3,-4);
	    assertEquals(1, sum);
	}
	@Test
	public void calculatePower() {
	    int sum = myUtil.Math.pow(4,2);
	    assertEquals(16, sum);
	}
	@Test
	public void deepEqualArrayUtilTest() {
		int [] nums1 = {1,2,3,4,5,6,7,8};
		int [] nums2 = {1,2,3,4,5,6,7,8};
	    boolean sum = ArrayUtil.deepEqual(nums1,nums2);
	    assertEquals(true, sum);
	}
	@Test
	public void deepEqualArrayUtilTestForDifferentArray() {
		int [] nums1 = {1,2,3,4,5,6,7,8};
		int [] nums2 = {1,4,3,4,5,6,7,8};
	    boolean sum = ArrayUtil.deepEqual(nums1,nums2);
	    assertEquals(false, sum);
	}
	@Test
	public void reverseArrayUtilTest() {
		int [] nums1 = {1,2,3,4,5,6,7,8};
		int [] nums2 = {8,7,6,5,4,3,2,1};
	    int [] reversed = ArrayUtil.reverse(nums1);
	    assertArrayEquals(reversed, nums2);
	}
	@Test
	public void sliceArrayUtilTest() {
		int [] nums1 = {1,2,3,4,5,6,7,8};
		int [] expected = {1,2,3};
	    int [] nums2  = ArrayUtil.slice(nums1,0,3);
	    assertArrayEquals(expected, nums2);
	}
	@Test
	public void sliceArrayUtilTestWhenToIsNegative() {
		int [] nums1 = {1,2,3,4,5,6,7,8};
		int [] expected = {1,2,3,4,5};
	    int [] nums2  = ArrayUtil.slice(nums1,0,-3);
	    assertArrayEquals(expected, nums2);
	}

	@Test
	public void sliceArrayUtilTestWhenFromIsNegative() {
		int [] nums1 = {1,2,3,4,5,6,7,8};
		int [] expected = {4,5,6,7,8};
	    int [] nums2  = ArrayUtil.slice(nums1,-5,8);
	    assertArrayEquals(expected, nums2);
	}
}
