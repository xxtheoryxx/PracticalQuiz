package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    WebView wvPage;
    Spinner spnUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wvPage = findViewById(R.id.webViewPage);
        spnUrl = findViewById(R.id.spinner);

        wvPage.setWebViewClient(new WebViewClient());
        wvPage.getSettings().setJavaScriptEnabled(true);
        spnUrl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String url;
                switch(i){
                    case 0:
                        url = "https://www.rp.edu.sg/soi/full-time-diplomas/details/r47";
                        wvPage.loadUrl(url);
                        break;
                    case 1:
                        url = "https://www.rp.edu.sg/soi/full-time-diplomas/details/r12";
                        wvPage.loadUrl(url);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
