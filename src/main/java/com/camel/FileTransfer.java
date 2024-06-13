package com.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileTransfer extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:///C://Users//Downloads//camel")

                .log("${headers}")
             //   .log("${body}")
                .to("file:///C://Users//Downloads//camel//dataprocessed");


        ClassA a = new ClassA();


    }
}
