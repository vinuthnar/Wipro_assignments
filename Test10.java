
class Test10{
public static void main(String[] args){
String s=args[0];
int a=Integer.parseInt(args[1]);
if(s.equalsIgnoreCase("female")){
if(a>+1 && a<=58){
System.out.print("Percentage of interest is 8.2%");
}
else if (a>=59 && a<=100){
System.out.print("Percentage of interest is 9.2%");}
else 
System.out.print("no result");
}
else{
if(a>+1 && a<=58){
System.out.print("Percentage of interest is 8.4%");
}
else if (a>=59 && a<=100){
System.out.print("Percentage of interest is 10.5%");
}
else 
System.out.print("no result");

}
}
}



