/**
 * 
 */
package io.pivotal.pal.tracker;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Personal
 *
 */
@SpringBootApplication
public class PalTrackerApplication {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(PalTrackerApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8090"));
        app.run(args);
    }

}
