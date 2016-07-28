package com.example.com.nine;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.File;

import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;

public class AlertActivity extends AppCompatActivity {
    private Button btnDialog,btnToast,btnSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        initView();


        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);

                builder.setTitle("是否确定？")
                        .setMessage("我是确认信息。。。")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();

            }
        });


        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int maxMamory = (int) (Runtime.getRuntime().maxMemory() / 1024);

                Utils.showToast(AlertActivity.this, "最大的内存" + maxMamory + "KB");
            }
        });

        btnSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(btnSnackbar, "data deleted", Snackbar.LENGTH_SHORT).
                        setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });

        File file = new File("text");
        Luban.get(this).load(file)
                .putGear(Luban.THIRD_GEAR)
                .setCompressListener(new OnCompressListener() {
                    @Override
                    public void onSuccess(File file) {

                    }
                }).launch();



    }

    private void initView() {
        btnDialog = (Button) findViewById(R.id.btn_dialog);
        btnToast = (Button) findViewById(R.id.btn_toast);
        btnSnackbar = (Button) findViewById(R.id.btn_snackbar);
    }

}
