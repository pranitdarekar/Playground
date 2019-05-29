class MyModel1 {
     //write your logic here
	 int cam1;
	 int display;
	public int getCam() {
		return cam1;
	}
	public void setCam(int cam) {
		this.cam1 = cam;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		this.display = display;
	}
	
}
class MyModel2 extends MyModel1 {
     //write your logic here
	int cam2;
	String lock;
	public int getCam2() {
		return cam2;
	}
	public void setCam2(int cam) {
		this.cam2 = cam;
	}
	public String getLock() {
		return lock;
	}
	public void setLock(String lock) {
		this.lock = lock;
	}
}
class MyModel2T extends MyModel2 {
     //write your logic here
	int cam2T;
	int display2T;
	public int getCam2T() {
		return cam2T;
	}
	public void setCam2T(int cam2t) {
		cam2T = cam2t;
	}
	public int getDisplay2T() {
		return display2T;
	}
	public void setDisplay2T(int display) {
		this.display2T = display;
	}
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
    	MyModel1 obj1=new MyModel1();
    	MyModel2 obj2=new MyModel2();
    	MyModel2T obj3=new MyModel2T();
    	
    	obj1.setCam(2);
    	obj1.setDisplay(5);
    	
    	obj2.setCam2(5);
    	obj2.setLock("Fingerprint");
    	
    	obj3.setCam2T(16);
    	obj3.setDisplay2T(6);
    	
    	System.out.println("Features of MyModel 1");
    	System.out.println("Camera mega pixels: "+obj1.getCam());
    	
    	System.out.println("Features of MyModel 2");
    	System.out.println("Camera mega pixels: "+obj2.getCam2());
    	System.out.println("Lock mechanism: "+obj2.getLock());
    	System.out.println("Display size: "+obj1.getDisplay());
    	
    	System.out.println("Features of MyModel 2T");
    	System.out.println("Camera mega pixels: "+obj3.getCam2T());
    	System.out.println("Lock mechanism: "+obj2.getLock());
    	System.out.println("Display size: "+obj3.getDisplay2T());
    }
}