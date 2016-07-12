package com.ucsc.pnp.elephantlocalize;

import java.io.IOException;

import fi.iki.elonen.NanoHTTPD;

/**
 * Created by nrv on 7/13/16.
 */
public class ServerApp extends NanoHTTPD {

    public ServerApp() throws IOException{
        super(8080);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT,false);

    }

    @Override
    public Response serve(IHTTPSession session) {

        return newFixedLengthResponse("Hello Client from android server");
    }
}
