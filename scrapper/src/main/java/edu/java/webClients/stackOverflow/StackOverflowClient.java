package edu.java.webClients.stackOverflow;

import edu.java.webClients.stackOverflow.DTO.StackOverflowAnswer;
import edu.java.webClients.stackOverflow.DTO.StackOverflowQuestion;
import edu.java.webClients.stackOverflow.DTO.StackOverflowResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface StackOverflowClient {
    @GetExchange(url = "/questions/{id}?site=stackoverflow&filter=withbody")
    StackOverflowResponse<StackOverflowQuestion> findQuestionById(@PathVariable int id);

    @GetExchange(url = "/questions/{id}/answers?site=stackoverflow&filter=withbody")
    StackOverflowResponse<StackOverflowAnswer> findAnswersByQuestionId(@PathVariable int id);

}
