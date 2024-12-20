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

package org.jas.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class MusicBrainzTrack {
    private String album;
    private String trackNumber;
    private String totalTrackNumber;
    private String cdNumber;
    private String totalCds;

    public MusicBrainzTrack() {
        album = StringUtils.EMPTY;
        trackNumber = "0";
    }
}
