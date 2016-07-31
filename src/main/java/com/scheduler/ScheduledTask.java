package com.scheduler;

import com.scheduler.domain.user.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

/**
 * Created by galih.a.pradana on 7/30/2016.
 */
@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private ProfileRepository profileRepository;

    @Scheduled(fixedRate = 5000)
    @Transactional
    public void updateProfileDesc() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
        profileRepository.findAll().stream()
                .map(p -> {
                    p.setDescription("desc " + dateFormat.format(new Date()));
                    return p;
                }).forEach(profile -> profileRepository.save(profile));
    }
}
