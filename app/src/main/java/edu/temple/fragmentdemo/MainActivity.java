package edu.temple.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener {

    boolean FragmentA_Launched = true;
    boolean FragmentB_Launched = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment, new FragmentA());
        fragmentTransaction.commit();

    }


    @Override
    public void onFragmentInteraction(Uri uri) {

        //doTransition();
    }

    /*private void doTransition() {

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment, new FragmentB())
                .addToBackStack(null)
                .commit();
    }*/
}
