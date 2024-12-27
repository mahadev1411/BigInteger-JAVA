import java.math.BigInteger;
public class BigInteger1 
{
    public static void main(String[] args) 
    {
        BigInteger b1=new BigInteger("12345"); //initialize new biginteger object
        BigInteger b2=new BigInteger("3456"); //initialize new biginteger object
        BigInteger sum=b1.add(b2); //adding 2 bigintegers
        BigInteger diff=b1.subtract(b2); //subtracting 2 bigintegers
        BigInteger mul=b1.multiply(b2);  //Multiplying 2 bigintegers
        BigInteger div=b1.divide(b2);    //dividing 2 bigintegers(b1/b2)
        BigInteger mod=b1.mod(b2);       //taking modulus of b1/b2
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        if (b1.compareTo(BigInteger.ZERO) > 0) 
        {
            System.out.println(b1+ "is greater than 0");
        }
        int divisor = 5; 
        BigInteger result = BigInteger.valueOf(divisor); //storing integer into biginteger
        System.out.println(result);
        if(b1.compareTo(b2)>0) //checking maximum of b1 and b2
        System.out.println(b1+"is greater");
        BigInteger base = new BigInteger("2");
        int exponent = 10;
        BigInteger result1 = base.pow(exponent); //taking powers
        System.out.println(result1);
        int intValue1 = b1.intValue(); //converting biginteger to int
        System.out.println(intValue1);
        if (b1.equals(BigInteger.ZERO))  //checking if biginteger is equal to 0
        {
            System.out.println("The BigInteger is equal to 0.");
        } 
        else 
        {
            System.out.println("The BigInteger is not equal to 0.");
        }
    }
}
