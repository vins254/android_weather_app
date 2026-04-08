package com.example.weatherapp.util.networkutil;

public interface NetworkStatusListener {
    void onNetworkAvailable();
    void onNetworkLost();
}
