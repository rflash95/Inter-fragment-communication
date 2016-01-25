package com.teknorial.inter_fragment_communication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Teknorial on 11/01/2016.
 *
 * Fragment  B
 */
public class FragmentB extends Fragment {
    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle SavedInstanceState){
        return inflater.inflate(R.layout.fragment_b,container,false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        text=(TextView) getActivity().findViewById(R.id.textView);
    }
    public void changeText(String data){
        text.setText(data); //menampilkan text yang dikirim dari MainActivity
    }
}
