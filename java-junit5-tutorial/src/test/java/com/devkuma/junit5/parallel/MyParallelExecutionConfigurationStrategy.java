package com.devkuma.junit5.parallel;

import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class MyParallelExecutionConfigurationStrategy implements ParallelExecutionConfigurationStrategy {

    @Override
    public ParallelExecutionConfiguration createConfiguration(ConfigurationParameters configurationParameters) {
        return new ParallelExecutionConfiguration() {

            @Override
            public int getParallelism() {
                return 7;
            }

            @Override
            public int getMinimumRunnable() {
                return 7;
            }

            @Override
            public int getMaxPoolSize() {
                return 7;
            }

            @Override
            public int getCorePoolSize() {
                return 7;
            }

            @Override
            public int getKeepAliveSeconds() {
                return 30;
            }
        };
    }
}