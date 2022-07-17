package demo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApplication {

	public static void main(String[] args) {
		 //  ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		   
		 Account account = ctx.getBean(Account.class);
		 System.out.println("Balance :" + account.getAmount());
		}

}
