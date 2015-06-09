/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class SYSTEMTIME {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SYSTEMTIME(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SYSTEMTIME obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_SYSTEMTIME(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWYear(int value) {
    chilkatJNI.SYSTEMTIME_wYear_set(swigCPtr, this, value);
  }

  public int getWYear() {
    return chilkatJNI.SYSTEMTIME_wYear_get(swigCPtr, this);
  }

  public void setWMonth(int value) {
    chilkatJNI.SYSTEMTIME_wMonth_set(swigCPtr, this, value);
  }

  public int getWMonth() {
    return chilkatJNI.SYSTEMTIME_wMonth_get(swigCPtr, this);
  }

  public void setWDayOfWeek(int value) {
    chilkatJNI.SYSTEMTIME_wDayOfWeek_set(swigCPtr, this, value);
  }

  public int getWDayOfWeek() {
    return chilkatJNI.SYSTEMTIME_wDayOfWeek_get(swigCPtr, this);
  }

  public void setWDay(int value) {
    chilkatJNI.SYSTEMTIME_wDay_set(swigCPtr, this, value);
  }

  public int getWDay() {
    return chilkatJNI.SYSTEMTIME_wDay_get(swigCPtr, this);
  }

  public void setWHour(int value) {
    chilkatJNI.SYSTEMTIME_wHour_set(swigCPtr, this, value);
  }

  public int getWHour() {
    return chilkatJNI.SYSTEMTIME_wHour_get(swigCPtr, this);
  }

  public void setWMinute(int value) {
    chilkatJNI.SYSTEMTIME_wMinute_set(swigCPtr, this, value);
  }

  public int getWMinute() {
    return chilkatJNI.SYSTEMTIME_wMinute_get(swigCPtr, this);
  }

  public void setWSecond(int value) {
    chilkatJNI.SYSTEMTIME_wSecond_set(swigCPtr, this, value);
  }

  public int getWSecond() {
    return chilkatJNI.SYSTEMTIME_wSecond_get(swigCPtr, this);
  }

  public void setWMilliseconds(int value) {
    chilkatJNI.SYSTEMTIME_wMilliseconds_set(swigCPtr, this, value);
  }

  public int getWMilliseconds() {
    return chilkatJNI.SYSTEMTIME_wMilliseconds_get(swigCPtr, this);
  }

  public SYSTEMTIME() {
    this(chilkatJNI.new_SYSTEMTIME(), true);
  }

}
