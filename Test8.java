import java.util.Scanner;
class Test8{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
char Ch1=sc.next().charAt(0);
char Ch2=sc.next().charAt(0);
if(Ch1>Ch2){
System.out.print(Ch2 + "," +Ch1);
}
if(Ch2>Ch1) {
System.out.print(Ch1 + "," +Ch2);
}
}
}


