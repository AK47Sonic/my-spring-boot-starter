package com.sonic.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HelloProperties
 *
 * @author Sonic
 * @since 2019/5/26
 */
@ConfigurationProperties(prefix = "sonic.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

}
