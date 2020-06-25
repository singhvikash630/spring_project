package net.roseindia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Spring3HelloWorldConfig
    {
	@Bean
    public  Spring3HelloWorld spring3HelloWorld()
	   {
	    return new Spring3HelloWorld();
	   }
	}
