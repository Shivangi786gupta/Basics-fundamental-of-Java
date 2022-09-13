/**
Write a program for the following:
  
    *
   **
  @**
 ****
*****
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
class NestedLoop8
{
public static void main(String[] args)
{
int star=6,space=-1;
	for(int i=1;i<=5;i++){
space++;
star--;
	for(int j=1;j<=space;j++){
	System.out.print(" ");
	}
	for(int j=1;j<=star;j++){
	if (i==3&&j==1){
	System.out.print("@");
	}else{
	System.out.print("*");
	}
	}
	System.out.println();
}
}
}