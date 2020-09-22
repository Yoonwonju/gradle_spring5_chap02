package gradle_spring5_chap02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import gradle_spring5_chap02.di.MemberDao;
import gradle_spring5_chap02.di.MemberPrinter;

@Configuration
@Import(AppConf2.class)
public class AppConfImport {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

}
