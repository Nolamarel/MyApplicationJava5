package com.nolamarel.myapplicationjava5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nolamarel.myapplicationjava5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    
    public void onMyIntentButtonClick(View view){
        if(binding.textPassword.getText().toString().length() < 8) {
            Toast.makeText(this, "Слишком короткий пароль", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, TasksListActivity.class);
            startActivity(intent);
        }
    }
    public void onMyButtonClick(View view){
        binding.newTextPas.setText(binding.textPassword.getText().toString());
    }

}