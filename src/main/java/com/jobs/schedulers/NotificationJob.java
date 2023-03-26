package com.jobs.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationJob {
    @Scheduled(cron = "${nine.am}")
    public void NotifyAt9am(){
        System.out.println("Its 9 Am");
    }


    @Scheduled(cron = "${nine.pm}")
    public void NotifyAt9pm(){
        System.out.println("Its 9 pm");
    }

    @Scheduled(cron = "${ten.am}")
    public void NotifyAt10am(){
        System.out.println("Its 10 am");
    }

    @Scheduled(cron = "${ten.pm}")
    public void NotifyAt10pm(){
        System.out.println("Its 10 pm");
    }

    @Scheduled(cron = "${every.5min}")
    public void NotifyEvery5min(){
        System.out.println("alert after 5 min");
    }



}
