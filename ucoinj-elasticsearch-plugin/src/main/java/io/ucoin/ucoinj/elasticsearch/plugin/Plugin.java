package io.ucoin.ucoinj.elasticsearch.plugin;

/*
 * #%L
 * ucoinj-elasticsearch-plugin
 * %%
 * Copyright (C) 2014 - 2016 EIS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.google.common.collect.Lists;
import io.ucoin.ucoinj.elasticsearch.action.RestModule;
import io.ucoin.ucoinj.elasticsearch.security.SecurityModule;
import org.elasticsearch.common.inject.Module;

import java.util.Collection;

public class Plugin extends org.elasticsearch.plugins.Plugin {

    @Override
    public String name() {
        return "ucoinj-elasticsearch";
    }

    @Override
    public String description() {
        return "uCoinj ElasticSearch Plugin";
    }

    @Override
    public Collection<Module> nodeModules() {
        Collection<Module> modules = Lists.newArrayList();
        modules.add(new SecurityModule());
        modules.add(new RestModule());
        return modules;
    }
}