public class DependentforLoop
{
public static void main(String args[])
{

for(int num=1;num<=20000;num=num+1)
{

for(int i=1;i<=num;i=i+1)
{
if(num%i==0)
{
System.out.println(i +"     hiiii   " +num);
}
}
}
}
}   
