package fragment;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahmadrosid.lib.drawroutemap.DrawMarker;
import com.arsy.maps_library.MapRadar;
import com.example.wolfsoft3.matrial_design.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by wolfsoft3 on 5/12/18.
 */

public class Fragment1 extends Fragment implements OnMapReadyCallback {

    private double radius = 1000;
    Point displaySize = new Point();
    private LatLng origin, destination, three, four, five, six, seven;
    private static final String KEY_CAMERA_POSITION = "camera_position";
    private static final String KEY_LOCATION = "location";
    private GoogleMap mMap;
    MapRadar mapRadar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewpager_route, container, false);

//        //map code start
        SupportMapFragment mapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);




        origin = new LatLng(28.639747, 77.348109);
        destination = new LatLng(28.636872, 77.650158);
        three = new LatLng(28.504957, 77.523136);
        four = new LatLng(28.440550, 77.422742);
        five = new LatLng(28.798910, 77.260656);
        six = new LatLng(28.702904, 77.548477);
        seven = new LatLng(28.345200, 77.660785);


        return view;

    }



    //map code

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        DrawMarker.getInstance(getActivity()).draw(mMap, origin, R.drawable.bluepoint1, "My Location");
        DrawMarker.getInstance(getActivity()).draw(mMap, destination, R.drawable.bluepoint1, "230");
        DrawMarker.getInstance(getActivity()).draw(mMap, three, R.drawable.bluepoint1, "2,124");
        DrawMarker.getInstance(getActivity()).draw(mMap, four, R.drawable.bluepoint1, "590");
        DrawMarker.getInstance(getActivity()).draw(mMap, five, R.drawable.bluepoint1, "1,591");
        DrawMarker.getInstance(getActivity()).draw(mMap, six, R.drawable.bluepoint1, "1,591");
        DrawMarker.getInstance(getActivity()).draw(mMap, seven, R.drawable.bluepoint1, "1,951");

        //it binds the camera postition to the above two points
        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(origin)
                .include(destination)
                .include(three)
                .include(four)
                .include(five)
                .include(six).build();
        Point displaySize = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(displaySize);
        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, displaySize.x, 260, 30));

        //for automatic zoomin when you open the activity....
        //the vaalue can be changed according to your use.....
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15.3f));

        LatLng latLng = new LatLng(28.368937,77.230514);

        double lat = 28.368937;
        double lng = 77.230514;

      /*  mapRipple = new MapRipple(googleMap, latLng, context);

        mapRipple.withNumberOfRipples(3);
        mapRipple.withFillColor(Color.parseColor("#FFA3D2E4"));
        mapRipple.withStrokeColor(Color.BLACK);
        mapRipple.withStrokewidth(0);      // 10dp
        mapRipple.withDistance(2000);      // 2000 metres radius
        mapRipple.withRippleDuration(12000);    //12000ms
        mapRipple.withTransparency(0.5f);
        mapRipple.startRippleMapAnimation();*/


        mapRadar = new MapRadar(googleMap, latLng, getContext());
        mapRadar.withClockWiseAnticlockwise(true);
        mapRadar.withDistance(2000);
        mapRadar.withClockwiseAnticlockwiseDuration(2);
        mapRadar.withOuterCircleFillColor(Color.parseColor("#12000000"));
        mapRadar.withOuterCircleStrokeColor(Color.parseColor("#fccd29"));
        mapRadar.withRadarColors(Color.parseColor("#00000000"), Color.parseColor("#ff000000"));  //starts from transparent to fuly black
        mapRadar.withRadarColors(Color.parseColor("#00fccd29"), Color.parseColor("#fffccd29"));  //starts from transparent to fuly black
        mapRadar.withOuterCircleStrokewidth(7);
        mapRadar.withRadarSpeed(5);
        mapRadar.withOuterCircleTransparency(0.5f);
        mapRadar.withRadarTransparency(0.5f);



        googleMap.addCircle(new CircleOptions()
                .center(new LatLng(lat,lng))
                .radius(radius)
                .strokeColor(Color.RED)
                .strokeWidth(0f)
                .fillColor(Color.parseColor("#19bd0909")));


        // create marker
        MarkerOptions marker = new MarkerOptions().position(latLng).title("Your are here");


            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.redpoint));

// adding marker
        googleMap.addMarker(marker);

        //    marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));

        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                latLng).zoom(10).build();

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));



    }

}
