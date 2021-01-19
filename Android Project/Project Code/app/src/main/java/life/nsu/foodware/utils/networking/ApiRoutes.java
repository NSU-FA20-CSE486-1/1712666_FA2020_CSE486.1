package life.nsu.foodware.utils.networking;

import life.nsu.foodware.utils.networking.requests.AuthenticationRequest;
import life.nsu.foodware.utils.networking.responses.RefreshResponse;
import life.nsu.foodware.utils.networking.requests.RegistrationRequest;
import life.nsu.foodware.utils.networking.responses.AuthenticationResponse;
import life.nsu.foodware.utils.networking.responses.RegistrationResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiRoutes {

    @POST("auth/register")
    Call<RegistrationResponse> registration(@Body RegistrationRequest request);

    @POST("auth/login")
    Call<AuthenticationResponse> authentication(@Body AuthenticationRequest request);

    @POST("auth/refresh")
    Call<RefreshResponse> refresh(@Header("Authorization") String request);

}
