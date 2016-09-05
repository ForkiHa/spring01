package spring.DI;

public class Foo {

	Bar bar;
	Baz baz;
	
	public void start(){
		System.out.println("init메서드");
	}
	
	public void stop(){
		System.out.println("destroy메서드");
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	
	Foo(){}

	String str;
	public void setStr(String str) {
		this.str = str;
	}

	public void setI(int i) {
		this.i = i;
	}

	int i;
	
	void doFOO(){
		/*bar=getBar();*/
		System.out.println("str:"+str+"i:"+i);
		bar.doIt();
	}
	
	/*public Bar getBar(){
		return null; //.bar타입의 자동우로 리턴
	}*/
	
	Foo(String str, int i){
		
		this.str = str;
		this.i = i;
		System.out.println("str::"+str+"i::"+i);
	}
	
/*	Foo(String str, String s){
		System.out.println("String::" +str+s);
	}*/
	
	Foo(Bar bar, Baz baz){
		System.out.println("Bar bar, Baz baz");
		this.bar = bar;
		this.baz = baz;
	}
}


