package practise;

public class Clone implements Cloneable{
	
	int regNo;
	String name;
	
	public Clone(int regNo,String name) {
		this.regNo=regNo;
		this.name=name;
	}
	
	public Object test() throws CloneNotSupportedException{
		return super.clone();
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
			Clone c =new Clone(5, "ram");
			
		Clone c1=(Clone)c.clone();
		System.out.println(c.regNo+c.name);
		System.out.println(c1.regNo+c1.name);
		}

}

