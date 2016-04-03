package info.kimjihyok.maven.unit;

import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jkimab on 2016. 3. 27..
 */
public final class CustomSearch {
    private static final String IMAGE = "image";
    private static final String ITEM = "items";
    private static final String SAFE_IMAGE_TYPE = "jpg%2C+png%2C+bmp";
    private static String API_KEY;
    private static String SEARCH_ENGINE_KEY;
    private static final String GOOGLE_API_URL = "https://www.googleapis.com";
    private static HashMap<String, ArrayList<String>> mURLmap;
    private static GoogleAPI service;


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
        mURLmap = new HashMap<String, ArrayList<String>>();

        // Create simple REST adapter which points to the Google API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GOOGLE_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(GoogleAPI.class);
    }

    public static void initialize(String api_key, String search_engine_key, String URL) {
        API_KEY = api_key;
        SEARCH_ENGINE_KEY = search_engine_key;
        mURLmap = new HashMap<String, ArrayList<String>>();

        // Create simple REST adapter which points to the Google API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(GoogleAPI.class);
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
    public static ArrayList<String> image(String search_key) throws IOException {
        ArrayList<String> list = mURLmap.get(search_key);
        if(list == null) {
            mURLmap.put(search_key, new ArrayList<String>());
            list = mURLmap.get(search_key);
        }
        // q={search_key}&fileType={SAFE_IMAGE_TYPE}&cx={SEARCH_ENGINE_KEY}&searchType={IMAGE}&fields={ITEM}&start={count}&key={API_KEY}
        Map<String, String> inputQuery = new HashMap<String, String>();
        inputQuery.put("q", search_key);
        inputQuery.put("fileType", SAFE_IMAGE_TYPE);
        inputQuery.put("cx", SEARCH_ENGINE_KEY);
        inputQuery.put("searchType", IMAGE);
        inputQuery.put("fields", ITEM);
        inputQuery.put("start", String.valueOf(list.size() + 1));
        inputQuery.put("key", API_KEY);

        Call<GoogleResult> result = service.imageList(inputQuery);
        //System.out.println("Show Result" + result.execute().raw());
        GoogleResult newResults = result.execute().body();


        for(GoogleResult.ImageItem newResult : newResults.getItems()) {
            boolean add = true;
            for(String oldURL : list) {
                if(newResult.getLink().equals(oldURL)) {
                    add = false;
                    break;
                }
            }
            if(add) {
                list.add(newResult.getLink());
            }
        }

        return list;
    }


}
