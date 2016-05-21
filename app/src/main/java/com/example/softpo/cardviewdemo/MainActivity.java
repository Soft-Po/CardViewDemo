package com.example.softpo.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private CardView mCardView;

    private SeekBar seekElevation,seekCornerRadius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initSeekBar();

    }

    private void initSeekBar() {
        seekCornerRadius.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    mCardView.setRadius(progress);//设置圆角大小

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekElevation.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    mCardView.setCardElevation(progress);//阴影大小
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void initView() {
        seekElevation = ((SeekBar) findViewById(R.id.seekElevation));

        seekCornerRadius = ((SeekBar) findViewById(R.id.seekCornerRadius));

        mCardView = ((CardView) findViewById(R.id.cardView));
    }
}
