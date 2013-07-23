package com.cloudmine.api.rest;

public class FileLoadRequest extends com.cloudmine.api.rest.BaseFileLoadRequest {

    public FileLoadRequest(java.lang.String fileName, com.cloudmine.api.CMSessionToken sessionToken, com.cloudmine.api.rest.options.CMServerFunction serverFunction, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener, com.android.volley.Response.ErrorListener errorListener) {
        super(fileName, sessionToken, serverFunction, successListener, errorListener);
    }

    public FileLoadRequest(java.lang.String fileName, com.cloudmine.api.rest.options.CMServerFunction serverFunction, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener, com.android.volley.Response.ErrorListener errorListener) {
        super(fileName, (com.cloudmine.api.CMSessionToken)null, serverFunction, successListener, errorListener);
    }

    public FileLoadRequest(java.lang.String fileName, com.cloudmine.api.CMSessionToken sessionToken, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener, com.android.volley.Response.ErrorListener errorListener) {
        super(fileName, sessionToken, (com.cloudmine.api.rest.options.CMServerFunction)null, successListener, errorListener);
    }

    public FileLoadRequest(java.lang.String fileName, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener, com.android.volley.Response.ErrorListener errorListener) {
        super(fileName, (com.cloudmine.api.CMSessionToken)null, (com.cloudmine.api.rest.options.CMServerFunction)null, successListener, errorListener);
    }

    public FileLoadRequest(java.lang.String fileName, com.cloudmine.api.CMSessionToken sessionToken, com.cloudmine.api.rest.options.CMServerFunction serverFunction, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener) {
        super(fileName, sessionToken, serverFunction, successListener, (com.android.volley.Response.ErrorListener)null);
    }

    public FileLoadRequest(java.lang.String fileName, com.cloudmine.api.rest.options.CMServerFunction serverFunction, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener) {
        super(fileName, (com.cloudmine.api.CMSessionToken)null, serverFunction, successListener, (com.android.volley.Response.ErrorListener)null);
    }

    public FileLoadRequest(java.lang.String fileName, com.cloudmine.api.CMSessionToken sessionToken, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener) {
        super(fileName, sessionToken, (com.cloudmine.api.rest.options.CMServerFunction)null, successListener, (com.android.volley.Response.ErrorListener)null);
    }

    public FileLoadRequest(java.lang.String fileName, com.android.volley.Response.Listener<com.cloudmine.api.rest.response.FileLoadResponse> successListener) {
        super(fileName, (com.cloudmine.api.CMSessionToken)null, (com.cloudmine.api.rest.options.CMServerFunction)null, successListener, (com.android.volley.Response.ErrorListener)null);
    }

}