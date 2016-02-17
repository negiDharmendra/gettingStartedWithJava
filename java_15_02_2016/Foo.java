public class Foo {
    public static void main(String []args) {
    	Number num1 = new Number(32);
        System.out.println("The number "+num1.getNumber());
        System.out.println("The square of "+num1.getNumber()+" should be 4 and is: "+num1.square());
        System.out.println("The cube of "+num1.getNumber()+" should be 8 and is: "+num1.cube());
        System.out.println("The "+num1.getNumber()+" power 2 is 4 and is: "+num1.power(2));
        System.out.println("The "+num1.getNumber()+" power 4 should be 16 and is: "+num1.power(4));
        System.out.println("The number "+num1.getNumber()+" should not be even and is: "+num1.isEven());
        System.out.println("The number "+num1.getNumber()+" should be odd and is: "+num1.isOdd());
        System.out.println("The number "+num1.getNumber()+" should be prime number and is: "+num1.isPrime());
        System.out.println("The factors of "+num1.getNumber()+" should be 1,5 and these are: ");
        num1.getFactors();
    }
}
