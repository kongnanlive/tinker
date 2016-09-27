package tinker.sample.android.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

import tinker.sample.android.R;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        TextView textView = new TextView(this);
        textView.setText("我是新增的TextView!");
        ((ViewGroup) findViewById(R.id.activity_demo)).addView(textView);
    }
}
