public class Sample4_7
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();

		car1.setcar(1234,20.5);
		System.out.println(car1);
	}
}
class Car
{
	protected int num;
	protected double gas;

	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生产了车子");
	}

	public void setcar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("将车号设为"+num+",汽油量设为"+gas);
	}

	public String toString()
	{
		String str="车号:"+num+",汽油量:"+gas;
		return str;
	}
}

