package video.android.recyclerviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_1:
                intent.setClass(this,ListViewActivity.class);
                break;
            case R.id.btn_2:
                intent.setClass(this,GridViewActivity.class);
                break;
            case R.id.btn_3:
                intent.setClass(this,StaggeredGridActivity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
