package edu.java.bot.data.repositories;

import edu.java.bot.data.entities.Subscription;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HashMapSubscriptionRepository extends HashMapRepository<Subscription, Long>
    implements SubscriptionRepository {
    @Override
    public List<Subscription> findAllByUserId(long userId) {
        return database.values()
            .stream().
            filter(subscription -> subscription.getUserId() == userId)
            .toList();
    }

    @Override
    public void save(Subscription subscription) {
        System.out.println("saved: " + subscription);
    }
}
