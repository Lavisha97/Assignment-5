class StaticBlock 
{
	//private static List<String> list;
	static int arr[] = new int[4];
	
	static
	{
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
	}
	
	public void array(){
		System.out.println(arr[0]);
	}
	
	public static void main(String args []){
		StaticBlock msb = new StaticBlock();
		msb.array();
	}
}
