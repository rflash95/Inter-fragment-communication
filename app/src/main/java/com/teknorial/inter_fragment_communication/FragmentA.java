package com.teknorial.inter_fragment_communication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Teknorial on 11/01/2016.
 *
 * Fragment A
 */
public class FragmentA extends Fragment implements View.OnClickListener {
    Button button;
    int counter =0; //deklarasi counter dengan nilai awal 0
    Communicator comm; //interface referensi ke variabel.
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle SavedInstanceState){
        return inflater.inflate(R.layout.fragment_a,container,false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity(); // variabel interface dihubungkan dengan MainActivity
        /** Penjelasan singkat mengenai syntac casting object
       (Communicator) getActivity;
       (classname)object
       classname, adalah nama dari class tujuan.
       object,adalah sesuatu yang mengarah pada object sumber.
         */
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){ /* untuk menghendle method onclick kita perlu implements View.OnClickListener */
        counter ++; // setiap diclick akan bertambah nilai dari variabel counter.
        comm.respond("Tombol telah di sentuh "+counter+" kali"); //dikirim ke MainActivity melalui method pada interface yang implementasikan.
    }
}
