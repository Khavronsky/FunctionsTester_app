package com.khavronsky.functionstester_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //region FIELDS
    @BindView(R.id.btn1)
    Button mBtn1;

    @BindView(R.id.btn2)
    Button mBtn2;

    @BindView(R.id.btn3)
    Button mBtn3;

    @BindView(R.id.btn4)
    Button mBtn4;

    @BindView(R.id.btn5)
    Button mBtn5;

    @BindView(R.id.btn6)
    Button mBtn6;

    @BindView(R.id.btn7)
    Button mBtn7;

    @BindView(R.id.btn8)
    Button mBtn8;

    @BindView(R.id.btn9)
    Button mBtn9;

    @BindView(R.id.btn10)
    Button mBtn10;

    @BindView(R.id.btn11)
    Button mBtn11;

    @BindView(R.id.btn12)
    Button mBtn12;

    @BindView(R.id.btn13)
    Button mBtn13;

    @BindView(R.id.btn14)
    Button mBtn14;

    @BindView(R.id.btn15)
    Button mBtn15;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9,
            R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn13, R.id.btn14, R.id.btn15})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                function1();
                break;
            case R.id.btn2:
                function2();
                break;
            case R.id.btn3:
                function3();
                break;
            case R.id.btn4:
                function4();
                break;
            case R.id.btn5:
                function5();
                break;
            case R.id.btn6:
                function6();
                break;
            case R.id.btn7:
                function7();
                break;
            case R.id.btn8:
                function8();
                break;
            case R.id.btn9:
                function9();
                break;
            case R.id.btn10:
                function10();
                break;
            case R.id.btn11:
                function11();
                break;
            case R.id.btn12:
                function12();
                break;
            case R.id.btn13:
                function13();
                break;
            case R.id.btn14:
                function14();
                break;
            case R.id.btn15:
                function15();
                break;
        }
    }

    //region Tested functions
    private void function1() {
        Toast.makeText(this, R.string.title_btn_1, Toast.LENGTH_SHORT).show();
    }

    private void function2() {
        Toast.makeText(this, R.string.title_btn_2, Toast.LENGTH_SHORT).show();
    }

    private void function3() {
        Toast.makeText(this, R.string.title_btn_3, Toast.LENGTH_SHORT).show();
    }

    private void function4() {
        Toast.makeText(this, R.string.title_btn_4, Toast.LENGTH_SHORT).show();
    }

    private void function5() {
        Toast.makeText(this, R.string.title_btn_5, Toast.LENGTH_SHORT).show();
    }

    private void function6() {
        Toast.makeText(this, R.string.title_btn_6, Toast.LENGTH_SHORT).show();
    }

    private void function7() {
        Toast.makeText(this, R.string.title_btn_7, Toast.LENGTH_SHORT).show();
    }

    private void function8() {
        Toast.makeText(this, R.string.title_btn_8, Toast.LENGTH_SHORT).show();
    }

    private void function9() {
        Toast.makeText(this, R.string.title_btn_9, Toast.LENGTH_SHORT).show();
    }

    private void function10() {
        Toast.makeText(this, R.string.title_btn_10, Toast.LENGTH_SHORT).show();
    }

    private void function11() {
        Toast.makeText(this, R.string.title_btn_11, Toast.LENGTH_SHORT).show();
    }

    private void function12() {
        Toast.makeText(this, R.string.title_btn_12, Toast.LENGTH_SHORT).show();
    }

    private void function13() {
        Toast.makeText(this, R.string.title_btn_13, Toast.LENGTH_SHORT).show();
    }

    private void function14() {
        Toast.makeText(this, R.string.title_btn_14, Toast.LENGTH_SHORT).show();
    }

    private void function15() {
        Toast.makeText(this, R.string.title_btn_15, Toast.LENGTH_SHORT).show();
    }

    //endregion
}
