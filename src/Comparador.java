import java.util.Scanner;

public class Comparador{

public static void main(String args[]){

int edad;

Scanner sc = new Scanner(System.in);
System.out.print("\n ingresa tu edad y te dire que puedes hacer : ");
edad = sc.nextInt();


while ((edad <= 0) || (edad >= 130))
{
System.out.print("\n datos erroneos verifique y vuelva introducer la edad : ");
System.out.print("\n ");
edad = sc.nextInt();
}
if (edad<18)
{
System.out.print("\n  eres menor de edad ");
System.out.print("\n ");
}
if (edad==18) 
{
System.out.print("\n eres mayode de edad ");
System.out.print("\n ");
}
if (edad > 18)
{
System.out.print("\n eres mayor edad ");
System.out.print("\n ");
}

}
}




// == igual
// < menor
// > mayor
// <= menor igual
// >= mayor igual



