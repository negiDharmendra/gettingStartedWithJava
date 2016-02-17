class ArraysMain {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		int [] nums1 = {1,2,3,4,5,6,7,8,9,10};
		int [] nums2 = {10,9,8,7,6,5,4,3,2,1};

		MyArrays numbers = new MyArrays(nums);
		numbers.print();
		Array.print(numbers.getEvenNumbers());
		Array.print(numbers.getOddNumbers());
		System.out.println(Array.deepEqual(nums,nums1));
		MyArrays reversedNumbers = numbers.reverse();
		System.out.println(Array.deepEqual(reversedNumbers.numbers	,nums2));
		reversedNumbers.print();
		System.out.println(Array.deepEqual(reversedNumbers.reverse().numbers	,nums));

	}
}
