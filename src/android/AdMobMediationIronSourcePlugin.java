package me.mingz.cordova.admob.mediation;


import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class AdMobMediationIronSourcePlugin extends CordovaPlugin {

    String TAG = "<AdMobMediationIronSourcePlugin>: ";




    private Activity getActivity() {
        return cordova.getActivity();
    }

    /*************************overwrite******************************/

    @Override
    protected void pluginInitialize() {
        super.pluginInitialize();
    }

    @Override
    public void onResume() {
        super.onResume();
        IronSource.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        IronSource.onPause(this);
    }



}