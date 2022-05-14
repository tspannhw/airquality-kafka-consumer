package app.flipn.airqualitykafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirQualityKafkaConsumerApp implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(AirQualityKafkaConsumerApp.class);

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AirQualityKafkaConsumerApp.class, args);
	}

	@Override
	public void run(String... args) {
	}
}