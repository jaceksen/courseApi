package pl.jaceksen.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	//immutable
//	private List<Topic> topics = Arrays.asList(
//			new Topic("spring", "Spring Framework", "Spring description"),
//			new Topic("java", "Core Java", "Java description"),
//			new Topic("javascript", "JavaScript", "JavaScript description"),
//			new Topic("angular", "Angular", "Angular description"),
//			new Topic("android", "Android", "Android description"),
//			new Topic("tensorflow", "TensorFlow", "TensorFlow description"),
//			new Topic("ionic", "Ionic", "Ionic description"),
//			new Topic("ai", "AI", "AI description")
//			);
	
	//mutable - można dodawać kolejne wartości
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring description"),
			new Topic("java", "Core Java", "Java description"),
			new Topic("javascript", "JavaScript", "JavaScript description"),
			new Topic("angular", "Angular", "Angular description"),
			new Topic("android", "Android", "Android description"),
			new Topic("tensorflow", "TensorFlow", "TensorFlow description"),
			new Topic("ionic", "Ionic", "Ionic description"),
			new Topic("ai", "AI", "AI description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i =0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}


	

}
