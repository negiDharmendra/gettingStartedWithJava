class ArraysMain {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		int [] nums1 = {1,2,3,4,5,6,7,8,9,10};
		MyArrays numbers = new MyArrays(nums);
		numbers.print();
		MyArrays.print(numbers.getEvenNumbers());
		MyArrays.print(numbers.getOddNumbers());
		System.out.println(MyArrays.deepEqual(nums,nums1));
	}    
}
