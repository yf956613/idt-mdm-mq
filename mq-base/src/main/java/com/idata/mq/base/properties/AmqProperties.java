package com.idata.mq.base.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AmqProperties {

    @Value("${mq.host}")
    private String host;

    @Value("${mq.port}")
    private Integer port;

    @Value("${mq.username}")
    private String username;

    @Value("${mq.password}")
    private String password;

    @Value("${mq.virtualHost}")
    private String virtualHost;

    @Value("${mq.checkHeartbeat}")
    private boolean checkHeartbeat;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVirtualHost() {
        return virtualHost;
    }

    public void setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
    }

    public boolean isCheckHeartbeat() {
        return checkHeartbeat;
    }

    public void setCheckHeartbeat(boolean checkHeartbeat) {
        this.checkHeartbeat = checkHeartbeat;
    }

    @Override
    public String toString() {
        return "username:" + username + ";password:" + password + ";host:" + host + ";port:" + port + ";virtualHost:"
                + virtualHost + ";checkHeartbeat:" + checkHeartbeat;
    }
}
