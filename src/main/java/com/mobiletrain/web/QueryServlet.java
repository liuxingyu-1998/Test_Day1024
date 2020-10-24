package com.mobiletrain.web;

import com.mobiletrain.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QueryServlet {
    AnnotationConfigApplicationContext ca = new AnnotationConfigApplicationContext(SpringConfig.class);

}
