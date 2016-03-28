package info.kimjihyok.maven.unit;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by jkimab on 2016. 3. 27..
 */
public final class CustomSearch {
    private static String API_KEY;
    private static String SEARCH_ENGINE_KEY;
    private static String GOOGLE_URL;
    private static final String IMAGE = "image";
    private static final String ITEM = "items";

    public static String getApiKey() {
        return API_KEY;
    }

    public static void setApiKey(String apiKey) {
        API_KEY = apiKey;
    }

    public static String getSearchEngineKey() {
        return SEARCH_ENGINE_KEY;
    }

    public static void setSearchEngineKey(String searchEngineKey) {
        SEARCH_ENGINE_KEY = searchEngineKey;
    }

    /**
     * Initialize Custom Search Library to start searching on the following engine with the api key
     *
     * @param api_key
     *        String value for the Google Custom Search API Key
     *
     * @param search_engine_key
     *
     */
    public static void initialize(String api_key, String search_engine_key) {
        API_KEY = api_key;
        SEARCH_ENGINE_KEY = search_engine_key;
        GOOGLE_URL = "https://www.googleapis.com/customsearch/";
    }

    public static void initialize(String api_key, String search_engine_key, String google_url) {
        API_KEY = api_key;
        SEARCH_ENGINE_KEY = search_engine_key;
        GOOGLE_URL = google_url;
    }



    /**
     * Search the String to the google image String and returns Google Image Results in URL
     *
     * @param search_key
     *        String for searching on google image
     *
     * @return ArrayList
     *         Returns ArrayList of URLs, and empty list if result in invalid
     */
    public static ArrayList<String> image(String search_key) {
        String json = HttpRequest.get(GOOGLE_URL
                + "v1?"
                + "q=" + search_key
                + "&cx=" + SEARCH_ENGINE_KEY
                + "&searchType=" + IMAGE
                + "&fields=" + ITEM
                + "&key=" + API_KEY).body();


        Gson gson = new Gson();
        GoogleResult result = gson.fromJson(json, GoogleResult.class);
        ArrayList<String> urls = new ArrayList<String>();
        for(ImageItem item : result.getItems()) {
            urls.add(item.getLink());
        }
        return urls;
    }
}
