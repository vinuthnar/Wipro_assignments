class Test7{
public static void main(String args[]){
if(args.length>0){
for(int i=0;i<args.length;i++){

System.out.print(args[i]);
if(i<args.length-1){
System.out.print(",");
}
else{

System.out.println();
}
}
}
else{
System.out.print("No Value");
}
}}
