class a implements Runnable
{
synchronized public void run()
	{

	try
	{
	Thread t=Thread.currentThread();
	String name=t.getName();
	for(int i=0;i<10;i++)
	{
	  System.out.println(name+"="+i);
	Thread.sleep(500);
	if(name.equals("raj") && (i==4))
	{
	  wait();
	}
	if(name.equals("geeta") && (i==4))
	{
	  wait();
	}
	if(name.equals("seeta") && (i==6))
	{
	System.out.println("raj and geeta thread wakes up...");
	  notifyAll();
	
	}
	if(name.equals("raj") && (i==9))
	{
	notify();
	}	}
		}catch(Exception e){}
	}
    public static void main(String args[]) throws Exception
{ 
     a obj=new a();
  Thread t1=new Thread(obj,"raj");
 Thread t2=new Thread(obj,"seeta");
 Thread t3=new Thread(obj,"geeta");
        t1.start();
       t2.start();
       t3.start();
}}