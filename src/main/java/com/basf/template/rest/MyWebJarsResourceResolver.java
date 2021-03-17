package com.basf.template.rest;

import org.springframework.web.servlet.resource.WebJarsResourceResolver;

public class MyWebJarsResourceResolver extends WebJarsResourceResolver {

    public String findWebJarResourcePath(String path) {
        return super.findWebJarResourcePath(path);
    }
}
