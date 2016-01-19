package com.example.shiozaki.buildinfo;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Logに表示
        Log.d("BOARD", Build.BOARD);
        Log.d("BOOTLOADER", Build.BOOTLOADER);
        Log.d("CPU_ABI", Build.CPU_ABI);
        Log.d("CPU_ABI2", Build.CPU_ABI2);
        Log.d("DEVICE", Build.DEVICE);
        Log.d("DISPLAY", Build.DISPLAY);
        Log.d("FINGERPRINT", Build.FINGERPRINT);
        Log.d("HARDWARE", Build.HARDWARE);
        Log.d("HOST", Build.HOST);
        Log.d("MANUFACTURER", Build.MANUFACTURER);
        Log.d("MODEL", Build.MODEL);
        Log.d("PRODUCT", Build.PRODUCT);
        Log.d("RADIO", Build.RADIO);
        Log.d("TAGS", Build.TAGS);
        Log.d("TIME", String.valueOf(Build.TIME));
        Log.d("TYPE", Build.TYPE);
        Log.d("UNKNOWN", Build.UNKNOWN);
        Log.d("VERSION.CODENAME", Build.VERSION.CODENAME);
        Log.d("VERSION.INCREMENTAL", Build.VERSION.INCREMENTAL);
        Log.d("Build.VERSION.RELEASE", Build.VERSION.RELEASE);
        Log.d("Build.VERSION.SDK", Build.VERSION.SDK);
        Log.d("Build.VERSION.SDK_INT", String.valueOf(Build.VERSION.SDK_INT));

        //テキストビューに表示
        TextView textView = (TextView)findViewById(R.id.textview);

        String build = "BOARD:" + Build.BOARD + "\n";
        build += "BOOTLOADER:" + Build.BOOTLOADER + "\n";
        build += "CPU_ABI:" + Build.CPU_ABI + "\n";
        build += "CPU_ABI2:" + Build.CPU_ABI2 + "\n";
        build += "DEVICE:" + Build.DEVICE + "\n";
        build += "DISPLAY:" + Build.DISPLAY + "\n";
        build += "FINGERPRINT:" + Build.FINGERPRINT + "\n";
        build += "HARDWARE:" + Build.HARDWARE + "\n";
        build += "HOST:" + Build.HOST + "\n";
        build += "MANUFACTURER:" + Build.MANUFACTURER + "\n";
        build += "MODEL:" + Build.MODEL + "\n";
        build += "PRODUCT:" + Build.PRODUCT + "\n";
        build += "RADIO:" + Build.RADIO + "\n";
        build += "TAGS:" + Build.TAGS + "\n";
        build += "TIME:" + Build.TIME + "\n";
        build += "TYPE:" + Build.TYPE + "\n";
        build += "CODENAME:" + Build.VERSION.CODENAME + "\n";
        build += "INCREMENTAL:" + Build.VERSION.INCREMENTAL + "\n";
        build += "RELEASE:" + Build.VERSION.RELEASE + "\n";
        build += "SDK:" + Build.VERSION.SDK + "\n";
        build += "SDK_INT:" + Build.VERSION.SDK_INT + "\n";

        textView.setText(build);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
