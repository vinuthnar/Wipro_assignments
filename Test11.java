import java.util.Scanner;
class Test11{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>='a' && ch <='z'){
System.out.print("replacing lowercase with uppercase " + (char)(ch-32));
}
else
System.out.print("replacing uppercase with lowercase " + (char)(ch+32));
}
}