package gradle_spring5_chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);){
			Greeter g = ctx.getBean("greeter", Greeter.class);
			String msg = g.greet("스프링5");
			System.out.println(msg);
			
			Greeter g1 = ctx.getBean("greeter", Greeter.class);
			Greeter g2 = ctx.getBean("greeter", Greeter.class);
			
			System.out.printf("(g1 == g2) = %s", (g1 == g2));
			
//			MemberDao memberDao = new MemberDao();
//			MemberRegisterService regSvc = new MemberRegisterService(memberDao);
//			ChangePasswordService pwdSvc = new ChangePasswordService();
//			pwdSvc.setMemberDao(memberDao);
		}
	}

}
