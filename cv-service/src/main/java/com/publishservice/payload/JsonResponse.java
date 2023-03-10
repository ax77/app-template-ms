/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

package com.publishservice.payload;

public class JsonResponse {

    private String status;
    private Object result;

    public JsonResponse(String status, Object result) {
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}