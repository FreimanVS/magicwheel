package com.freimanvs.magicwheel.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Qualifier("helloService")
@Scope("singleton")
public class HelloService {

    public String print() {
        return "hello";
    }
}
