package myUtil;

public class Math {
    public static int add(int number1,int number2){
    	return number1+number2;
    }
    public static int sub(int number1,int number2){
    	return number1-number2;
    }
    public static int pow(int number1,int pow){
    	int result =1;
    	for(int i = 0; i<pow; i++)
    		result*=number1;
    	return result;
    }
    public static int subtr(int number1,int number2){
    	return number1-number2;
    }
}
