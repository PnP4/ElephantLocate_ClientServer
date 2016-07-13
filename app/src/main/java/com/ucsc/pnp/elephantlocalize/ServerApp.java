package com.ucsc.pnp.elephantlocalize;

import android.util.Log;

import java.io.IOException;

import fi.iki.elonen.NanoHTTPD;

/**
 * Created by nrv on 7/13/16.
 */
public class ServerApp extends NanoHTTPD {

    public ServerApp() throws IOException{
        super(8081);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        Log.e("Service", "Activate service");

    }

    @Override
    public Response serve(IHTTPSession session) {
        Log.e("Server",session.getQueryParameterString());
        return newFixedLengthResponse("Hello Client from android server");
    }
}
