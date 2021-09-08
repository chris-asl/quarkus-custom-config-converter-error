package org.acme;

import org.apache.commons.net.util.SubnetUtils;
import org.apache.commons.net.util.SubnetUtils.SubnetInfo;
import org.eclipse.microprofile.config.spi.Converter;

public class SubnetInfoCidrConverter implements Converter<SubnetInfo> {

    @Override
    public SubnetInfo convert(String cidrValue)
            throws IllegalArgumentException, NullPointerException {
        final var subnetUtils = new SubnetUtils(cidrValue);
        return subnetUtils.getInfo();
    }
}
