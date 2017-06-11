package in.gov.ddu_gky.service;

import in.gov.ddu_gky.fragment.model.User;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by vyas on 6/11/17.
 */

public interface DduGkyService {

    @GET("users/{user}")
    Observable<User> getUser(@Path("user") String user);


}
