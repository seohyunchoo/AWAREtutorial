package com.example.jennachoo.awaretutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.app.Activity;
import com.aware.Aware;
import com.aware.Aware_Preferences;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.util.Log;
import android.widget.Toast;

import com.aware.Aware;
import com.aware.Aware_Preferences;
import com.aware.utils.Aware_Plugin;

import com.aware.ESM;
import com.aware.providers.ESM_Provider.*;

import java.util.Calendar;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Activate Accelerometer
        Aware.setSetting(this, Aware_Preferences.STATUS_ACCELEROMETER, true);
        //Set sampling frequency
        Aware.setSetting(this, Aware_Preferences.FREQUENCY_ACCELEROMETER, 200000);
        //Apply settings
        sendBroadcast(new Intent(Aware.ACTION_AWARE_REFRESH));
    }
}
