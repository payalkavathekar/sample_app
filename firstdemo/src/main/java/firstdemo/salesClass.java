package firstdemo;

public class salesClass {
	public static void main(String args[]) {
		int arr[]= {33,30,24,5};
		for(int i:arr)
			System.out.println(i);
	}
	
	public static void display() {
		System.out.println("numbers frm array:");
		
		for(int i=0;i<100;i++)
			System.out.println("print i" + i);
		
		display();
	}

}
