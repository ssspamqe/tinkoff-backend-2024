package edu.java.webClients.stackOverflow;

import edu.java.webClients.stackOverflow.DTO.Answer;
import edu.java.webClients.stackOverflow.DTO.Question;
import edu.java.webClients.stackOverflow.DTO.Response;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface StackOverflowClient {
    @GetExchange(url = "/questions/{id}?site=stackoverflow&filter=withbody")
    Response<Question> findQuestionById(@PathVariable int id);

    @GetExchange(url = "/questions/{id}/answers?site=stackoverflow&filter=withbody")
    Response<Answer> findAnswersByQuestionId(@PathVariable int id);

}
