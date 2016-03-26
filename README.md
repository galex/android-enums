# android-enums

## sales Speech

Tired of using constants? Your code is unmaintainable because of constants? You hate constants? You love enums ? Want to make Android great again?

Look no more and use android-enums!

## Goal

The aim of this project is to have one set of enums to work with the Android Framework. Some enums are supported and it is strongly suggested to create an issue for any missing constants, or to participate and make a pull request.

## API

Every enum will have three functions:

    public int get() // returns the value the enum has in the Android Framework
    public TypeOfEnum get(int constantValue) // returns enum for the constant value it has in the Android Framework
    public TypeOfEnum get(String name) // returns the enum for a non case-sensitive string of that enum

Sometimes an Android API like TelephonyManager will return values that are not known to the Android Framework but to the phone manufacturer.
For that reason, and to be bulletproof, every enum has an UNKNOWN enum added to so you can always call get() and have a returned value.


## Supported Constants

Here are the list of constants converted to enums:

#### ConnectivityManager

##### ConnectivityType

    - TYPE_MOBILE
    - TYPE_WIFI
    - TYPE_MOBILE_MMS
    - TYPE_MOBILE_SUPL
    - TYPE_MOBILE_DUN
    - TYPE_MOBILE_HIPRI
    - TYPE_WIMAX
    - TYPE_DUMMY
    - TYPE_ETHERNET
    - TYPE_VPN

#### TelephonyManager

##### CallState

    - CALL_STATE_IDLE
    - CALL_STATE_RINGING
    - CALL_STATE_OFFHOOK

##### DataActivity

    - DATA_ACTIVITY_NONE
    - DATA_ACTIVITY_IN
    - DATA_ACTIVITY_OUT
    - DATA_ACTIVITY_INOUT
    - DATA_ACTIVITY_DORMANT


