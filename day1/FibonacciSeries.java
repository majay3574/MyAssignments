package week2.day1;

public class FibonacciSeries {
	//input: 8 output:0,1,1,2,3,5,8,13
		//Fibonacci Series
		public static void main(String[] args) {
			int range= 8;
			int a=0;
			int b=1;
			int c;
			for(int i =0; i<range; i++) {
				System.out.print(a+",");
				//c=0+1,c=1+
				c=a+b;
				//1=0
				b=a;
				//a=0
				a=c;
			}
		}

}
