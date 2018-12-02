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
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by USER on 08-Dec-17.
 */

public class Tab1Login extends Fragment {

    private EditText email, password;
    private Button btnLogin;
    private TextView txtForgotPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_login, container, false);

        email = rootView.findViewById(R.id.login_email);
        password = rootView.findViewById(R.id.login_password);
        btnLogin = rootView.findViewById(R.id.btnLogin);
        txtForgotPassword = rootView.findViewById(R.id.go_lupapassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals(""))
                    Toast.makeText(getActivity(), "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
                else if (password.getText().toString().equals(""))
                    Toast.makeText(getActivity(), "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(), "code disini", Toast.LENGTH_SHORT).show();

            }
        });



        return rootView;
    }



}
