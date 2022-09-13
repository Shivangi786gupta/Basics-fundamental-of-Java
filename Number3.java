/**
Write a program for the following:
1
1 2
1 2 3
1 2 3 4
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
class Number3
{
public static void main(String[] args)
{
int num=0;
for(int i=1;i<=4;i++){
int k=1;
num++;
for(int j=1;j<=num;j++){
System.out.print(k++ +" ");
}
System.out.println();
}
}
}