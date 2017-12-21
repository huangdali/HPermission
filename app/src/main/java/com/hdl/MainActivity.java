package com.hdl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import hdl.com.lib.runtimepermissions.HPermissions;
import hdl.com.lib.runtimepermissions.PermissionsResultAction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HPermissions.getInstance().requestAllManifestPermissionsIfNecessary(this, new PermissionsResultAction() {
            @Override
            public void onGranted() {

            }

            @Override
            public void onDenied(String permission) {

            }
        });
    }
}
