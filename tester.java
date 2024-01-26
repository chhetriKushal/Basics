package test;

public class tester {

    public static void main(String[] args) {
        
     for(int i = 1; i <= 20;i++) 
     {
        
         if(i%3 == 0 && i % 5 ==0) 
         {
             System.out.println("FizzBuzz");
         }else
         if(i%3 == 0) 
         {
             System.out.println("Fizz");
         }else
         if(i%5 == 0) 
         {
             System.out.println("Buzz");
         }
         else 
         {
             System.out.println(i);
         }
     }
        
        
    }
}

/*
 * static void convert_to_binary( int number, int bits[] ){
 * for(int i = 0; i < 64;i++){
 * bits[i] = 0;
 * }
 * 
 * //convert the decimal to convert_to_binary
 * int i = 0;
 * 
 * while(number > 0 && i < 63){
 * int temp = (int)(number % 2);
 * 
 * if (temp == 1) {
 * bits[i] = 1;
 * } else {
 * bits[i] = 0;
 * }
 * 
 * number = number / 2;
 * i++;
 * }
 * for(int i2 : bits)
 * {
 * System.out.print(i2);
 * }
 * }
 * 
 * static void convert_to_hexadecimal( int number, int hex[] )
 * {
 * int i = 0;
 * 
 * while (number > 0) {
 * int remainder = number % 16;
 * 
 * // Convert remainder to hex character
 * if (remainder < 10) {
 * hex[i] = remainder + 48;
 * } else {
 * hex[i] = remainder + 55;
 * }
 * 
 * number /= 16;
 * i++;
 * }
 * 
 * for(int i2 : hex)
 * {
 * System.out.print((char) i2);
 * }
 * 
 * }
 * 
 * }
 */
