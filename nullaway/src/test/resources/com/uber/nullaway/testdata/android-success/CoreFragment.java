package com.uber.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CoreFragment extends Fragment {

  @NonNull private Object mOnCreateInitialisedField;
  @NonNull private Object mOnCreateViewInitialisedField;
  @NonNull private Object mOnAttachInitialisedField;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mOnCreateInitialisedField = new Object();
  }

  @Nullable
  @Override
  public View onCreateView(
      @NonNull LayoutInflater inflater,
      @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    mOnCreateViewInitialisedField = new Object();
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    mOnAttachInitialisedField = new Object();
  }
}
