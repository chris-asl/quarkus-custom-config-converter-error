package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.apache.commons.net.util.SubnetUtils;
import org.junit.jupiter.api.Test;

@QuarkusTest
class CustomConverterIT {
    @Inject
    GreetingConfig config;

    @Test
    void shouldProvideConfigurationParams() {
        final var subnetUtils = new SubnetUtils("192.168.1.0/24");
        final var expectedCidr = subnetUtils.getInfo();

        final var cidr = config.cidr();
        System.out.println(String.format("CIDR is \"%s\"", cidr.getCidrSignature()));

        assert(cidr.getCidrSignature()).equals(expectedCidr.getCidrSignature());
    }
}
