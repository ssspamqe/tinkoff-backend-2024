package edu.java.data.redis.repositories;

import edu.java.data.redis.documents.Link;
import java.util.Optional;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RedisRepositoryAspect {
    @Around(
        "execution(java.util.Optional<edu.java.data.redis.documents.Link> "
            + "edu.java.data.redis.repositories.LinkRepository.findByUrl(String))"
    )
    public Optional<Link> executeFindByUrlWithEscapedColon(ProceedingJoinPoint joinPoint) throws Throwable {
        String originalUrl = (String) joinPoint.getArgs()[0];
        String urlWithEscapedColon = Link.escapeColon(originalUrl);
        return (Optional<Link>) joinPoint.proceed(new Object[] {urlWithEscapedColon});
    }
}
