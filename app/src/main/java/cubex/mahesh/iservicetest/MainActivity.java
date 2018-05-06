package cubex.mahesh.iservicetest;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter = new IntentFilter( );
        filter.addAction("image_download");
        registerReceiver(new MyReceiver(), filter);
    }

    public void  getImage(View v)
    {
        Intent i = new Intent(this,MyIntentService.class);
        startService(i);
    }
}
