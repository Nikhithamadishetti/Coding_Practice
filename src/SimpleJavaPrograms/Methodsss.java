package SimpleJavaPrograms;

public class Methodsss 
{
	private String fname;

	public String getfname() 
	{
		return fname;
	}
	
	public void setname(String fname) 
	{
		this.fname=fname;
	}	
	
	public static void main(String args[]) 
	{	
	Methodsss md=new Methodsss();
	md.setname("niki");
	System.out.println(md.getfname());
	}
	
}
