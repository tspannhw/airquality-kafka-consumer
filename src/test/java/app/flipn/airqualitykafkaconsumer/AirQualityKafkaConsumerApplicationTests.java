package app.flipn.airqualitykafkaconsumer;

import app.flipn.airqualitykafkaconsumer.config.KafkaConsumerConfig;
import app.flipn.airqualitykafkaconsumer.service.KafkaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(
		classes = {
				KafkaConsumerConfig.class
		}
)
class AirQualityKafkaConsumerApplicationTests {

	@Test
	void contextLoads() {
	}
}