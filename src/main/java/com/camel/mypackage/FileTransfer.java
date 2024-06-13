package com.camel.mypackage;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class FileTransfer extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:///C://Users//Downloads//camel")

                .log("${headers}")
             //   .log("${body}")
                .to("file:///C://Users//Downloads//camel//dataprocessed");


        ClassA a = new ClassA();
        ClassA.color c = ClassA.color.blue;

        Collections.synchronizedList(Arrays.asList("s","s","ed","dede","dede"));
        List al =  Arrays.asList("s","s","ed","dede","dede");
        al.stream().filter((data)->data.equals("ed")).forEach(x->System.out.println(x));

    }
}
