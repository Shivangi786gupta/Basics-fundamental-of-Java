/**
Write a program for the following:

0
1 0
0 1 0
1 0 1 0

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
class Number2
{
public static void main(String[] args)
{
int k=0,P=1,num=0;
for(int i=1;i<=4;i++){
num++;
for(int j=1;j<=num;j++){
int sum=i+j;
if(sum%2==0){
System.out.print(k +" ");
}else
{
System.out.print(P +" ");
}
}
System.out.println();
}
}
}