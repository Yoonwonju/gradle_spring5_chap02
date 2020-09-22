package gradle_spring5_chap02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gradle_spring5_chap02.di.MemberDao;
import gradle_spring5_chap02.di.MemberPrinter;

@Configuration
public class AppConf1 {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
