import java.util.*;
class converter
{

      public static void main( String[] args)
{

       Scanner in= new Scanner(System.in);
       System.out.print(" input minutes:");
            
      int minutes= in.nextInt();
int years= minutes/518400;
int rem=minutes%518400;
int months=rem/43200;
int rem2= months%43200;
int days=rem2/1440;
int rem3= days%1440;
System.out.print( " hours is: "+ rem3);
System.out.print( " days is: "+ days);
System.out.print( " months is: "+ months);
System.out.print( " years is: "+ years);
System.out.print( " \n ");

   }
}