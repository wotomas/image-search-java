package info.kimjihyok.maven.unit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Created by jkimab on 2016. 4. 3..
 */
public interface GoogleAPI {
    // GET https://www.googleapis.com/customsearch/
    // /v1?q={search_key}&fileType={SAFE_IMAGE_TYPE}&cx={SEARCH_ENGINE_KEY}&searchType={IMAGE}&fields={ITEM}&start={count}&key={API_KEY}

    @GET("/customsearch/v1")
    Call<GoogleResult> imageList (
            @QueryMap Map<String, String> query);

}
