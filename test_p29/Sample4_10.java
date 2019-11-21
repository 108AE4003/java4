public class Sample4_10
{
	public static void main(String[] args)
	{
		Vehicle[]vc=new Vehicle[2];

		vc[0]=new Car(1234,20.5);
		vc[0].setSpeed(60);

		vc[1]=new Plane(232);
		vc[1].setSpeed(500);

		for (int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}
	}
}
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed =s;
		System.out.println("将速度设为"+speed+"了");
	}
	abstract void show();
}
class Car extends Vehicle
{
	private int num;
	private double gas;
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生产了车号为"+num+",汽油量为"+gas+"的车子");
	}
	public void show()
	{
		System.out.println("车号是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane extends Vehicle
{
	private int flight;
	public Plane(int f)
	{
		flight=f;
		System.out.println("生产了"+flight+"班次的飞机");
	}
	public void show()
	{
		System.out.println("飞机的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}