package edu.java.bot.temporaryDataStorage;

import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.HashMapSubscriptionRepository;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class HashMapSubscriptionRepositoryTest {

    HashMapSubscriptionRepository subscriptionRepository;

    @BeforeEach
    void init() {
        subscriptionRepository = new HashMapSubscriptionRepository();
    }

    @Test
    void should_saveAndFindSubscriptionsById() {
        Subscription expectedSubscription = new Subscription(1L, 1L, "https://link");

        subscriptionRepository.save(expectedSubscription);
        Subscription actualSubscription = subscriptionRepository.findById(1L).orElse(null);

        assertThat(actualSubscription).isEqualTo(expectedSubscription);
    }

    @Test
    void should_returnEmptyOptional_when_noSubscriptionsWithSuchId() {
        subscriptionRepository.save(new Subscription(1L, 2L, "https://link"));
        subscriptionRepository.save(new Subscription(2L, 2L, "https://link"));

        Optional<Subscription> actualOptionalSubscription = subscriptionRepository.findById(3L);

        assertThat(actualOptionalSubscription).isEmpty();
    }

    @Test
    void should_findAllByUserId() {
        subscriptionRepository.save(new Subscription(1L, 2L, "https://link"));
        subscriptionRepository.save(new Subscription(2L, 2L, "https://link"));
        subscriptionRepository.save(new Subscription(3L, 4L, "https://link"));

        var actualList = subscriptionRepository.findAllByUserId(2L);

        assertThat(actualList).hasSize(2)
            .containsExactlyInAnyOrderElementsOf(List.of(
                new Subscription(1L, 2L, "https://link"),
                new Subscription(2L, 2L, "https://link")
            ));
    }

    @Test
    void should_returnEmptyList_when_noSubscribesWithSuchUserId() {
        subscriptionRepository.save(new Subscription(1L, 2L, "https://link"));
        subscriptionRepository.save(new Subscription(2L, 2L, "https://link"));
        subscriptionRepository.save(new Subscription(3L, 4L, "https://link"));

        var actualList = subscriptionRepository.findAllByUserId(5L);

        assertThat(actualList).isEmpty();
    }

    @Test
    void should_deleteSubscriptionById() {
        subscriptionRepository.save(new Subscription(1L, 2L, "https://link"));

        subscriptionRepository.deleteById(1L);
        Optional<Subscription> actualOptionalSubscription = subscriptionRepository.findById(1L);

        assertThat(actualOptionalSubscription).isEmpty();
    }

    @Test
    void should_doNotThrow_when_deletingByIdNonExistenceSubscription() {
        assertThatCode(() -> subscriptionRepository.deleteById(1L)).doesNotThrowAnyException();
    }

    @Test
    void should_setNewId_when_subscriptionIdIsZero() {
        Subscription subscription = new Subscription(0L, 1L, "https://link");

        subscriptionRepository.save(subscription);
        Subscription actualSubscription = subscriptionRepository.findAllByUserId(1L).getFirst();

        assertThat(actualSubscription.getId()).isNotEqualTo(0);
        assertThat(actualSubscription).isEqualTo(subscription);
    }

}
