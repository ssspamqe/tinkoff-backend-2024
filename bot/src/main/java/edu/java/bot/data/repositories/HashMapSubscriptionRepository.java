package edu.java.bot.data.repositories;

import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.exceptions.DatabaseIsFullException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HashMapSubscriptionRepository extends HashMapRepository<Subscription, Long>
    implements SubscriptionRepository {

    @Override
    public List<Subscription> findAllByUserId(long userId) {
        return executeWithLock(rwLock.readLock(), () ->
            database.values()
                .stream()
                .filter(subscription -> subscription != null && subscription.getUserId() == userId)
                .toList()
        );
    }

    @Override //TODO increase performance
    public void save(Subscription subscription) {
        executeWithLock(rwLock.writeLock(), () -> {
            if (subscription.getId() != 0) {
                database.put(subscription.getId(), subscription);
            } else {
                long id = getFreeId();
                subscription.setId(id);
                database.put(id, subscription);
            }
        });
    }

    private long getFreeId() {
        for (long i = 1L; i < HASH_MAP_SIZE; i++) {
            if (database.get(i) == null) {
                return i;
            }
        }
        throw new DatabaseIsFullException();
    }
}
