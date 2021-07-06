package com.example.myapplication996;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AddFrag(R.drawable.adli);
        //   mediaPlayer=MediaPlayer.create(this,R.raw.sound_click);
    }


    private void AddFrag(int drwable) {
        //   mediaPlayer.start();
        BlankFragment blankFragment = BlankFragment.newInstance(drwable);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag, blankFragment);
        fragmentTransaction.commit();
    }


    public void addtenfsi(View view) {
        AddFrag(R.drawable.tenfsi);
    }

    public void addadli(View view) {
        AddFrag(R.drawable.adli);
    }

    public void addmenaie(View view) {
        AddFrag(R.drawable.asbi);
    }

    public void admi(View view) {
        AddFrag(R.drawable.hekl);
    }

    public void hadmi(View view) {
        AddFrag(R.drawable.hadmi);
    }

    public void dwrani(View view) {
        AddFrag(R.drawable.dwrani);
    }
}



