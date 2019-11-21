public class Sample4_2
{
	public static void main(String[] args)
	{
		RacingCar rccar1=new RacingCar(1234,20.5,5);
	}
}
class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生产了车子");
	}

	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生产了车号为"+num+",汽油量为"+gas+"的车子");
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
	public  RacingCar(int n,double g,int c)
	{
		super(n,g);
		course=c;
		System.out.println("生产了编号为"+course+"的赛车");
	}
	public void setCourse(int c)
	{
		course=c;
		System.out.println("将赛车编号设为"+course);
	}
}