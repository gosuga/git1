package practise;

public class Fibo {

	public static void main(String[] args) {
		int a=1;
		int sum=0;int count=0;int next=0;
		for(int i=1;i<=10;i++) {
			sum=count+a;
			
			//System.out.println(next);
			
			System.out.print(sum);
			count=a;
			a=sum;
		}
		}
	}

