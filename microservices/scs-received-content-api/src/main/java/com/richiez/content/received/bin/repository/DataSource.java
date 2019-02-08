package com.richiez.content.received.bin.repository;

/**
 * Created by irichiez on 5/13/17.
 */
public class DataSource {

    private String hostname;
    private int port;

    public DataSource() {
    }

    public DataSource(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                '}';
    }
}
