package ioc.question_07;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

/**
 * What is the preferred way to close an application context?
 * StandAlone application: registering a shutdownhook using  {@link ConfigurableApplicationContext}.
 * WebApplication: automaticaly by the {@link ContextLoaderListener#contextDestroyed(javax.servlet.ServletContextEvent)}.
 *
 * Spring Boot closes stand-alone and web applications in the same way, but manual registering of the shutdown hook isn't
 * required for stand-alone applications
 */

public class AppContextCreation {

 public static void main( String[] args ) {
//        ApplicationContext apContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
//        ((ConfigurableApplicationContext)apContext).registerShutdownHook();
//        final Object pesrson = apContext.getBean("person");
//        System.out.println(pesrson);
 }
}
