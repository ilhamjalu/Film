package id.sch.smktelkom_mlg.privateassignment.xirpl211.movies.model;

import java.util.List;


public class SourcesResponse {
    //    "status": "ok",
    //    "sources": [{
    //            "id": "abc-news-au",
    //            "name": "ABC News (AU)",
    //            "description": "Australia's most trusted source of local, national and world news. Comprehensive, independent, in-depth analysis, the latest business, sport, weather and more.",
    //            "url": "http://www.abc.net.au/news",
    //            "category": "general",
    //            "language": "en",
    //            "country": "au",
    //            "urlsToLogos": {
    //                "small": "",
    //                "medium": "",
    //                "large": ""
    //            },
    //            "sortBysAvailable": ["top"]
    //            },]

    //    public String status;
//    public List<Source> sources;
    public String page;
    public List<Source> results;

}
