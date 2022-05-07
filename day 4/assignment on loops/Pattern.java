class Pattern{
public static void main(String args[]){
int i,j;
for(i=1; i<=5; i=i+1)
{
for(j=1; j<=i ; j=j+1)
{
if(i==j || i+j==6)
{
System.out.print("*");

}
else
{
System.out.print(" ");
}

}
System.out.println();

}
}
}
