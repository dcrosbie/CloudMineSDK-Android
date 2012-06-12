package com.cloudmine.api.rest;

import android.os.Parcel;
import android.os.Parcelable;
import com.cloudmine.api.CMUserToken;
import com.cloudmine.api.DeviceIdentifier;
import com.cloudmine.api.UserCMWebService;
import org.apache.http.message.AbstractHttpMessage;

/*
 * There is some code duplication in here from AndroidCMWebService, because Java doesn't let us do
 * multiple inheritance. Silly Java.
 */
/**
 *
 * Copyright CloudMine LLC
 * CMUser: johnmccarthy
 * Date: 6/11/12, 2:41 PM
 */
public class AndroidUserCMWebService extends UserCMWebService implements Parcelable {
    public static final Creator<AndroidUserCMWebService> CREATOR =
            new Creator<AndroidUserCMWebService>() {
                @Override
                public AndroidUserCMWebService createFromParcel(Parcel parcel) {
                    return new AndroidUserCMWebService(parcel);
                }

                @Override
                public AndroidUserCMWebService[] newArray(int i) {
                    return new AndroidUserCMWebService[i];
                }
            };


    public AndroidUserCMWebService(Parcel in) {
        super(new CMURLBuilder(in.readString()),
                new CMUserToken(in.readString()),
                new AndroidAsynchronousHttpClient());
    }

    public AndroidUserCMWebService(CMURLBuilder baseUrl, CMUserToken token, AsynchronousHttpClient asynchronousHttpClient) {
        super(baseUrl, token, asynchronousHttpClient);
    }
        @Override
    protected void addCloudMineHeader(AbstractHttpMessage message) {
        super.addCloudMineHeader(message);
        message.addHeader(DeviceIdentifier.deviceIdentifierHeader());
    }

    @Override
    protected String cloudMineAgent() {
        return AndroidCMWebService.CLOUD_MINE_AGENT;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(baseUrl.appPath());
        parcel.writeString(userToken.asJson());
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
