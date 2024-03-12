class Sum
{
public static void main(String ar[]	)
{
First rv1=new First();
int i =rv1.sum(10,20,30,40);
int o =rv1.ave(10,20,30,40);
System.out.println("sum of 4 number"+i);
System.out.println("average of 4 number"+o);

}
}
class First 
{
int a,b,c,d,result;

int sum(int x,int z,int s,int v)
{
a=x; b=z; c=s;d=v;

return a+b+c+d;
}
int ave(int x,int z,int s,int v)
{
a=x; b=z; c=s;d=v;
return (a+b+c+d)/4;
}
}