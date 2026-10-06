package com.example.projetopdmii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class Tela03 extends AppCompatActivity implements View.OnClickListener {
    private ViewPager2 viewPager;
    private ArrayList<Slide> lista;
    private TextView texto;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela03);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.idDrawer), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn = findViewById(R.id.button3);
        btn.setOnClickListener(this);
        texto = findViewById(R.id.textView9);
        viewPager = findViewById(R.id.viewpager);
        lista = new ArrayList<Slide>();
        lista.add(new Slide("Giyu Tomioka", R.drawable.tomioka, "Giyu Tomioka é o Hashira da Água. Ele é conhecido por ser sério, reservado e bastante habilidoso com a espada. Utiliza a Respiração da Água em seus combates, demonstrando grande velocidade, precisão e força. Apesar de parecer frio e distante, Giyu é uma pessoa leal, corajosa e protetora, sempre disposta a ajudar aqueles que considera importantes."));
        lista.add(new Slide("Akaza", R.drawable.akaza, "Akaza é um dos Doze Kizuki, ocupando a posição de Lua Superior Três. Ele é um demônio extremamente poderoso, conhecido por sua grande força e habilidade em artes marciais. Akaza é determinado, orgulhoso e possui uma forte obsessão por lutar contra adversários fortes. Apesar de sua personalidade violenta, sua história revela acontecimentos trágicos de seu passado que ajudam a explicar quem ele se tornou."));
        lista.add(new Slide("Obanai Iguro", R.drawable.obanai, "Obanai Iguro é o Hashira da Serpente. Ele é sério, reservado e bastante exigente, principalmente com os outros caçadores. Utiliza a Respiração da Serpente, com movimentos rápidos e imprevisíveis em seus combates. Apesar de sua aparência rígida, Obanai é leal, determinado e possui um forte senso de justiça, além de se importar profundamente com as pessoas que ama."));
        lista.add(new Slide("Inosuke Hashibira", R.drawable.inosuke, "Inosuke Hashibira é um dos protagonistas. Ele é impulsivo, competitivo e muito corajoso, sempre procurando enfrentar adversários fortes. Usa a Respiração da Fera e luta com duas espadas de lâminas serrilhadas. Apesar de seu jeito agressivo e cabeça-dura, Inosuke também é leal, divertido e se importa muito com seus amigos."));
        lista.add(new Slide("Kyojuro Rengoku", R.drawable.rengoku, "Kyojuro Rengoku é o Hashira das Chamas. Ele é conhecido por sua personalidade alegre, determinada e extremamente corajosa. Utiliza a Respiração das Chamas, sendo um espadachim muito habilidoso e poderoso. Rengoku valoriza a vida e acredita que os mais fortes devem proteger os mais fracos. Ele também é leal, carismático e possui um forte senso de justiça."));
        SlideAdapter adapter = new SlideAdapter(lista, texto);
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                texto.setText(lista.get(position).getTexto());
            }
        });
    }

    @Override
    public void onClick(View view) {
       if(view == btn){
           startActivity(new Intent(this, MainActivity.class));
       }
    }
}