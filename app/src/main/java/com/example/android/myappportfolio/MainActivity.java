package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    public static String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void launchSpotifyStreamer(View view) {
        Log.v(LOG_TAG, getString(R.string.spotify_streamer) + " clicked");
        Toast.makeText(MainActivity.this, getString(R.string.spotify_streamer) + " Clicked", Toast.LENGTH_SHORT).show();

    }

    public void launchScoreApp(View view) {
        Log.v(LOG_TAG, getString(R.string.score_app) + " clicked");
        Toast.makeText(MainActivity.this, getString(R.string.score_app) + " Clicked", Toast.LENGTH_SHORT).show();
    }

    public void launchLibraryApp(View view) {
        Log.v(LOG_TAG, getString(R.string.library_app) + " clicked");
        Toast.makeText(MainActivity.this, getString(R.string.library_app) + " Clicked", Toast.LENGTH_SHORT).show();
    }

    public void launchBuildItBigger(View view) {
        Log.v(LOG_TAG, getString(R.string.build_it_bigger) + " clicked");
        Toast.makeText(MainActivity.this, getString(R.string.build_it_bigger) + " Clicked", Toast.LENGTH_SHORT).show();
    }

    public void launchXyzReader(View view) {
        Log.v(LOG_TAG, getString(R.string.xyz_reader) + " clicked");
        Toast.makeText(MainActivity.this, getString(R.string.xyz_reader) + " Clicked", Toast.LENGTH_SHORT).show();
    }

    public void launchCapstone(View view) {
        Log.v(LOG_TAG, getString(R.string.capstone) + " clicked");
        Toast.makeText(MainActivity.this, getString(R.string.capstone) + " Clicked", Toast.LENGTH_SHORT).show();
    }

}
