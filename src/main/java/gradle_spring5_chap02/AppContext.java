package gradle_spring5_chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration				//해당 클래스를 스프링 설정 클래스로 지정한다.
public class AppContext {
	
	@Bean
	public Greeter greeter() {			//Bean 객체에 대한 정보를 담고 있는 greeter() 메소드
		Greeter g = new Greeter();		//객체 생성, 스프링이 생성하는 객체를 Bean 객체
		g.setFormat("%s, 안녕하세요!");	//객체 초기화
		return g;
	}

}
