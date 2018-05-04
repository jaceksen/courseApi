package pl.jaceksen.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				
				new Topic("spring", "Spring Framework", "Spring description"),
				new Topic("java", "Core Java", "Java description"),
				new Topic("javascript", "JavaScript", "JavaScript description"),
				new Topic("angular", "Angular", "Angular description"),
				new Topic("android", "Android", "Android description"),
				new Topic("tensorflow", "TensorFlow", "TensorFlow description"),
				new Topic("ionic", "Ionic", "Ionic description"),
				new Topic("ai", "AI", "AI description")
				
				);
	}
}
