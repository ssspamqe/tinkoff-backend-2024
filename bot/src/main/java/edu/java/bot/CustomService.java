package edu.java.bot;

import edu.java.bot.data.entities.Subscription;
import jakarta.validation.Valid;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Repository
@Validated
public class CustomService {

    @Validated
    public void foo(@Valid Subscription subscription){
        System.out.println(subscription);
    }
}
