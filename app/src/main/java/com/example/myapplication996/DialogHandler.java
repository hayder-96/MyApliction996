package com.example.myapplication996;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class DialogHandler extends AppCompatActivity {

    int n;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<Item> arrayList = new ArrayList<>();
    private Intent intent;
    private TimeSetting t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);


        intent = getIntent();
        n = intent.getIntExtra("name", -1);
        if (n == R.drawable.adli) {

            arrayList.add(new Item(getResources().getString(R.string.The_pectoralis_major_muscle), BlankFragment2.newInstance(getResources().getString(R.string.The_pectoralis_major_muscle1))));
            arrayList.add(new Item(getResources().getString(R.string.The_radius_muscle), BlankFragment2.newInstance(getResources().getString(R.string.The_radius_muscle1))));
            arrayList.add(new Item(getResources().getString(R.string.Quadriceps_muscle), BlankFragment2.newInstance(getResources().getString(R.string.Quadriceps_muscle1))));
            arrayList.add(new Item(getResources().getString(R.string.The_iliac_muscle), BlankFragment2.newInstance(getResources().getString(R.string.The_iliac_muscle1))));
            arrayList.add(new Item(getResources().getString(R.string.deltoid), BlankFragment2.newInstance(getResources().getString(R.string.deltoid1))));
            arrayList.add(new Item(getResources().getString(R.string.The_calcaneus_muscle), BlankFragment2.newInstance(getResources().getString(R.string.The_calcaneus_muscle1))));
            arrayList.add(new Item(getResources().getString(R.string.The_twitch_muscle), BlankFragment2.newInstance(getResources().getString(R.string.The_twitch_muscle1))));


        } else if (n == R.drawable.asbi) {

            arrayList.add(new Item(getResources().getString(R.string.cerebellum), BlankFragment2.newInstance(getResources().getString(R.string.cerebellum1))));
            arrayList.add(new Item(getResources().getString(R.string.The_brain), BlankFragment2.newInstance(getResources().getString(R.string.The_brain1))));
            arrayList.add(new Item(getResources().getString(R.string.Bone_marrow), BlankFragment2.newInstance(getResources().getString(R.string.Bone_marrow1))));
            arrayList.add(new Item(getResources().getString(R.string.Cingoid_gyrus), BlankFragment2.newInstance(getResources().getString(R.string.Cingoid_gyrus1))));
            arrayList.add(new Item(getResources().getString(R.string.Corpus_callosum), BlankFragment2.newInstance(getResources().getString(R.string.Corpus_callosum1))));
            arrayList.add(new Item(getResources().getString(R.string.Frontal_lobe), BlankFragment2.newInstance(getResources().getString(R.string.Frontal_lobe1))));
            arrayList.add(new Item(getResources().getString(R.string.Pineal_gland), BlankFragment2.newInstance(getResources().getString(R.string.Pineal_gland1))));
            arrayList.add(new Item(getResources().getString(R.string.Hypothalamus), BlankFragment2.newInstance(getResources().getString(R.string.Hypothalamus1))));


        } else if (n == R.drawable.hadmi) {

            arrayList.add(new Item(getResources().getString(R.string.the_tongue), BlankFragment2.newInstance(getResources().getString(R.string.the_tongue1))));
            arrayList.add(new Item(getResources().getString(R.string.throat), BlankFragment2.newInstance(getResources().getString(R.string.throat1))));
            arrayList.add(new Item(getResources().getString(R.string.Liver), BlankFragment2.newInstance(getResources().getString(R.string.Liver1))));
            arrayList.add(new Item(getResources().getString(R.string.esophagus), BlankFragment2.newInstance(getResources().getString(R.string.esophagus1))));
            arrayList.add(new Item(getResources().getString(R.string.Stomach), BlankFragment2.newInstance(getResources().getString(R.string.Stomach1))));
            arrayList.add(new Item(getResources().getString(R.string.The_spleen), BlankFragment2.newInstance(getResources().getString(R.string.The_spleen1))));
            arrayList.add(new Item(getResources().getString(R.string.Pancreas), BlankFragment2.newInstance(getResources().getString(R.string.Pancreas1))));
            arrayList.add(new Item(getResources().getString(R.string.Small_intestine), BlankFragment2.newInstance(getResources().getString(R.string.Small_intestine1))));
            arrayList.add(new Item(getResources().getString(R.string.Large_intestine), BlankFragment2.newInstance(getResources().getString(R.string.Large_intestine1))));
            arrayList.add(new Item(getResources().getString(R.string.Duodenum), BlankFragment2.newInstance(getResources().getString(R.string.Duodenum1))));
            arrayList.add(new Item(getResources().getString(R.string.Rectal), BlankFragment2.newInstance(getResources().getString(R.string.Rectal1))));
            arrayList.add(new Item(getResources().getString(R.string.Appendix), BlankFragment2.newInstance(getResources().getString(R.string.Appendix1))));


        } else if (n == R.drawable.tenfsi) {

            arrayList.add(new Item(getResources().getString(R.string.Trachea), BlankFragment2.newInstance(getResources().getString(R.string.Trachea1))));
            arrayList.add(new Item(getResources().getString(R.string.Lung), BlankFragment2.newInstance(getResources().getString(R.string.Lung1))));
            arrayList.add(new Item(getResources().getString(R.string.Pulmonary_artery), BlankFragment2.newInstance(getResources().getString(R.string.Pulmonary_artery1))));
            arrayList.add(new Item(getResources().getString(R.string.Pulmonary_vein), BlankFragment2.newInstance(getResources().getString(R.string.Pulmonary_vein1))));
            arrayList.add(new Item(getResources().getString(R.string.Diaphragm), BlankFragment2.newInstance(getResources().getString(R.string.Diaphragm1))));


        } else if (n == R.drawable.dwrani) {

            arrayList.add(new Item(getResources().getString(R.string.heart), BlankFragment2.newInstance(getResources().getString(R.string.hear1))));
            arrayList.add(new Item(getResources().getString(R.string.Pericardium), BlankFragment2.newInstance(getResources().getString(R.string.Pericardium1))));
            arrayList.add(new Item(getResources().getString(R.string.Aorta), BlankFragment2.newInstance(getResources().getString(R.string.Aorta1))));
            arrayList.add(new Item(getResources().getString(R.string.The_humeral_head_artery), BlankFragment2.newInstance(getResources().getString(R.string.The_humeral_head_artery1))));
            arrayList.add(new Item(getResources().getString(R.string.Carotid_artery), BlankFragment2.newInstance(getResources().getString(R.string.Carotid_artery1))));
            arrayList.add(new Item(getResources().getString(R.string.Coronary_artery), BlankFragment2.newInstance(getResources().getString(R.string.Coronary_artery1))));
            arrayList.add(new Item(getResources().getString(R.string.Subclavian_artery), BlankFragment2.newInstance(getResources().getString(R.string.Carotid_artery1))));
            arrayList.add(new Item(getResources().getString(R.string.Superior_vena_cava), BlankFragment2.newInstance(getResources().getString(R.string.Superior_vena_cava1))));
            arrayList.add(new Item(getResources().getString(R.string.Inferior_vena_cava), BlankFragment2.newInstance(getResources().getString(R.string.Inferior_vena_cava1))));
            arrayList.add(new Item(getResources().getString(R.string.Adrenal), BlankFragment2.newInstance(getResources().getString(R.string.Adrenal1))));
            arrayList.add(new Item(getResources().getString(R.string.Ovary), BlankFragment2.newInstance(getResources().getString(R.string.Ovary1))));
            arrayList.add(new Item(getResources().getString(R.string.the_pituitary_gland), BlankFragment2.newInstance(getResources().getString(R.string.the_pituitary_gland1))));
            arrayList.add(new Item(getResources().getString(R.string.Testis), BlankFragment2.newInstance(getResources().getString(R.string.Testis1))));
            arrayList.add(new Item(getResources().getString(R.string.Thymus_gland), BlankFragment2.newInstance(getResources().getString(R.string.Thymus_gland1))));
            arrayList.add(new Item(getResources().getString(R.string.Thyroid), BlankFragment2.newInstance(getResources().getString(R.string.Thyroid1))));
            arrayList.add(new Item(getResources().getString(R.string.Red_blood_cells), BlankFragment2.newInstance(getResources().getString(R.string.Red_blood_cells1))));
            arrayList.add(new Item(getResources().getString(R.string.White_blood_cells), BlankFragment2.newInstance(getResources().getString(R.string.White_blood_cells1))));
            arrayList.add(new Item(getResources().getString(R.string.bone_marrow), BlankFragment2.newInstance(getResources().getString(R.string.bone_marrow1))));
            arrayList.add(new Item(getResources().getString(R.string.Lymph_node), BlankFragment2.newInstance(getResources().getString(R.string.Lymph_node1))));
            arrayList.add(new Item(getResources().getString(R.string.skin), BlankFragment2.newInstance(getResources().getString(R.string.skin1))));


        } else if (n == R.drawable.hekl) {

            arrayList.add(new Item(getResources().getString(R.string.Temporal_bone), BlankFragment2.newInstance(getResources().getString(R.string.Temporal_bone1))));
            arrayList.add(new Item(getResources().getString(R.string.Acromion), BlankFragment2.newInstance(getResources().getString(R.string.Acromion1))));
            arrayList.add(new Item(getResources().getString(R.string.The_radius_bone), BlankFragment2.newInstance(getResources().getString(R.string.The_radius_bone1))));
            arrayList.add(new Item(getResources().getString(R.string.ulna), BlankFragment2.newInstance(getResources().getString(R.string.ulna1))));
            arrayList.add(new Item(getResources().getString(R.string.wishbone), BlankFragment2.newInstance(getResources().getString(R.string.wishbone1))));
            arrayList.add(new Item(getResources().getString(R.string.Hip_bone), BlankFragment2.newInstance(getResources().getString(R.string.Hip_bone1))));
            arrayList.add(new Item(getResources().getString(R.string.Sacrum_bone), BlankFragment2.newInstance(getResources().getString(R.string.Sacrum_bone1))));
            arrayList.add(new Item(getResources().getString(R.string.Patella), BlankFragment2.newInstance(getResources().getString(R.string.Patella1))));
            arrayList.add(new Item(getResources().getString(R.string.Shin_bone), BlankFragment2.newInstance(getResources().getString(R.string.Shin_bone1))));
            arrayList.add(new Item(getResources().getString(R.string.Fibula_bone), BlankFragment2.newInstance(getResources().getString(R.string.Fibula_bone1))));
            arrayList.add(new Item(getResources().getString(R.string.Backbones), BlankFragment2.newInstance(getResources().getString(R.string.Backbones1))));
            arrayList.add(new Item(getResources().getString(R.string.Wrist), BlankFragment2.newInstance(getResources().getString(R.string.Wrist1))));
            arrayList.add(new Item(getResources().getString(R.string.Cruciate_ligament), BlankFragment2.newInstance(getResources().getString(R.string.Cruciate_ligament1))));


        }

        t = new TimeSetting(getSupportFragmentManager(), arrayList);
        viewPager.setAdapter(t);
        tabLayout.setupWithViewPager(viewPager);


    }
}



