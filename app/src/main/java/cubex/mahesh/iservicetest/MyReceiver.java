package cubex.mahesh.iservicetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ImageView;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        ImageView iview =( (MainActivity)context).findViewById(R.id.iview);
        iview.setImageBitmap(MyIntentService.bmp);
    }
}
