/*
 *   Copyright 2010, Maarten Billemont
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.lyndir.lhunath.deblock.service;

import com.google.inject.AbstractModule;
import com.lyndir.lhunath.deblock.service.impl.PlayerServiceImpl;
import com.lyndir.lhunath.deblock.service.impl.ScoreServiceImpl;


/**
 * <h2>{@link DeblockServicesModule}<br>
 * <sub>Guice module that defines the service bindings.</sub></h2>
 * 
 * <p>
 * <i>Jan 16, 2010</i>
 * </p>
 * 
 * @author lhunath
 */
public class DeblockServicesModule extends AbstractModule {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void configure() {

        bind( PlayerService.class ).to( PlayerServiceImpl.class );
        bind( ScoreService.class ).to( ScoreServiceImpl.class );
    }
}
