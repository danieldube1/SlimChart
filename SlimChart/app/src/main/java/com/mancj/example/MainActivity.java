package com.mancj.example;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mancj.slimchart.SlimChart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlimChart slimChart = (SlimChart) findViewById(R.id.slimChart);

        //Optional - create colors array
        int[] colors = new int[4];
        colors[0] = Color.rgb(46, 41,78);
        colors[1] = Color.rgb(127, 22, 101);
        colors[2] = Color.rgb(217, 3, 104);
        colors[3] = Color.rgb(247, 76, 110);
//        slimChart.setColors(colors);

        //Create array for your stats
        final float[] stats = new float[4];
        stats[0] = 100;
        stats[1] = 85;
        stats[2] = 40;
        stats[3] = 25;
        slimChart.setStats(stats);

        //Play animation
        slimChart.setStartAnimationDuration(2000);

        //Set single color - other colors will be generated automatically
        slimChart.setColor(ContextCompat.getColor(this, R.color.colorPrimary));

        slimChart.setStrokeWidth(13);
        slimChart.setText("234");
        slimChart.setTextColor(Color.WHITE);
        slimChart.setRoundEdges(true);

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
