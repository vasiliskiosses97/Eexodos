package com.domain.eexodos;

import android.Manifest;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity  extends FragmentActivity
        implements OnMapReadyCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "Map is Ready", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onMapReady: map is ready");
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);



        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        Toast.makeText(this, "Map is Ready", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onMapReady: map is ready");

        if(MainActivity.button==true) {
            // and move the map's camera to the same location.
            LatLng Coffee_Is_Amp = new LatLng(40.652290, 22.922646);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Is_Amp)
                    .title("Coffee Island in Ampelokipoi"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Is_Amp, 12));

            LatLng Coffee_Island_Me = new LatLng(40.669313, 22.909499);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Me)
                    .title("Coffee Island in Megalou Alexandrou 18"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Me,12));

            LatLng Coffee_Island_And = new LatLng(40.666990, 22.894713);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_And)
                    .title("Coffee Island in Andrea Papandreou 14"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_And,12));

            LatLng Coffee_Island_Meg = new LatLng(40.669715, 22.909611);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Meg)
                    .title("Coffee Island in Megalou Alexandrou 78"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Meg,12));

            LatLng Coffee_Island_Mai = new LatLng(40.675054, 22.906263);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Mai)
                    .title("Coffee Island in Maiandrou 84"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Mai,12));

            LatLng Coffee_Island_Str = new LatLng(40.672025, 22.930298);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Str)
                    .title("Coffee Island in Stratiotou Makrigianni 38"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Str,12));

            LatLng Coffee_Island_Kar = new LatLng(40.666329, 22.928153);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Kar)
                    .title("Coffee Island in Karaoli & Dimitriou Kons/idi 8"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Kar,12));

            LatLng Coffee_Island_AnPap = new LatLng(40.651119, 22.945073);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_AnPap)
                    .title("Coffee Island in Andrea Papandreou 98"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_AnPap,12));

            LatLng Coffee_Island_Xal = new LatLng(40.652278, 22.922573);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Xal)
                    .title("Coffee Island in Xalkidi 61"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Xal,12));

            LatLng Coffee_Island_Nik = new LatLng(40.672316, 22.930215);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Nik)
                    .title("Coffee Island in Nikomideias 15"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Nik,12));

            LatLng Coffee_Island_Ag = new LatLng(40.640084, 22.944760);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Ag)
                    .title("Coffee Island in Agiou Dimitriou 8"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Ag,12));

            LatLng Coffee_Island_Lag = new LatLng(40.642477, 22.935040);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Lag)
                    .title("Coffee Island in Lagkada & Vakxou"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Lag,12));

            LatLng Coffee_Island_Ept = new LatLng(40.654377, 22.952140);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Ept)
                    .title("Coffee Island in Eptapirgiou 1"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Ept,12));

            LatLng Coffee_Island_Agn = new LatLng(40.658641, 22.942571);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Agn)
                    .title("Coffee Island in Agnostou Stratiotou 52"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Agn,12));

            LatLng Coffee_Island_Egn = new LatLng(40.637668, 22.940614);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Egn)
                    .title("Coffee Island in Egnatia 48"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Egn,12));

            LatLng Coffee_Island_Pol = new LatLng(40.636356, 22.937452);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Pol)
                    .title("Coffee Island in Politexniou 53"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Pol,12));

            LatLng Coffee_Island_Erm = new LatLng(40.635590, 22.941416);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Erm)
                    .title("Coffee Island in Ermou 20"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Erm,12));

            LatLng Coffee_Island_AgD = new LatLng(40.635574, 22.953596);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_AgD)
                    .title("Coffee Island in Agiou Dimitriou 158"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_AgD,12));

            LatLng Coffee_Island_Egna = new LatLng(40.634221, 22.947655);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Egna)
                    .title("Coffee Island in Egnatia 79"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Egna,12));

            LatLng Coffee_Island_Agg = new LatLng(40.630019, 22.953234);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Agg)
                    .title("Coffee Island in Aggelaki 33"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Agg,12));

            LatLng Coffee_Island_Tsi = new LatLng(40.629237, 22.948406);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Tsi)
                    .title("Coffee Island in Tsimiski 114"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Tsi,12));

            LatLng Coffee_Island_Egnat = new LatLng(40.632544, 22.951264);
            googleMap.addMarker(new MarkerOptions().position(Coffee_Island_Egnat)
                    .title("Coffee Island in Egnatia 117"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coffee_Island_Egnat,12));

            LatLng Mikel_Eg = new LatLng(40.632643, 22.950135);
            googleMap.addMarker(new MarkerOptions().position(Mikel_Eg)
                    .title("Coffee Island in Egnatia 134"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_Eg,12));

            LatLng Mikel_AgS = new LatLng(40.633786, 22.946512);
            googleMap.addMarker(new MarkerOptions().position(Mikel_AgS)
                    .title("Mikel in Agias Sofias 40"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_AgS,12));

            LatLng Mikel_Tsim = new LatLng(40.628727, 22.949389);
            googleMap.addMarker(new MarkerOptions().position(Mikel_Tsim)
                    .title("Mikel in Tsimiski 119"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_Tsim,12));

            LatLng Mikel_LeN = new LatLng(40.628252, 22.946389);
            googleMap.addMarker(new MarkerOptions().position(Mikel_LeN)
                    .title("Mikel in Leoforos Nikis 67"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_LeN,12));

            LatLng Mikel_AgD = new LatLng(40.639849, 22.945176);
            googleMap.addMarker(new MarkerOptions().position(Mikel_AgD)
                    .title("Mikel in Agiou Dimitriou 63"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_AgD,12));

            LatLng Mikel_TsVen = new LatLng(40.634740, 22.939742);
            googleMap.addMarker(new MarkerOptions().position(Mikel_TsVen)
                    .title("Mikel in Tsimiski & Venizelou"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_TsVen,12));

            LatLng Mikel_KonKa = new LatLng(40.6010327, 22.964124);
            googleMap.addMarker(new MarkerOptions().position(Mikel_KonKa)
                    .title("Mikel in Konstantinou Karamanli 154"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_KonKa,12));

            LatLng Mikel_Pap = new LatLng(40.612500, 22.964174);
            googleMap.addMarker(new MarkerOptions().position(Mikel_Pap)
                    .title("Mikel in Papanastasiou 51"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_Pap,12));

            LatLng Mikel_AgSt = new LatLng(40.659028, 22.943218);
            googleMap.addMarker(new MarkerOptions().position(Mikel_AgSt)
                    .title("Mikel in Agnostou Stratiotou 21"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mikel_AgSt,12));


        } else if(MainActivity.button==false){

            LatLng Todaylicious_Eg = new LatLng(40.632122, 22.952216);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Eg)
                    .title("Todaylicious in Egnatia 121"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Eg,12));

            LatLng Todaylicious_Ts = new LatLng(40.629231, 22.948276);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Ts)
                    .title("Todaylicious in Tsimiski 112"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Ts,12));

            LatLng Todaylicious_Po = new LatLng(40.635666, 22.937770);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Po)
                    .title("Todayliciousin Politexniou 57"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Po,12));

            LatLng Todaylicious_Ag = new LatLng(40.634894, 22.947625);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Ag)
                    .title("Todaylicious in Agias Sofias 52"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Ag,12));

            LatLng Todaylicious_VaG = new LatLng(40.618965, 22.954511);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_VaG)
                    .title("Todaylicious in Vasileos Georgiou 31"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_VaG,12));

            LatLng Todaylicious_Del = new LatLng(40.616798, 22.958372);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Del)
                    .title("Todaylicious in Delfon 12"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Del,12));

            LatLng Todaylicious_Kle = new LatLng(40.613520, 22.968165);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Kle)
                    .title("Todaylicious in Kleanthous 50"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Kle,12));

            LatLng Todaylicious_Gri = new LatLng(40.615377, 22.975847);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Gri)
                    .title("Todaylicious in Grigoriou Lamplraki 113"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Gri,12));

            LatLng Todaylicious_Amm = new LatLng(40.607734, 22.976405);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Amm)
                    .title("Todaylicious in Ammochostou 12"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Amm,12));

            LatLng Todaylicious_Vas = new LatLng(40.606797, 22.953288);
            googleMap.addMarker(new MarkerOptions().position(Todaylicious_Vas)
                    .title("Todaylicious in Vasilisis Olgas 111"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Todaylicious_Vas,12));

            LatLng Psilika_Vos = new LatLng(40.610012, 22.974568);
            googleMap.addMarker(new MarkerOptions().position(Psilika_Vos)
                    .title("Psilika in Vosporou 40"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Psilika_Vos,12));

            LatLng Psilika_Pap = new LatLng(40.613258, 22.963829);
            googleMap.addMarker(new MarkerOptions().position(Psilika_Pap)
                    .title("Psilika in Papanastasiou 45"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Psilika_Pap,12));
        }

    }
}