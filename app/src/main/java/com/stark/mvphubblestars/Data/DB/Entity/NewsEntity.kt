package com.stark.mvphubblestars.Data.DB.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.stark.mvphubblestars.other.Constants

@Entity(tableName = Constants.TABLE_NAME)
data class NewsEntity(
    @PrimaryKey(autoGenerate = true)val id: Int? = null,
    @ColumnInfo(name = "news_id") val news_id: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "url") val url : String
)




//{
//    "news_id":"2019-50",
//    "name":"NASA's Hubble Finds Water Vapor on Habitable-Zone Exoplanet for the First Time",
//    "url":"https://hubblesite.org/contents/news-releases/2019/news-2019-50"
//}
//
//{
//    "name":"Hubble Captures Vivid Auroras in Jupiter's Atmosphere",

//    "news_id":"2016-24",

//    "url":"https://hubblesite.org/contents/news-releases/2016/news-2016-24",

//    "publication":"2016-06-30T10:00:00.000-04:00",

//    "mission":"hubble",

//    "abstract":"Astronomers are using NASA's Hubble Space Telescope to study auroras —
//    stunning light shows in a planet's atmosphere — on the poles of the largest planet in
//    the solar system, Jupiter. The auroras were photographed during a series of
//    Hubble Space Telescope Imaging Spectrograph far-ultraviolet-light observations taking
//    place as NASA's Juno spacecraft approaches and enters into orbit around Jupiter.
//    The aim of the program is to determine how Jupiter's auroras respond to changing
//    conditions in the solar wind, a stream of charged particles emitted from the sun.
//    Auroras are formed when charged particles in the space surrounding the planet are
//    accelerated to high energies along the planet's magnetic field. When the particles
//    hit the atmosphere near the magnetic poles, they cause it to glow like gases in a fluorescent
//    light fixture. Jupiter's magnetosphere is 20,000 times stronger than Earth's. These observations
//    will reveal how the solar system's largest and most powerful magnetosphere behaves.
//    \r\n\r\nThe full-color disk of Jupiter in this image was separately photographed at a
//    different time by Hubble's Outer Planet Atmospheres Legacy (OPAL) program, a long-term
//    Hubble project that annually captures global maps of the outer planets.",

//    "credits":"\u003ca href=\"http://www.nasa.gov/\"\u003eNASA\u003c/a\u003e,
//    \u003ca href=\"http://www.spacetelescope.org/\"\u003eESA\u003c/a\u003e,
//    and J. Nichols (University of Leicester); \r\nAcknowledgment: A. Simon
//    (\u003ca href=\"http://www.nasa.gov/\"\u003eNASA\u003c/a\u003e/GSFC) and
//    the OPAL team",

//    "thumbnail":"//imgsrc.hubblesite.org/hvi/uploads/story/thumbnail/1144/low_web.jpg",
//    "thumbnail_retina":"//imgsrc.hubblesite.org/hvi/uploads/story/thumbnail/1144/web.jpg",
//    "thumbnail_1x":"//imgsrc.hubblesite.org/hvi/uploads/story/thumbnail/1144/low_web.jpg",
//    "thumbnail_2x":"//imgsrc.hubblesite.org/hvi/uploads/story/thumbnail/1144/web.jpg",
//    "keystone_image_1x":"//imgsrc.hubblesite.org/hvi/uploads/story/display_image/1144/low_keystone.png",
//    "keystone_image_2x":"//imgsrc.hubblesite.org/hvi/uploads/story/display_image/1144/keystone.png",
//    "release_images":[3756,4459,3758,3757],"release_videos":[865,867,866,868]

//}
