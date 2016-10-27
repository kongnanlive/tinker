package tinker.sample.android.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import tinker.sample.android.R;

/**
 * Created by kongnan on 16/9/28.
 */

public class Demo2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://m.baidu.com");
    }
}
