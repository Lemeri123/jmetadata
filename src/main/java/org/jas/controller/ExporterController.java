/*
   Copyright 2024 Jose Morales contact@josdem.io

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.jas.controller;

import org.asmatron.messengine.annotations.RequestMethod;
import org.jas.action.ActionResult;
import org.jas.action.Actions;
import org.jas.exception.MetadataException;
import org.jas.helper.ExporterHelper;
import org.jas.model.ExportPackage;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class ExporterController {

    @Autowired
    private ExporterHelper exporterHelper;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMethod(Actions.EXPORT_METADATA)
    public ActionResult sendMetadata(ExportPackage exportPackage) throws CannotReadException, TagException, ReadOnlyFileException, MetadataException {
        try {
            return exporterHelper.export(exportPackage);
        } catch (IOException ioe) {
            log.error(ioe.getMessage(), ioe);
            return ActionResult.Error;
        }
    }

}
