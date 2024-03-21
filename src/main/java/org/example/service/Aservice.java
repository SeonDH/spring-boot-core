package org.example.service;

public class Aservice {

    public Bservice bservice;

    public Aservice(Bservice bservice) {
        this.bservice = bservice;
    }

    public void printHashCode() {
        System.out.println("Aservice: " + this.hashCode());
        System.out.println("Bservice: " + this.bservice.hashCode());
    }
}
