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
   public int row (){
   		return this.row;
   }
   public int colomn (){
   		return this.colomn;
   }
   public int[][] get(){
   		return matrix;
   }
   public void populate(int []values){
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
}