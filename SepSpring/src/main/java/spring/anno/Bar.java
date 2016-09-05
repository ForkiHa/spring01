package spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bar {

	private Foo foo;
	
	
	@Bean(name="scottFoo")
	public Foo activeFoo(){
		Foo foo = new Foo();
		foo.setName("scott");
		return foo;
	}
	
	@Required
	@Autowired
	@Qualifier("action")
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public void doBar(){
		foo.doFoo();
	}
	
}
