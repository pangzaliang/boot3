package org.zero.boot3.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(Integer id){
        System.out.println("getUserById(" + id +")......");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "giao";
    }
}
