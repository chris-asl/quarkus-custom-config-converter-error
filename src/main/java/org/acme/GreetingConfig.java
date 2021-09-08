package org.acme;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;
import org.apache.commons.net.util.SubnetUtils.SubnetInfo;

@ConfigMapping(prefix = "greeting")
public interface GreetingConfig {
    @WithName("message")
    String message();

    @WithName("cidr")
    SubnetInfo cidr();
}