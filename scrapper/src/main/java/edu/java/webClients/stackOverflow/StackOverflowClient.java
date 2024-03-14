package edu.java.webClients.stackOverflow;

import edu.java.webClients.stackOverflow.dto.StackOverflowAnswerBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowQuestionBody;
import edu.java.webClients.stackOverflow.dto.StackOverflowResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface StackOverflowClient {
    @GetExchange(url = "/questions/{id}?site=stackoverflow&filter=withbody")
    StackOverflowResponseBody<StackOverflowQuestionBody> fetchQuestionById(@PathVariable long id);

    @GetExchange(url = "/questions/{id}/answers?site=stackoverflow&filter=withbody")
    StackOverflowResponseBody<StackOverflowAnswerBody> fetchAnswersByQuestionId(@PathVariable long id);

}
