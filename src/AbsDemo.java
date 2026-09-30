


abstract class A
{
	abstract void show();
	public abstract void config();

}

 class B extends A
    {
        public void show()    {
                System.out.println("in B show");	
            
        }

         public void config()    {
                System.out.println("in B show");	
            
        }   
    }

public class  AbsDemo{
    public static void main(String[] args) {
    	
    	B obj=new B();
    	
    	//A obj=new A() 
    	//{
    		//public void show()
    	////	{
    		//	System.out.println("in new show ananymous abstract");
    	//	}
    	//};
    	obj.show();
       obj.config();
    	
    }
}
