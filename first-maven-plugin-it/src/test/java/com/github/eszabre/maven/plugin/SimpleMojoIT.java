/*
 * Copyright 2015 Szabolcs Balazs Beres.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.eszabre.maven.plugin;

import org.apache.maven.it.Verifier;
import org.apache.maven.it.util.ResourceExtractor;
import org.junit.Test;

import java.io.File;

public class SimpleMojoIT {

    @Test
    public void testMojo() throws Exception {
        File dir = ResourceExtractor.simpleExtractResources(getClass(), "/simple-mojo");
        Verifier verifier = new Verifier(dir.getAbsolutePath());

        verifier.executeGoal("package");
        verifier.verifyTextInLog("SimpleMojo.execute");

    }
}
