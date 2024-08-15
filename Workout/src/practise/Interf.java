package practise;

interface face {
	void a();

	void b();
String ho(int t);
}

class Interf implements face {
	String s = "hi";

	public void a() {
		System.out.println("alphabet");
	}

	public void b() {
		System.out.println("bye");
	}

	public String ho(int t) {
		// System.out.println("string");
		return t + " ";
	}

	public static void main(String[] args) {
		Interf i = new Interf();
		i.a();
		i.b();
		String w = i.ho(1);
		System.out.println(w);
	}
}
