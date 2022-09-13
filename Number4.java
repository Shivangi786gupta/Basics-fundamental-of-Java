/**
Write a program for the following:

@
2 @
4 5 @
7 8 9 @
			
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
class Number4
{
public static void main(String[] args){
int str=0, num=1;
for(int i=1;i<=4;i++){
str++;
for(int j=1;j<=str;j++){
if(i==j){
System.out.print("@");
num++;
}
else
{
System.out.print(num++ +" ");
}
}
System.out.println();
}
}
}