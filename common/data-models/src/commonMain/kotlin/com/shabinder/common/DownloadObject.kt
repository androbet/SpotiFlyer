/*
 * Copyright (c)  2021  Shabinder Singh
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.shabinder.common

import com.shabinder.common.spotify.Source
import kotlinx.serialization.Serializable

@Serializable
data class TrackDetails(
    var title:String,
    var artists:List<String>,
    var durationSec:Int,
    var albumName:String?=null,
    var year:String?=null,
    var comment:String?=null,
    var lyrics:String?=null,
    var trackUrl:String?=null,
    var albumArtPath: String,
    var albumArtURL: String,
    var source: Source,
    var downloaded: DownloadStatus = DownloadStatus.NotDownloaded,
    var progress: Int = 2,//2 for visual progress bar hint
    var outputFile: String,
    var videoID:String? = null
)

enum class DownloadStatus{
    Downloaded,
    Downloading,
    Queued,
    NotDownloaded,
    Converting,
    Failed
}