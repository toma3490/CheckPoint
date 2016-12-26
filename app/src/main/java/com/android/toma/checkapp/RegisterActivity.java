package com.android.toma.checkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.android.toma.checkapp.dao.EmployeeDAO;
import com.android.toma.checkapp.dao.EmployerDAO;
import com.android.toma.checkapp.entity.Employee;
import com.android.toma.checkapp.entity.Employer;

public class RegisterActivity extends AppCompatActivity {

    private EditText mLogin;
    private EditText mPassword;
    private EditText mName;
    private EditText mLastName;
    private EditText mCompany;
    private RadioGroup mRadioGroup;
    private Button mRegisterBtn;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.register);
        setupVariables();

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mRadioGroup.getCheckedRadioButtonId() == R.id.employeeRbtn){
                    Employee employee = new Employee(mName.getText().toString(), mLastName.getText().toString());
                    EmployeeDAO.getInstance().save(employee);
                }
                else{
                    mLinearLayout.setVisibility(View.VISIBLE);
                    Employer employer = new Employer(mName.getText().toString(), mLastName.getText().toString(), mCompany.getText().toString());
                    EmployerDAO.getInstance().save(employer);
                }
            }
        });
    }

    private void setupVariables() {
        mLogin = (EditText) findViewById(R.id.loginEdit);
        mPassword = (EditText) findViewById(R.id.password);
        mName = (EditText) findViewById(R.id.nameEdit);
        mLastName = (EditText) findViewById(R.id.lastNameEdit);
        mCompany = (EditText) findViewById(R.id.companyEdit);
        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        mRegisterBtn = (Button) findViewById(R.id.registerBtn);
        mLinearLayout = (LinearLayout) findViewById(R.id.companyLayout);
    }
}
