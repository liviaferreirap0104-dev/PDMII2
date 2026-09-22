package com.example.projetopdmii;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class Tela03 extends AppCompatActivity {
    private ViewPager2 viewPager;
    private ArrayList<Slide> lista;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela03);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        texto = findViewById(R.id.textView9);
        viewPager = findViewById(R.id.viewpager);
        lista = new ArrayList<Slide>();
        lista.add(new Slide("Giyu Tomioka", R.drawable.tomioka, "texto1uijhbyuigyu"));
        lista.add(new Slide("Akaza", R.drawable.akaza, "texto2gt5f7t6fvu7y6"));
        lista.add(new Slide("Obanai Iguro", R.drawable.obanai, "texto3uijbuyghygbiu7"));
        lista.add(new Slide("Inosuke Hashibira", R.drawable.inosuke, "texto4jbhjuyvbuyjhv"));
        lista.add(new Slide("Kyojuro Rengoku", R.drawable.rengoku, "texto5jhbjhbvjhyvyhju"));
        SlideAdapter adapter = new SlideAdapter(lista, texto);
        viewPager.setAdapter(adapter);

    }
}