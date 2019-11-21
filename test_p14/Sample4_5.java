public class Sample4_5
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new RacingCar();

		car1.setCar(1234,20.5);

		car1.show();
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
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("将车号设为"+num+",汽油量设为"+gas);
	}
	public void show()
	{
		System.out.println("车号是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCar extends Car
{
	private int course;

	public RacingCar()
	{
		course=0;
		System.out.println("生产了赛车");
	}

	public void setCourse(int c)
	{
		course=c;
		System.out.println("将赛车编号设为"+course);
	}

	public void show()
	{

		System.out.println("赛车的车号是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("赛车编号是"+course);
	}
}



