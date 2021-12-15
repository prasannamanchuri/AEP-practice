package CorejavaRevision;

 public class Loosecoupling{
	public static void main(String args[]) 
    {
		Volume v = new Volume(5);
        System.out.println(v.volume);
    }

}
class Volume 
{
	
	public int volume;
    Volume(int height) 
    {
    	Area a = new Area(5,15);
        this.volume =a.area *height;
    }
}
class Area 
{
     public int area;
     Area(int length, int width) 
     {
         this.area = length * width;
     }
}
//Java program to illustrate
//loose coupling concept
class Tightcoupling
{
	public static void main(String args[])
	{
		Volume1 v = new Volume1(5,5,5);
		System.out.println(v.getVolume());
	}
}
final class Volume1
{
	private int volume;
	Volume1(int length, int width, int height)
	{
		this.volume = length * width * height;
	}
	public int getVolume()
	{
		return volume;
		
	}
}
