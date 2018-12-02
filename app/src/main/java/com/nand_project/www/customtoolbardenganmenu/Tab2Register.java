package com.nand_project.www.customtoolbardenganmenu;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




/**
 * Created by USER on 08-Dec-17.
 */

public class Tab2Register extends Fragment {
    private EditText name, username, email, password;
    private Button btnRegist;
    private Intent intent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_register, container, false);
        name = (EditText) rootView.findViewById(R.id.name);
        username = (EditText) rootView.findViewById(R.id.username);
        email = (EditText) rootView.findViewById(R.id.email);
        password = (EditText) rootView.findViewById(R.id.password);

        btnRegist = (Button) rootView.findViewById(R.id.btnRegist);

        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("") || name.getText().toString().equals(" "))
                    Toast.makeText(getActivity(), "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show();
                else if(username.getText().toString().equals("") || username.getText().toString().equals(" "))
                    Toast.makeText(getActivity(), "Username tidak boleh kosong", Toast.LENGTH_SHORT).show();
                else if (email.getText().toString().equals("") || email.getText().toString().equals(" "))
                    Toast.makeText(getActivity(), "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
                else if (password.getText().toString().equals("") || password.getText().toString().equals(" "))
                    Toast.makeText(getActivity(), "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(), "code disini", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }



}
