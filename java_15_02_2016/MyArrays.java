public class MyArrays {
	int [] numbers;
	public MyArrays(int [] numbers){
		this.numbers = numbers;
	}
	private void printArrays(){
		System.out.print("[");
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]);
			if(i<numbers.length-1)
				System.out.print(",");
		}
		System.out.println("]");
	}
	public void print(){
		printArrays();
	}

	public int [] getEvenNumbers(){
		int [] evenNumbers;
		int index = 0;
		int [] result;
		int index1 = 0;
		evenNumbers = new int[this.numbers.length];
		for(int i = 0; i<this.numbers.length; i++)
			if(this.numbers[i]%2==0){
				evenNumbers[index]=this.numbers[i];
				index++;
			}
		result = new int[index];
		for(int i = 0; i<index; i++)
			if(evenNumbers[i]>0){
				result[index1]=evenNumbers[i];
				index1++;
			}
		return result;
	}
	public int [] getOddNumbers(){
		int [] oddNumbers;
		int index = 0;
		int [] result;
		int index1 = 0;
		oddNumbers = new int[this.numbers.length];
		for(int i = 0; i<this.numbers.length; i++)
			if(this.numbers[i]%2!=0){
				oddNumbers[index]=this.numbers[i];
				index++;
			}
		result = new int[index];
		for(int i = 0; i<index; i++)
			if(oddNumbers[i]>0){
				result[index1]=oddNumbers[i];
				index1++;
			}
		return result;
	}

    public MyArrays reverse(){
        int [ ]reversed;
        reversed = new int [numbers.length];
        for (int i =numbers.length-1; i>=0; i--)
            reversed[numbers.length-1-i] = numbers[i];
        return new MyArrays(reversed);
    }

}
