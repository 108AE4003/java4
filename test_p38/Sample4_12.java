public class Sample4_12
{
	public static void main(String[] args)
	{
		iVehicle[]ivc;
		ivc=new iVehicle[2];

		ivc[0]=new Car(1234,20.5);

		ivc[1]=new Plane(232);

		for (int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
	}
}
interface iVehicle
{
	int weight = 1000;
	void show();
}
class Car implements iVehicle
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
	}
}
class Plane implements iVehicle
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
	}
}

