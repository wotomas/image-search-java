package info.kimjihyok.maven.unit;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jkimab on 2016. 3. 27..
 */
public final class CustomSearch {
    private static String API_KEY;
    private static String SEARCH_ENGINE_KEY;
    private static String GOOGLE_URL;
    private static final String IMAGE = "image";
    private static final String ITEM = "items";
    private static final String SAFE_IMAGE_TYPE = "jpg%2C+png%2C+bmp";
    private static HashMap<String, ArrayList<String>> mURLmap;


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
        mURLmap = new HashMap<String, ArrayList<String>>();
    }

    public static void initialize(String api_key, String search_engine_key, String google_url) {
        API_KEY = api_key;
        SEARCH_ENGINE_KEY = search_engine_key;
        GOOGLE_URL = google_url;
        mURLmap = new HashMap<String, ArrayList<String>>();
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
        ArrayList<String> list = mURLmap.get(search_key);
        if(list == null) {
            mURLmap.put(search_key, new ArrayList<String>());
            list = mURLmap.get(search_key);
        }


        String json = HttpRequest.get(GOOGLE_URL
                + "v1?"
                + "q=" + search_key
                + "&fileType=" + SAFE_IMAGE_TYPE
                + "&cx=" + SEARCH_ENGINE_KEY
                + "&searchType=" + IMAGE
                + "&fields=" + ITEM
                + "&start=1"
                + "&key=" + API_KEY).body();

        Gson gson = new Gson();
        GoogleResult result = gson.fromJson(json, GoogleResult.class);

        boolean addable = true;
        for(ImageItem item : result.getItems()) {
            //check for each urls saved in the hashmap
            for(String url: list) {
                if(url.equals(item.getLink())) {
                    addable = false;
                }
            }
            if(addable) {
                list.add(item.getLink());
            }

            addable = true;
        }

        return list;
    }

    public static ArrayList<String> loadMore(String search_key) {
        ArrayList<String> list = mURLmap.get(search_key);
        int size = list.size();

        String json = HttpRequest.get(GOOGLE_URL
                + "v1?"
                + "q=" + search_key
                + "&fileType=" + SAFE_IMAGE_TYPE
                + "&cx=" + SEARCH_ENGINE_KEY
                + "&searchType=" + IMAGE
                + "&fields=" + ITEM
                + "&start=" + Integer.toString(size)
                + "&key=" + API_KEY).body();

        Gson gson = new Gson();
        GoogleResult result = gson.fromJson(json, GoogleResult.class);

        boolean addable = true;
        for(ImageItem item : result.getItems()) {
            //check for each urls saved in the hashmap
            for(String url: list) {
                if(url.equals(item.getLink())) {
                    addable = false;
                }
            }
            if(addable) {
                list.add(item.getLink());
            }

            addable = true;
        }

        return list;

    }




}
