package helloworld.client;

import helloworld.HelloWorldConnection;
import helloworld.HelloWorldConnectionFactory;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.resource.ResourceException;

import java.util.logging.Logger;

@Singleton(name = "HelloWorldBean")
public class HelloWorldBean {
	Logger log = Logger.getLogger(getClass().getName());
	

	@PostConstruct
	public void constructed() {
		
	}
	
	@Resource(lookup = "java:/eis/HelloWorld")
	HelloWorldConnectionFactory connectionFactory;
	
	@Schedule(second="*/3", minute="*", hour="*")
	public void Boom() {
		HelloWorldConnection connection = null;
		try {
			connection = connectionFactory.getConnection();
			log.info(connection.helloWorld("FooFoo!"));
		} catch (ResourceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		
	}
}
