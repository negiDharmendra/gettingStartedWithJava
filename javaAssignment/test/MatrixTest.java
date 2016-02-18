
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
    public void testForPopulate2By3Matrix() {
    	Matrix twoBy3 = new Matrix(2,3);
    	int [] values = {1,2,3,4,5,6};
    	int [][] expected = {{1,2,3},{4,5,6}};
    	twoBy3.populate(values);
    	int [][] actual = twoBy3.get();
    	assertArrayEquals(expected,actual);
    }
    @Test
    public void testForPopulate4By4Matrix() {
    	Matrix fourByFour = new Matrix(4,4);
    	int [] values = new int[16];
    	for (int i=0;i<16;i++)
    		values[i] = i+1;
        int [][] expected ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    	fourByFour.populate(values);
        assertArrayEquals(expected,fourByFour.get());
    }
    @Test
    public void testForAdditionOfTwoMatrices() {
        Matrix fourByFour1 = new Matrix(4,4);
        int [] values1 = new int[16];
        for (int i=0;i<16;i++)
            values1[i] = i+1;
        fourByFour1.populate(values1);

        Matrix fourByFour2 = new Matrix(4,4);
        int [] values2 = new int[16];
        for (int i=0;i<16;i++)
            values2[i] = i+1;
        fourByFour2.populate(values2);

        Matrix result = fourByFour1.add(fourByFour2);

        int [][] expected ={{2,4,6,8},{10,12,14,16},{18,20,22,24},{26,28,30,32}};
        assertArrayEquals(expected,result.get());
    }

    @Test
    public void testForAdditionOfTwoMatricesWhereOneMatrixHasNegativeValues() {
        Matrix fourByFour1 = new Matrix(4,4);
        int [] values1 = new int[16];
        for (int i=0;i<16;i++)
            values1[i] = i+1;
        fourByFour1.populate(values1);

        Matrix fourByFour2 = new Matrix(4,4);
        int [] values2 = new int[16];
        for (int i=0;i<16;i++)
            values2[i] = -(i+1);
        fourByFour2.populate(values2);

        Matrix result = fourByFour1.add(fourByFour2);

        int [][] expected ={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        assertArrayEquals(expected,result.get());
    }

}
