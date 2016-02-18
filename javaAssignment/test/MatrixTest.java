
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import javaAssignment.matrix.Matrix;


public class MatrixTest {
    @Test
    public void testForCreateMatrixOf2By3() {
    	Matrix twoBy3 = new Matrix(2,3);
    	assertEquals(twoBy3.row(),2);
    	assertEquals(twoBy3.colomn(),3);
    }
    @Test
    public void populate2By3Matrix() {
    	Matrix twoBy3 = new Matrix(2,3);
    	int [] values = {1,2,3,4,5,6};
    	int [][] expected = {{1,2,3},{4,5,6}};
    	twoBy3.populate(values);
    	int [][] actual = twoBy3.get();
    	assertArrayEquals(expected,actual);
    }
    @Test
    public void populate10By10Matrix() {
    	Matrix tenByten = new Matrix(4,4);
    	int [] values = new int[100];
    	for (int i=0;i<16;i++)
    		values[i] = i+1;
    	tenByten.populate(values);
    	tenByten.print();
    }
}
