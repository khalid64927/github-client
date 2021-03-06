package com.jraska.github.client.push

import android.app.Activity
import android.app.Application
import android.arch.lifecycle.LifecycleOwner
import android.os.Bundle

class PushCallbacks(private val intentObserver: PushIntentObserver) : Application.ActivityLifecycleCallbacks {

  override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
    if (activity is LifecycleOwner) {
      (activity as LifecycleOwner).lifecycle.addObserver(intentObserver)
    }
  }

  override fun onActivityStarted(activity: Activity) {}

  override fun onActivityResumed(activity: Activity) {}

  override fun onActivityPaused(activity: Activity) {}

  override fun onActivityStopped(activity: Activity) {}

  override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle?) {}

  override fun onActivityDestroyed(activity: Activity) {}
}
