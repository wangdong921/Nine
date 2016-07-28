package com.example.com.nine;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private TextView tvMenu,tvShow;
    private ImageView ivPic;
    private WebView wvWeb;
    private ScrollView svScroll;
    private Button btnImg;

    private final static String PIC_URL = "http://ww2.sinaimg.cn/large/7a8aed7bgw1evshgr5z3oj20hs0qo0vq.jpg";
    private final static String HTML_URL = "https://www.baidu.com";

    private final static String JSON_URL = "http://fanyi.youdao.com/openapi.do?keyfrom=<keyfrom>&key=<key>&type=data&doctype=json&version=1.1&q=good";

    private final static String IMG_URL = "http://p1.image.hiapk.com/uploads/allimg/130402/23-1304021J637.jpg";

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        final RequestQueue mQueue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(HTML_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, "onResponse: "+response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "onErrorResponse: ");
            }
        });


        //使用post方式发送请求

        StringRequest postRequest = new StringRequest(Request.Method.POST, HTML_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map = new HashMap<String,String>();
                map.put("params1","values1");
                map.put("params2","values2");

                return map;
            }
        };



        //JsonRequest的用法
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(JSON_URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d(TAG, "onResponse: "+response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "onErrorResponse: "+error.getMessage(),error );
            }
        });


        btnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                ImageRequest imageRequest = new ImageRequest(IMG_URL, new Response.Listener<Bitmap>() {
//                    @Override
//                    public void onResponse(Bitmap response) {
//                        ivPic.setImageBitmap(response);
//                    }
//                }, 0, 0, Bitmap.Config.RGB_565, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        ivPic.setImageResource(R.drawable.btn_bg);
//                    }
//                });
//
//                mQueue.add(imageRequest);


                ImageLoader imageLoader = new ImageLoader(mQueue, new ImageLoader.ImageCache() {
                    @Override
                    public Bitmap getBitmap(String url) {
                        return null;
                    }

                    @Override
                    public void putBitmap(String url, Bitmap bitmap) {

                    }
                });

                ImageLoader.ImageListener lis = ImageLoader.getImageListener(ivPic,R.drawable.btn_bg,R.mipmap.ic_launcher);

                imageLoader.get(IMG_URL,lis);

            }
        });

        mQueue.add(jsonObjectRequest);
        mQueue.add(stringRequest);



    }

    private void initView() {
        tvMenu = (TextView) findViewById(R.id.tvMenu);
        tvShow = (TextView) findViewById(R.id.tvShow);
        ivPic = (ImageView) findViewById(R.id.ivPic);
        wvWeb = (WebView) findViewById(R.id.wvWeb);
        svScroll = (ScrollView) findViewById(R.id.svScroll);
        btnImg = (Button) findViewById(R.id.btn_load_img);

    }




}
