
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
        Matrix fourByFourMatrix = new Matrix(4,4);
        int [] values1 = new int[16];
        for (int i=0;i<16;i++)
            values1[i] = i+1;
        fourByFourMatrix.assignedValues(values1);

        Matrix fourByFour2 = new Matrix(4,4);
        int [] values2 = new int[16];
        for (int i=0;i<16;i++)
            values2[i] = i+1;
        fourByFour2.assignedValues(values2);

        Matrix result = fourByFourMatrix.add(fourByFour2);

        int [][] expected ={{2,4,6,8},{10,12,14,16},{18,20,22,24},{26,28,30,32}};
        assertTrue(result.isEqualTo(expected));
    }

    @Test
    public void addShouldReturnANullMatrixIfTwoMatrixAreOfDifferentOrder() {
        Matrix fourByFourMatrix = new Matrix(4,4);
        int [] values1 = new int[16];
        for (int i=0;i<16;i++)
            values1[i] = i+1;
        fourByFourMatrix.assignedValues(values1);

        Matrix twoByThreeMatrix = new Matrix(2,3);
        int [] values2 = new int[6];
        for (int i=0;i<6;i++)
            values2[i] = i+1;
        twoByThreeMatrix.assignedValues(values2);

        Matrix result = fourByFourMatrix.add(twoByThreeMatrix);
        int [][] expected ={{0}};
        assertTrue(result.isEqualTo(expected));
    }

    @Test
    public void multiplyWithShouldMultiply3by2With2by2(){
        Matrix threeBytwoMatrix = new Matrix(3,2);
        int [] values1 = new int[6];
        for (int i=0;i<values1.length;i++)
            values1[i] = i+1;
        threeBytwoMatrix.assignedValues(values1);

        Matrix twoByTwoMatrix = new Matrix(2,2);
        int [] values2 = new int[4];
        for (int i=0;i<values2.length;i++)
            values2[i] = i+1;
        twoByTwoMatrix.assignedValues(values2);
        Matrix result = threeBytwoMatrix.multiplyWith(twoByTwoMatrix);
        int[][] expected = {{7,10},{15,22},{23,34}};
        assertTrue(result.isEqualTo(expected));
    }
    @Test
    public void multiplyWithShouldMultiply4by4With4by2(){
        Matrix fourByFourMatrix = new Matrix(4,4);
        int [] values1 = new int[16];
        for (int i=0;i<values1.length;i++)
            values1[i] = i+1;
        fourByFourMatrix.assignedValues(values1);

        Matrix fourByTwoMatrix = new Matrix(4,2);
        int [] values2 = new int[8];
        for (int i=0;i<values2.length;i++)
            values2[i] = i+1;
        fourByTwoMatrix.assignedValues(values2);
        Matrix result = fourByFourMatrix.multiplyWith(fourByTwoMatrix);
        int[][] expected = {{50,60},{114,140},{178,220},{242,300}};
        assertTrue(result.isEqualTo(expected));
    }

}
