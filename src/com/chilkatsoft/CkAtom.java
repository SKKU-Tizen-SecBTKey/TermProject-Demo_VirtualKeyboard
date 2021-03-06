/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkAtom {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkAtom(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkAtom obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkAtom(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkAtom() {
    this(chilkatJNI.new_CkAtom(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkAtom_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkAtom_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkAtom_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkAtom_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkAtom_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkAtom_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkAtom_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkAtom_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkAtom_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkAtom_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkAtom_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkAtom_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkAtom_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkAtom_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkAtom_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkAtom_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkAtom_SaveLastError(swigCPtr, this, path);
  }

  public int get_NumEntries() {
    return chilkatJNI.CkAtom_get_NumEntries(swigCPtr, this);
  }

  public int AddElement(String tag, String value) {
    return chilkatJNI.CkAtom_AddElement(swigCPtr, this, tag, value);
  }

  public int AddElementDate(String tag, SYSTEMTIME dateTime) {
    return chilkatJNI.CkAtom_AddElementDate(swigCPtr, this, tag, SYSTEMTIME.getCPtr(dateTime), dateTime);
  }

  public int AddElementDateStr(String tag, String dateTimeStr) {
    return chilkatJNI.CkAtom_AddElementDateStr(swigCPtr, this, tag, dateTimeStr);
  }

  public int AddElementDt(String tag, CkDateTime dateTime) {
    return chilkatJNI.CkAtom_AddElementDt(swigCPtr, this, tag, CkDateTime.getCPtr(dateTime), dateTime);
  }

  public int AddElementHtml(String tag, String htmlStr) {
    return chilkatJNI.CkAtom_AddElementHtml(swigCPtr, this, tag, htmlStr);
  }

  public int AddElementXHtml(String tag, String xmlStr) {
    return chilkatJNI.CkAtom_AddElementXHtml(swigCPtr, this, tag, xmlStr);
  }

  public int AddElementXml(String tag, String xmlStr) {
    return chilkatJNI.CkAtom_AddElementXml(swigCPtr, this, tag, xmlStr);
  }

  public void AddEntry(String xmlStr) {
    chilkatJNI.CkAtom_AddEntry(swigCPtr, this, xmlStr);
  }

  public void AddLink(String rel, String href, String title, String typ) {
    chilkatJNI.CkAtom_AddLink(swigCPtr, this, rel, href, title, typ);
  }

  public void AddPerson(String tag, String name, String uri, String email) {
    chilkatJNI.CkAtom_AddPerson(swigCPtr, this, tag, name, uri, email);
  }

  public void DeleteElement(String tag, int index) {
    chilkatJNI.CkAtom_DeleteElement(swigCPtr, this, tag, index);
  }

  public void DeleteElementAttr(String tag, int index, String attrName) {
    chilkatJNI.CkAtom_DeleteElementAttr(swigCPtr, this, tag, index, attrName);
  }

  public void DeletePerson(String tag, int index) {
    chilkatJNI.CkAtom_DeletePerson(swigCPtr, this, tag, index);
  }

  public boolean DownloadAtom(String url) {
    return chilkatJNI.CkAtom_DownloadAtom(swigCPtr, this, url);
  }

  public boolean GetElement(String tag, int index, CkString outStr) {
    return chilkatJNI.CkAtom_GetElement(swigCPtr, this, tag, index, CkString.getCPtr(outStr), outStr);
  }

  public String getElement(String tag, int index) {
    return chilkatJNI.CkAtom_getElement(swigCPtr, this, tag, index);
  }

  public String element(String tag, int index) {
    return chilkatJNI.CkAtom_element(swigCPtr, this, tag, index);
  }

  public boolean GetElementAttr(String tag, int index, String attrName, CkString outStr) {
    return chilkatJNI.CkAtom_GetElementAttr(swigCPtr, this, tag, index, attrName, CkString.getCPtr(outStr), outStr);
  }

  public String getElementAttr(String tag, int index, String attrName) {
    return chilkatJNI.CkAtom_getElementAttr(swigCPtr, this, tag, index, attrName);
  }

  public String elementAttr(String tag, int index, String attrName) {
    return chilkatJNI.CkAtom_elementAttr(swigCPtr, this, tag, index, attrName);
  }

  public int GetElementCount(String tag) {
    return chilkatJNI.CkAtom_GetElementCount(swigCPtr, this, tag);
  }

  public boolean GetElementDate(String tag, int index, SYSTEMTIME outSysTime) {
    return chilkatJNI.CkAtom_GetElementDate(swigCPtr, this, tag, index, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public boolean GetElementDateStr(String tag, int index, CkString outStr) {
    return chilkatJNI.CkAtom_GetElementDateStr(swigCPtr, this, tag, index, CkString.getCPtr(outStr), outStr);
  }

  public String getElementDateStr(String tag, int index) {
    return chilkatJNI.CkAtom_getElementDateStr(swigCPtr, this, tag, index);
  }

  public String elementDateStr(String tag, int index) {
    return chilkatJNI.CkAtom_elementDateStr(swigCPtr, this, tag, index);
  }

  public CkDateTime GetElementDt(String tag, int index) {
    long cPtr = chilkatJNI.CkAtom_GetElementDt(swigCPtr, this, tag, index);
    return (cPtr == 0) ? null : new CkDateTime(cPtr, true);
  }

  public CkAtom GetEntry(int index) {
    long cPtr = chilkatJNI.CkAtom_GetEntry(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkAtom(cPtr, true);
  }

  public boolean GetLinkHref(String relName, CkString outStr) {
    return chilkatJNI.CkAtom_GetLinkHref(swigCPtr, this, relName, CkString.getCPtr(outStr), outStr);
  }

  public String getLinkHref(String relName) {
    return chilkatJNI.CkAtom_getLinkHref(swigCPtr, this, relName);
  }

  public String linkHref(String relName) {
    return chilkatJNI.CkAtom_linkHref(swigCPtr, this, relName);
  }

  public boolean GetPersonInfo(String tag, int index, String tag2, CkString outStr) {
    return chilkatJNI.CkAtom_GetPersonInfo(swigCPtr, this, tag, index, tag2, CkString.getCPtr(outStr), outStr);
  }

  public String getPersonInfo(String tag, int index, String tag2) {
    return chilkatJNI.CkAtom_getPersonInfo(swigCPtr, this, tag, index, tag2);
  }

  public String personInfo(String tag, int index, String tag2) {
    return chilkatJNI.CkAtom_personInfo(swigCPtr, this, tag, index, tag2);
  }

  public boolean GetTopAttr(String attrName, CkString outStr) {
    return chilkatJNI.CkAtom_GetTopAttr(swigCPtr, this, attrName, CkString.getCPtr(outStr), outStr);
  }

  public String getTopAttr(String attrName) {
    return chilkatJNI.CkAtom_getTopAttr(swigCPtr, this, attrName);
  }

  public String topAttr(String attrName) {
    return chilkatJNI.CkAtom_topAttr(swigCPtr, this, attrName);
  }

  public boolean HasElement(String tag) {
    return chilkatJNI.CkAtom_HasElement(swigCPtr, this, tag);
  }

  public boolean LoadXml(String xmlStr) {
    return chilkatJNI.CkAtom_LoadXml(swigCPtr, this, xmlStr);
  }

  public void NewEntry() {
    chilkatJNI.CkAtom_NewEntry(swigCPtr, this);
  }

  public void NewFeed() {
    chilkatJNI.CkAtom_NewFeed(swigCPtr, this);
  }

  public void SetElementAttr(String tag, int index, String attrName, String attrValue) {
    chilkatJNI.CkAtom_SetElementAttr(swigCPtr, this, tag, index, attrName, attrValue);
  }

  public void SetTopAttr(String attrName, String value) {
    chilkatJNI.CkAtom_SetTopAttr(swigCPtr, this, attrName, value);
  }

  public boolean ToXmlString(CkString outStr) {
    return chilkatJNI.CkAtom_ToXmlString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toXmlString() {
    return chilkatJNI.CkAtom_toXmlString(swigCPtr, this);
  }

  public void UpdateElement(String tag, int index, String value) {
    chilkatJNI.CkAtom_UpdateElement(swigCPtr, this, tag, index, value);
  }

  public void UpdateElementDate(String tag, int index, SYSTEMTIME dateTime) {
    chilkatJNI.CkAtom_UpdateElementDate(swigCPtr, this, tag, index, SYSTEMTIME.getCPtr(dateTime), dateTime);
  }

  public void UpdateElementDateStr(String tag, int index, String dateTimeStr) {
    chilkatJNI.CkAtom_UpdateElementDateStr(swigCPtr, this, tag, index, dateTimeStr);
  }

  public void UpdateElementDt(String tag, int index, CkDateTime dateTime) {
    chilkatJNI.CkAtom_UpdateElementDt(swigCPtr, this, tag, index, CkDateTime.getCPtr(dateTime), dateTime);
  }

  public void UpdateElementHtml(String tag, int index, String htmlStr) {
    chilkatJNI.CkAtom_UpdateElementHtml(swigCPtr, this, tag, index, htmlStr);
  }

  public void UpdateElementXHtml(String tag, int index, String xmlStr) {
    chilkatJNI.CkAtom_UpdateElementXHtml(swigCPtr, this, tag, index, xmlStr);
  }

  public void UpdateElementXml(String tag, int index, String xmlStr) {
    chilkatJNI.CkAtom_UpdateElementXml(swigCPtr, this, tag, index, xmlStr);
  }

  public void UpdatePerson(String tag, int index, String name, String uri, String email) {
    chilkatJNI.CkAtom_UpdatePerson(swigCPtr, this, tag, index, name, uri, email);
  }

}
