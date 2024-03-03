package com.nolamarel.myapplicationjava5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import com.nolamarel.myapplicationjava5.databinding.ActivityDataPickerBinding;

public class DataPickerActivity extends AppCompatActivity {
private ActivityDataPickerBinding binding;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDataPickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                binding.textView.setText(("Время: " + hourOfDay + ":" + minute));
            }
        });

        binding.datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                binding.textView1.setText("Дата: " + dayOfMonth + "." + monthOfYear + "." + year);
            }
        });

    }
}