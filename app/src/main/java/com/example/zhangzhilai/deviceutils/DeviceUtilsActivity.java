package com.example.zhangzhilai.deviceutils;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DeviceUtilsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_utils);
        TextView deviceInfoTextView = (TextView)findViewById(R.id.device_info_textview);
        TextView screenInfoTextView = (TextView)findViewById(R.id.screen_info_textview);

        deviceInfoTextView.setText("SystemVersion" + DeviceUtils.getSystemVersion() + '\n'
                + "LocalMacAddress" + DeviceUtils.getLocalMacAddress(this) + '\n'
                + "VersionName" + DeviceUtils.getVersionName(this)  + '\n'
                + "VersionCode" + DeviceUtils.getVersionCode(this) + '\n'
                + "PackageName" + DeviceUtils.getPackageName(this));

        screenInfoTextView.setText("ScreenWidth" + DeviceUtils.getScreenWidth(this) + '\n'
                + "ScreenHeight" + DeviceUtils.getScreenHeight(this) + '\n'
                + "Density" + DeviceUtils.getDensity(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.device_utils, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
