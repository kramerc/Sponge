/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.mod.plugin;

import com.google.common.base.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.plugin.PluginManager;
import org.spongepowered.api.util.annotation.NonnullByDefault;
import org.spongepowered.mod.SpongeMod;

import java.util.Collection;

@NonnullByDefault
public class SpongePluginManager implements PluginManager {

    @Override
    public Optional<PluginContainer> getPlugin(String s) {
        return Optional.fromNullable(SpongeMod.instance.getPlugin(s));
    }

    @Override
    public Logger getLogger(PluginContainer pluginContainer) {
        return LoggerFactory.getLogger(pluginContainer.getName());
    }

    @Override
    public Collection<PluginContainer> getPlugins() {
        return SpongeMod.instance.getPlugins();
    }

    @Override
    public Optional<PluginContainer> fromInstance(Object instance) {
        return Optional.fromNullable(SpongeMod.instance.getPluginContainer(instance));
    }

    @Override
    public boolean isLoaded(String s) {
        return SpongeMod.instance.getPlugin(s) != null;
    }
}
