package com.nolamarel.myapplicationjava5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nolamarel.myapplicationjava5.databinding.ActivityToDoListBinding;

public class TasksListActivity extends AppCompatActivity {
private ActivityToDoListBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToDoListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        checkBox();
        radioGroup();
    }

    public void checkBox(){
        binding.checkBox1.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked){
                binding.textView1.setVisibility(View.VISIBLE);
            } else {
                binding.textView1.setVisibility(View.INVISIBLE);
            }
        }));

        binding.checkBox2.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked){
                binding.textView2.setVisibility(View.VISIBLE);
            } else {
                binding.textView2.setVisibility(View.INVISIBLE);
            }
        }));

        binding.checkBox3.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked){
                binding.textView3.setVisibility(View.VISIBLE);
            } else {
                binding.textView3.setVisibility(View.INVISIBLE);
            }
        }));
    }

    public void radioGroup(){
        binding.radioGroup.setOnCheckedChangeListener(((group, checkedId) -> {
            if (checkedId == binding.radioButton1.getId()){
                binding.imageView.setImageResource(R.drawable.dog_mem);
            } else if (checkedId == binding.radioButton2.getId()) {
                binding.imageView.setImageResource(R.drawable.sax_guy);
            } else {
                binding.imageView.setImageResource(R.drawable.cute_meme);
            }
        }));
    }

    public void OnMyButtonClick(View view){
        Intent intent = new Intent(TasksListActivity.this, DataPickerActivity.class);
        startActivity(intent);
    }

}