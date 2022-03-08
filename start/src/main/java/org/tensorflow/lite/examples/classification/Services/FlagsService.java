package org.tensorflow.lite.examples.classification.Services;

import org.tensorflow.lite.examples.classification.Models.CountryInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FlagsService {
    @GET("info/{countryCode}.json")
    Call<CountryInfo> getCountryInfo(@Path("countryCode") String countryCode);
}
