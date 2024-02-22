package edu.java.bot.data.repositories;

import edu.java.bot.data.entities.Subscription;
import java.util.List;

public interface SubscriptionRepository extends BasicRepository<Subscription, Long> {
    List<Subscription> findAllByUserId(long userId);
}
