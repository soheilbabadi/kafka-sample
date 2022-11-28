package workflow.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workflow.consumer.entity.Event;
import workflow.consumer.repository.UserRepository;

import java.util.List;

@Service
public class HistoryProviderService {
    @Autowired
    private UserRepository userRepository;

    public List<Event> getAllEvents() {
        return userRepository.findAll();
    }
}
