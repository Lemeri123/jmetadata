/*
   Copyright 2013 Jose Luis De la Cruz Morales joseluis.delacruz@gmail.com

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

package org.jas.service;

import java.io.IOException;
import java.net.MalformedURLException;

import org.jas.model.Metadata;
import org.jas.model.LastfmAlbum;
import org.jas.action.ActionResult;

public interface LastFMCompleteService {
	boolean canLastFMHelpToComplete(Metadata metadata);
	LastfmAlbum getLastFM(Metadata metadata) throws MalformedURLException, IOException;
	ActionResult isSomethingNew(LastfmAlbum lastfmAlbum, Metadata metadata);
}
