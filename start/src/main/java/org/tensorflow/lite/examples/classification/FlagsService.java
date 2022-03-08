package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.tensorflow.lite.examples.classification.Models.CountryInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FlagsService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flags_service);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.geognos.com/api/en/countries/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        org.tensorflow.lite.examples.classification.Services.FlagsService service = retrofit.create(
            org.tensorflow.lite.examples.classification.Services.FlagsService.class
        );
        Call<CountryInfo> ec = service.getCountryInfo("EC");
        ec.enqueue(new Callback<CountryInfo>() {
            @Override
            public void onResponse(Call<CountryInfo> call, Response<CountryInfo> response) {
                CountryInfo body = response.body();
            }

            @Override
            public void onFailure(Call<CountryInfo> call, Throwable t) {
                String message = t.getMessage();
            }
        });
    }
}