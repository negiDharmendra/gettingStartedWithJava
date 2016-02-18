
import static org.junit.Assert.*;
import org.junit.Test;
import javaAssignment.matrix.Matrix;


public class MatrixTest {
    @Test
    public void assignedValuesShouldPopulateTheMatrixWithGivenValues() {
    	Matrix twoBy3Matrix = new Matrix(2,3);
    	int [] values = {1,2,3,4,5,6};
        twoBy3Matrix.assignedValues(values);

    	int [][] expected = {{1,2,3},{4,5,6}};
    	assertTrue(twoBy3Matrix.isEqualTo(expected));
    }
    @Test
    public void assignedValuesShouldExcludeExtraValuesProvidedToAssign() {
    	Matrix fourByFourMatrix = new Matrix(4,4);
    	int [] values = new int[20];
    	for (int i=0;i<16;i++)
    		values[i] = i+1;
        int [][] expected ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
    	fourByFourMatrix.assignedValues(values);
        assertTrue(!fourByFourMatrix.isEqualTo(expected));
    }
    @Test
    public void addShouldAddTwoMatrixAndReturnedNewMatrix() {
        Matrix fourByFour1 = new Matrix(4,4);
        int [] values1 = new int[16];
        for (int i=0;i<16;i++)
            values1[i] = i+1;
        fourByFour1.assignedValues(values1);

        Matrix fourByFour2 = new Matrix(4,4);
        int [] values2 = new int[16];
        for (int i=0;i<16;i++)
            values2[i] = i+1;
        fourByFour2.assignedValues(values2);

        Matrix result = fourByFour1.add(fourByFour2);

        int [][] expected ={{2,4,6,8},{10,12,14,16},{18,20,22,24},{26,28,30,32}};
        assertTrue(result.isEqualTo(expected));
    }

    @Test
    public void addShouldReturnANullMatrixIfTwoMatrixAreOfDifferentOrder() {
        Matrix fourByFour1 = new Matrix(4,4);
        int [] values1 = new int[16];
        for (int i=0;i<16;i++)
            values1[i] = i+1;
        fourByFour1.assignedValues(values1);

        Matrix fourByFour2 = new Matrix(2,3);
        int [] values2 = new int[6];
        for (int i=0;i<6;i++)
            values2[i] = i+1;
        fourByFour2.assignedValues(values2);

        Matrix result = fourByFour1.add(fourByFour2);
        int [][] expected ={{0,0,0},{0,0,0}};
        assertTrue(result.isEqualTo(expected));
    }

    @Test
    public void multiplyWithShouldReturnTheNewMatrixOfMultiplicationResultOfTheSame(){
        Matrix fourByFour1 = new Matrix(3,2);
        int [] values1 = new int[6];
        for (int i=0;i<values1.length;i++)
            values1[i] = i+1;
        fourByFour1.assignedValues(values1);

        Matrix fourByFour2 = new Matrix(2,2);
        int [] values2 = new int[4];
        for (int i=0;i<values2.length;i++)
            values2[i] = i+1;
        fourByFour2.assignedValues(values2);
        
        Matrix result = fourByFour1.multiplyWith(fourByFour2);
        int[][] expected = {{7,10},{15,22},{23,34}};
        assertTrue(result.isEqualTo(expected));
    }

}
