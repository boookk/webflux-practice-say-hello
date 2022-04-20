package com.boookk.webfluxpractice;




public class SayHello {

    private String to;
    private String job;
    private String message;

    public SayHello(String name, String job) {
        this.to = name;
        this.job = job;
        this.message = "hello " + name;
    }

    public String getTo() {
        return this.to;
    }

    public String getJob() {
        return this.job;
    }

    public String getMessage() {
        return this.message;
    }
//    private String to;
//    private String message;
//
//    public SayHello(String name) {
//        this.to = name;
//        this.message = "hello " + name;
//    }
//
//    public String getTo() {
//        return this.to;
//    }
//
//    public String getMessage() {
//        return this.message;
//    }
}
