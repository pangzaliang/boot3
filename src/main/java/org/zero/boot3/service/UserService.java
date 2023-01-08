package org.zero.boot3.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public String getUserById(Integer id){
        System.out.println("getUserById(" + id +")......");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            logger.error("UserService getUserById InterruptedException = ", e);
        }

        return "giao";
    }
}
