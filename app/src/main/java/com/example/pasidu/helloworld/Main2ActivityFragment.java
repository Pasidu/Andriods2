package com.example.pasidu.helloworld;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pasidu.helloworld.databinding.FragmentMain2Binding;
import com.example.pasidu.helloworld.databinding.FragmentUserDetailsBinding;
import com.example.pasidu.helloworld.model.EmployeeDetails;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //FragmentUserDetailsBinding binding = FragmentUserDetailsBinding.inflate(inflater, container, false);
        FragmentMain2Binding binding2 = FragmentMain2Binding.inflate(inflater, container, false);
        EmployeeDetails details = EmployeeDetails.GetInstance();
        binding2.setEmployeeDetails(details);
        return binding2.getRoot();
        //return inflater.inflate(R.layout.fragment_main2, container, false);
    }
}
