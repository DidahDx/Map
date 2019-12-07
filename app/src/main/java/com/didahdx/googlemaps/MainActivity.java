package com.didahdx.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();
    Button button;
    private static final int ERROR_DIALOG_REQUEST = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindViewIds();

        button.setOnClickListener(this);
    }

    private void FindViewIds() {
        button=findViewById(R.id.button_map);
    }

    @Override
    public void onClick(View v) {
        if (button==v && isServicesOk()){
            startActivity(new Intent(MainActivity.this,MapsActivity.class));
        }
    }

    //checking if the device has the correct services version
    public boolean isServicesOk() {
        Log.d(TAG, "checking google services version");

        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);

        if (available == ConnectionResult.SUCCESS) {
            Log.d(TAG, "service working");
            return true;
        } else if (GoogleApiAvailability.getInstance().isUserResolvableError(available)) {
            Log.d(TAG, "resolvable error");
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(this, available, ERROR_DIALOG_REQUEST);
            dialog.show();
        } else {
            Toast.makeText(this, "You can't make map request   ", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
