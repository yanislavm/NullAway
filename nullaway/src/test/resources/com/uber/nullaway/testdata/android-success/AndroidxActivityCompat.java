package com.uber.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import androidx.core.app.ActivityCompat;

public class AndroidxActivityCompat extends ActivityCompat {

  @NonNull private Object mOnCreateInitialisedField1;
  @NonNull private Object mOnCreateInitialisedField2;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mOnCreateInitialisedField1 = new Object();
  }

  @Override
  public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    super.onCreate(savedInstanceState);
    mOnCreateInitialisedField2 = new Object();
  }
}
