package com.example.pasidu.helloworld.repository;


import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.pasidu.helloworld.VolleyBall.SilkRequest;
import com.example.pasidu.helloworld.VolleyBall.SilkRequestQueue;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Pasidu on 10/19/2015.
 */
public class UserRepository {

    private Context _context;

    public UserRepository(Context context) {
        _context = context;
    }


    public void Login(String userName, String password) throws JSONException {
        JSONObject params = new JSONObject();
        params.put("UserName", userName);
        params.put("Password", password);

        String url = "http://httpbin.org/get?site=code&network=tutsplus";

        JsonObjectRequest jsonRequest = new JsonObjectRequest
                (Request.Method.POST, url, params, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // the response is already constructed as a JSONObject!
                        try {
                            response = response.getJSONObject("args");
                            String site = response.getString("site"),
                                    network = response.getString("network");
                            System.out.println("Site: " + site + "\nNetwork: " + network);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });

        SilkRequestQueue.getInstance(_context).addToRequestQueue(jsonRequest);
    }
}
