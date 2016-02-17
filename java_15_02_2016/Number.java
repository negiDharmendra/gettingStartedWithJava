public class Number {
	private int number;
	public Number(int number){
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	public int square(){
		return this.number * this.number;
	}
	public int cube(){
		return this.number * this.number * this.number;
	}
	public int power(int pow){
		int result = 1;
		for(int i=0; i<pow; i++)
			result*=this.number;
		return result;
	}
	public boolean isEven (){
		return this.number%2==0;
	}
	public boolean isOdd (){
		return this.number%2!=0;
	}
	public boolean isPrime(){
		boolean result = true;
		for(int i = 2; i<=this.number/2; i++)
			if(this.number%i==0)
				result = false;
		return result;
	}
	public void getFactors(){
		int [] factors;
		int index = 1;
		factors = new int[(this.number/2)+1];
		factors[0] = 1;
		for(int i = 2; i<=this.number/2; i++)
			if(this.number%i==0){
				factors[index]=i;
				index++;
			}
		factors[index] = this.number;
		for(int i = 0; i<factors.length; i++)
			if(factors[i]>0)
				System.out.println(factors[i]);
	}
}