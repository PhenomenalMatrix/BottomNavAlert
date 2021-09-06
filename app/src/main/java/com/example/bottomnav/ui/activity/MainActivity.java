package com.example.bottomnav.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.bottomnav.R;
import com.example.bottomnav.databinding.ActivityMainBinding;
import com.example.bottomnav.ui.fragments.characters.CharacterFragment;
import com.example.bottomnav.ui.fragments.info.InfoFragment;
import com.example.bottomnav.ui.fragments.locatiaon.LocationFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initBottomNav();
    }

    private void initBottomNav() {
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new CharacterFragment()).commit();
        binding.BottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.character:
                        binding.titleToolbar.setText("Character");
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.mainContainer, new CharacterFragment()).commit();
                        break;
                    case R.id.location:
                        binding.titleToolbar.setText("Location");
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.mainContainer, new LocationFragment()).commit();
                        break;
                    case R.id.info:
                        binding.titleToolbar.setText("Info");
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.mainContainer, new InfoFragment()).commit();
                        break;
                }
                return true;
            }
        });
    }
}