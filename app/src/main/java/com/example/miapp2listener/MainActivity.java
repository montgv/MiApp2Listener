package com.example.miapp2listener;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.miapp2listener.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btEvaluar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(binding.txtMatematicas.getText().toString());
                int valor2 = Integer.parseInt(binding.txtFisica.getText().toString());
                int valor3 = Integer.parseInt(binding.txtQuimica.getText().toString());

                int media = (valor1 + valor2 + valor3) / 3;

                if (media >= 5) {
                    binding.txtPantalla.setText("Aprobado con " + media + " de media");
                } else {
                    binding.txtPantalla.setText("Suspenso con " + media + " de media");
                }
            }
        });
    }
}