package SimpleJavaPrograms;

 public class ConstructorDemo {
	
	private String fname;
	//private String lname;
	 
   public ConstructorDemo(String fname)
	{
		this.fname=fname;
		//this.lname=lname;
	}
	
//	ConstructorDemo(){
//		System.out.println("niki");
//	}

//	public class Demo{
		
	public static void main(String args[]) {
	ConstructorDemo cd=new ConstructorDemo("niki");
	cd.fname="niki1";
	System.out.println(cd.fname);
	//System.out.println(cd.lname);
	}

}
