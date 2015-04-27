package com.widowcrawler.analyze.module;

import com.google.inject.AbstractModule;
import com.netflix.governator.annotations.Modules;
import com.widowcrawler.core.module.DynamoDBModule;
import com.widowcrawler.core.module.ObjectMapperModule;

/**
 * @author Scott Mansfield
 */
@Modules(include = {DynamoDBModule.class, ObjectMapperModule.class})
public class WidowAnalyzeModule extends AbstractModule {
    @Override
    protected void configure() {

    }
}
