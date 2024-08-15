package Assignment;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StrmStudent {
static	int id;
static	String Student;
static	int SubMark1;
static	int SubMark2;
static	int SubMark3;
static	int SubMark4;
static	int SubMark5;
static	long MobNo;
int total;
	public StrmStudent(int id,String Student,int SubMark1,int SubMark2,int SubMark3,int SubMark4,int SubMark5,long MobNo) {
		this.id=id;
	    this.Student=Student;
		this.SubMark1=SubMark1;
		this.SubMark2=SubMark2;
		this.SubMark3=SubMark3;
		this.SubMark4=SubMark4;
		this.SubMark5=SubMark5;
		this.MobNo=MobNo;
		}
	public String toString() {
		return id+" "+Student+" "+SubMark1+" "+SubMark2+" "+SubMark3+" "+SubMark4+" "+SubMark5+" "+MobNo;
	}
	
static	Scanner st=new Scanner(System.in);
public static void main(String[] args) {
	
//	ArrayList<StrmStudent>ss= new ArrayList<StrmStudent>();
//	ss.add(new StrmStudent(id,Student,SubMark1,SubMark2,SubMark3,SubMark4,SubMark5,MobNo));
	//	ss.add(new StrmStudent(2,"bala",56,65,77,88,78,222222222));
	ArrayList<StrmStudent>ss= new ArrayList<StrmStudent>();
for (int i=1;i<=1;i++) {
	System.out.println("Enroll the id");
int 	Identity=st.nextInt();
	System.out.println("Enroll the name");
	String person=st.next();
	System.out.println("Enter the sub1 Mark");
	int Mark1=st.nextInt();
	System.out.println("Enter the sub2 Mark");
	int Mark2=st.nextInt();
	System.out.println("Enter the sub3 Mark");
	int Mark3=st.nextInt();
	System.out.println("Enter the sub4 Mark");
	int Mark4=st.nextInt();
	System.out.println("Enter the sub5 Mark");
	int Mark5=st.nextInt();
	System.out.println("Enter the Mobile number");
	long Mob=st.nextLong();
	ss.add(new StrmStudent(Identity,person,Mark1,Mark2,Mark3,Mark4,Mark5,Mob));
	//System.out.println(ss);
	 total=Mark1+Mark2+Mark3+Mark4+Mark5;
	System.err.println(total);
}
ss.stream().forEach(System.out::println);
//Iterator <StrmStudent> t=ss.iterator();
//while (t.hasNext()) {
//	StrmStudent s1=(StrmStudent)t.next();.mapToInt(c->c.SubMark1+c.SubMark2+c.SubMark3+c.SubMark4+c.SubMark5)
//	System.out.println(s1);

Stream<StrmStudent> Result=ss.stream();
Result.filter(a->a.SubMark1>35&&a.SubMark2>35&&a.SubMark3>35&&a.SubMark4>35&&a.SubMark5>35).mapToInt(c->c.SubMark1+c.SubMark2+c.SubMark3+c.SubMark4+c.SubMark5).forEach(b-> System.out.println("pass"));
Stream<StrmStudent> pass=ss.stream();
pass.filter(a->a.SubMark1<35||a.SubMark2<35||a.SubMark3<35||a.SubMark4<35||a.SubMark5<35).mapToInt(c->c.SubMark1+c.SubMark2+c.SubMark3+c.SubMark4+c.SubMark5).forEach(b-> System.out.println("Fail"));

//System.out.println(ss);
}
}
