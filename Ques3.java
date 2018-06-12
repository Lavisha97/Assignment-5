class DisplayOverloading
{
	public void disp()
	{
		System.out.println("Null");
	}
	
    public void disp(int c)
    {
         System.out.println("Integer "c);
    }
	
    public void disp(float d)  
    {
         System.out.println("Float "d);
    }
	
	public static void main(String args [])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp(5);
       obj.disp(6.98f);
	   obj.disp();
   }
}