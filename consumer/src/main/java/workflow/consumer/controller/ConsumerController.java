package workflow.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import workflow.consumer.entity.Event;
import workflow.consumer.service.HistoryProviderService;

import java.util.List;

@RestController
@RequestMapping("/history")
public class ConsumerController {

    @Autowired
    private HistoryProviderService historyProviderService;

    @GetMapping
    public ResponseEntity<List<Event>> getHistory() {
        return new ResponseEntity<>(historyProviderService.getAllEvents(), HttpStatus.OK) ;
    }
}
