package com.vmetis.jackpark;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.activity_main_tv_tip)
    TextView tvTip;
    @Bind(R.id.activity_main_et_input)
    EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {

    }

    @OnClick(R.id.activity_main_btn_interact)
    public void interact() {
        tvTip.setText("Hello " + etInput.getText().toString() + "!");
    }
}
