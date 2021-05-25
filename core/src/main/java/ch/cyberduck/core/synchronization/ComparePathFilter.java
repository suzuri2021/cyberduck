package ch.cyberduck.core.synchronization;

/*
 * Copyright (c) 2002-2014 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.Local;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.ProgressListener;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.AttributesFinder;
import ch.cyberduck.core.features.Find;
import ch.cyberduck.core.transfer.TransferItem;

import java.util.Map;

public interface ComparePathFilter {
    Comparison compare(Path file, Local local, ProgressListener listener) throws BackgroundException;

    default ComparePathFilter withFinder(Find finder) {
        return this;
    }

    default ComparePathFilter withAttributes(AttributesFinder attribute) {
        return this;
    }

    default ComparePathFilter withCache(Map<TransferItem, Comparison> cache) {
        return this;
    }
}
