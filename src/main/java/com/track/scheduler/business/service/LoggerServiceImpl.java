package com.track.scheduler.business.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("LoggerService")
public class LoggerServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(LoggerServiceImpl.class);

    int secondsPassed = 0;
    @Scheduled(cron = "* * * * * *") // every midnight
    public void loggerTracking() {

//        autoLogin();

        LOG.info("This is logger tracking " + secondsPassed);
        secondsPassed++;
    }
}
