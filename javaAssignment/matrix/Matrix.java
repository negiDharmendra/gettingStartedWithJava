package javaAssignment.matrix;
import java.util.Arrays;
public class Matrix {
	private int [][]matrix;
	private int row;
	private int colomn;
	public Matrix(int row, int colomn){
		this.row = row;
		this.colomn = colomn;
		this.matrix = new int[row][colomn];
   	}
   	private int row (){
   		return this.row;
   	}
   	private int colomn (){
   		return this.colomn;
   	}
   	public boolean isEqualTo(int [][] matrixToBeCompared){
		return Arrays.deepEquals(this.matrix,matrixToBeCompared);
	}
	public void assignedValues(int []values){
		int count=0;
		for(int i=0; i<this.row; i++){
			for(int j=0; j<this.colomn; j++){
				this.matrix[i][j] = values[count];
				count++;
			}
		}
	}
	public void print(){
		for(int i=0; i<this.row; i++){
			for(int j=0; j<this.colomn; j++)
				System.out.print("\t"+this.matrix[i][j]+"\t");
			System.out.println();
		}
	}
	public Matrix add(Matrix addendMatrix){
		if(this.row!=addendMatrix.row||this.colomn!=addendMatrix.colomn)
			return new Matrix(addendMatrix.row,addendMatrix.colomn);
		Matrix result = new Matrix(this.row,this.colomn);
		for(int i=0; i<this.row; i++)
			for(int j=0; j<this.colomn; j++)
				result.matrix[i][j] = this.matrix[i][j]+addendMatrix.matrix[i][j];
		return result;
   }
}