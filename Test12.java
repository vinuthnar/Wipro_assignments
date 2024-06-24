import java.util.Scanner;
class Test12{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
char op =sc.next().charAt(0);
switch(op){
case 'G':System.out.println("green");
break;
case 'O':System.out.println("orange");
break;
case 'Y':System.out.println("Yellow");
break;
case 'w':System.out.println("white");
break;
case 'R':System.out.println("red");
break;
case 'B':System.out.println("blue");
break;
default:
System.out.println("Incorrect");
}
}
}
