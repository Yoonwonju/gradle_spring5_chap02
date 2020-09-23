package gradle_spring5_chap02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gradle_spring5_chap02.di.ChangePasswordService;
import gradle_spring5_chap02.di.MemberDao;
import gradle_spring5_chap02.di.MemberInfoPrinter;
import gradle_spring5_chap02.di.MemberListPrinter;
import gradle_spring5_chap02.di.MemberPrinter;
import gradle_spring5_chap02.di.MemberRegisterService;
import gradle_spring5_chap02.di.VersionPrinter;

@Configuration			//해당 클래스를 스프링 설정 클래스로 지정한다.
public class AppCtx {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao(), memberPrinter());
	}
	
	@Bean
	public MemberInfoPrinter memberInfoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(memberPrinter());
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}

	@Bean
	  public MemberInfoPrinter infoPrinter() {
	      MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
	      infoPrinter.setMemberDao(memberDao());
	      infoPrinter.setPrinter(memberPrinter());
	      return infoPrinter;
	}
	
}
