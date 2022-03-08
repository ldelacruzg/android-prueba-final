package org.tensorflow.lite.examples.classification;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;

import org.tensorflow.lite.examples.classification.Models.Country;
import org.tensorflow.lite.examples.classification.Models.CountryInfo;
import org.tensorflow.lite.examples.classification.Services.FlagsService;
import org.tensorflow.lite.examples.classification.databinding.ActivityMapsBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    TextView textViewNameCountry, textViewCapital, textViewCodeISO2, textViewCodeISONum,
        textViewCodeISO3, textViewCodeFIPS, textViewTelPrefix;
    ImageView imageViewFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        textViewNameCountry = findViewById(R.id.textViewNameCountry);
        textViewCapital = findViewById(R.id.textViewCapital);
        textViewCodeISO2 = findViewById(R.id.textView2CodeISO2);
        textViewCodeISONum = findViewById(R.id.textViewCodeISONum);
        textViewCodeISO3 = findViewById(R.id.textViewCodeISO3);
        textViewCodeFIPS = findViewById(R.id.textViewCodeFIPS);
        textViewTelPrefix = findViewById(R.id.textViewTelPrefix);

        imageViewFlag = findViewById(R.id.imageViewFlag);
        //getCountryInfo();
    }

    public Retrofit getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.geognos.com/api/en/countries/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public void getCountryInfo() {
        Bundle bundle = getIntent().getExtras();
        String countryCode = bundle.getString("countryCode");
        getCountryFlag(countryCode);

        FlagsService flagsService = getRetrofit().create(FlagsService.class);
        Call<CountryInfo> countryInfo = flagsService.getCountryInfo(countryCode);
        countryInfo.enqueue(new Callback<CountryInfo>() {
            @Override
            public void onResponse(Call<CountryInfo> call, Response<CountryInfo> response) {
                textViewNameCountry.setText(response.body().getResults().getName());
            }

            @Override
            public void onFailure(Call<CountryInfo> call, Throwable t) {

            }
        });
    }

    public void getCountryFlag(String countryCode) {
        Picasso.get()
                .load("http://www.geognos.com/api/en/countries/flag/"+countryCode+".png")
                .into(imageViewFlag);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        Bundle bundle = getIntent().getExtras();
        String countryCode = bundle.getString("countryCode");
        getCountryFlag(countryCode);

        FlagsService flagsService = getRetrofit().create(FlagsService.class);
        Call<CountryInfo> countryInfo = flagsService.getCountryInfo(countryCode);
        countryInfo.enqueue(new Callback<CountryInfo>() {
            @Override
            public void onResponse(Call<CountryInfo> call, Response<CountryInfo> response) {
                Country results = response.body().getResults();
                textViewNameCountry.setText(results.getName());
                textViewCapital.setText("Capital: " + results.getCapital().getName());
                textViewCodeISO2.setText("Code ISO 2: " + results.getCountryCodes().getIso2());
                textViewCodeISONum.setText("Code ISO Num: " + results.getCountryCodes().getIsoN());
                textViewCodeISO3.setText("Code ISO 3: " + results.getCountryCodes().getIso3());
                textViewCodeFIPS.setText("Code FIPS: " + results.getCountryCodes().getFips());
                textViewTelPrefix.setText("Tel Prefix:" + results.getTelPref());
                // Add a marker in Sydney and move the camera
                LatLng sydney = new LatLng(results.getGeoPt().get(0), results.getGeoPt().get(1));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
            }

            @Override
            public void onFailure(Call<CountryInfo> call, Throwable t) {

            }
        });

    }
}