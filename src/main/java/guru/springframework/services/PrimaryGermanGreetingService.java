package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
// Removed and put into config/GreetingServiceConfig file
//@Service
//@Profile("de")
//@Primary
public class PrimaryGermanGreetingService implements GreetingService {

    //@Autowired
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    @Qualifier("greetingServiceImpl")
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
