package com.example.pasidu.helloworld;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pasidu.helloworld.databinding.FragmentUserDetailsBinding;
import com.example.pasidu.helloworld.model.EmployeeDetails;

/**
 * A placeholder fragment containing a simple view.
 */
public class
        UserDetailsFragment extends Fragment {

    public UserDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        FragmentUserDetailsBinding binding = FragmentUserDetailsBinding.inflate(inflater, container, false);
        EmployeeDetails details = EmployeeDetails.GetInstance();
        binding.setEmployeeDetails(details);
        return binding.getRoot();
        //return inflater.inflate(R.layout.fragment_user_details, container, false);

    }
}
