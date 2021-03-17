package com.basf.template.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/")
public class RESTController {

    private MyWebJarsResourceResolver resourceResolver = new MyWebJarsResourceResolver();

    @GetMapping(path="/", produces = "text/plain")
    @ResponseBody
    public String testResourceResolver() {
        return resourceResolver.findWebJarResourcePath("swagger-ui/index.html");
    }
}
