package edu.java.data.repositories;

import edu.java.data.models.Link;
import java.util.Optional;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RedisRepositoryAspect {
    @Around(
        "execution(java.util.Optional<edu.java.data.models.Link> "
            + "edu.java.data.repositories.LinkRepository.findByUrl(String))"
    )
    public Optional<Link> executeFindByUrlWithEscapedColon(ProceedingJoinPoint joinPoint) throws Throwable {
        String originalUrl = (String) joinPoint.getArgs()[0];
        String urlWithEscapedColon = Link.escapeColon(originalUrl);
        return (Optional<Link>) joinPoint.proceed(new Object[] {urlWithEscapedColon});
    }
}
