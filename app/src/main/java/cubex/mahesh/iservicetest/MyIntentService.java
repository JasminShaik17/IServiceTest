package cubex.mahesh.iservicetest;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.net.URL;

public class MyIntentService extends IntentService {

   static Bitmap bmp;

    public MyIntentService() {
        super("MyIntentService");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        try {

            URL u = new URL("https://www.android.com/static/2016/img/share/oreo-lg.jpg");
            InputStream isr = u.openStream();
             bmp = BitmapFactory.decodeStream(isr);
            Intent i = new Intent( );
            i.setAction("image_download");
            sendBroadcast(i);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
