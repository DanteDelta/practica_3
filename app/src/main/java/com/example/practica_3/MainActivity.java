package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button button;
    RadioButton GeneroRadio;
    RadioGroup radioGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGrupo=(RadioGroup)findViewById(R.id.radioGroup);
    }
    public void onclickbuttonMethod(View v){
        int selectedid = radioGrupo.getCheckedRadioButtonId();
        GeneroRadio = (RadioButton)findViewById(selectedid);
        if(selectedid == -1){
            Toast.makeText(MainActivity.this, "No ha seleccionado nada", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this,GeneroRadio.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
