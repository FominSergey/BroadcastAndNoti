package com.example.vv.broadcastandnoti;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startActivity(new Intent(context, MainActivity.class));
        Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_SHORT).show();
    }
}
