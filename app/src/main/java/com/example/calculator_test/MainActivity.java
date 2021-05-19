package com.example.calculator_test;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.os.Bundle;

enum State {FirstNumberInput, OperatorInput, SecondNumberInput}
enum OP {None, Add, Sub, Mul, Div}

public class MainActivity extends AppCompatActivity {

    private int theValue = 0;
    private int operand1 = 0, operand2 = 0;
    private OP op = OP.None;
    private State state = State.FirstNumberInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    設定按鍵寬高，在OnCreate裡view的height,width會取得0，要特別用onWindowFocusChanged
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus){
            GridLayout keysGL = (GridLayout) findViewById(R.id.keys);
            int KbHeight = (int) (keysGL.getHeight()/keysGL.getRowCount());
            int KBWidth = (int) (keysGL.getWidth()/keysGL.getColumnCount());
            Button btn;
            for(int i=0; i < keysGL.getChildCount(); i++) {
                btn = (Button) keysGL.getChildAt(i);
                btn.setHeight(KbHeight);
                btn.setWidth(KBWidth);
                btn.setTextSize(25);
            }
        }
    }

    public void processKeyInput(View view) {
//        Button b = (Button)
//        switch () {
//            case "0":
//            case "1":
//            case "2":
//            case "3":
//            case "4":
//            case "5":
//            case "6":
//            case "7":
//            case "8":
//            case "9":
//            default:
//        }
    }
}