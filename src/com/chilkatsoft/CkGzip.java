/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkGzip {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkGzip(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkGzip obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkGzip(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkGzip() {
    this(chilkatJNI.new_CkGzip(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkGzip_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkGzip_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkGzip_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkGzip_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkGzip_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkGzip_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkGzip_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkGzip_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkGzip_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkGzip_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkGzip_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkGzip_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkGzip_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkGzip_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkGzip_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkGzip_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkGzip_SaveLastError(swigCPtr, this, path);
  }

  public void get_Comment(CkString str) {
    chilkatJNI.CkGzip_get_Comment(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String comment() {
    return chilkatJNI.CkGzip_comment(swigCPtr, this);
  }

  public void put_Comment(String newVal) {
    chilkatJNI.CkGzip_put_Comment(swigCPtr, this, newVal);
  }

  public void get_ExtraData(CkByteData outBytes) {
    chilkatJNI.CkGzip_get_ExtraData(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void put_ExtraData(CkByteData inBytes) {
    chilkatJNI.CkGzip_put_ExtraData(swigCPtr, this, CkByteData.getCPtr(inBytes), inBytes);
  }

  public void get_Filename(CkString str) {
    chilkatJNI.CkGzip_get_Filename(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String filename() {
    return chilkatJNI.CkGzip_filename(swigCPtr, this);
  }

  public void put_Filename(String newVal) {
    chilkatJNI.CkGzip_put_Filename(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkGzip_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkGzip_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_LastMod(SYSTEMTIME outSysTime) {
    chilkatJNI.CkGzip_get_LastMod(swigCPtr, this, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public void put_LastMod(SYSTEMTIME sysTime) {
    chilkatJNI.CkGzip_put_LastMod(swigCPtr, this, SYSTEMTIME.getCPtr(sysTime), sysTime);
  }

  public void get_LastModStr(CkString str) {
    chilkatJNI.CkGzip_get_LastModStr(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastModStr() {
    return chilkatJNI.CkGzip_lastModStr(swigCPtr, this);
  }

  public void put_LastModStr(String newVal) {
    chilkatJNI.CkGzip_put_LastModStr(swigCPtr, this, newVal);
  }

  public boolean get_UseCurrentDate() {
    return chilkatJNI.CkGzip_get_UseCurrentDate(swigCPtr, this);
  }

  public void put_UseCurrentDate(boolean newVal) {
    chilkatJNI.CkGzip_put_UseCurrentDate(swigCPtr, this, newVal);
  }

  public boolean CompressFile(String srcPath, String destPath) {
    return chilkatJNI.CkGzip_CompressFile(swigCPtr, this, srcPath, destPath);
  }

  public boolean CompressFile2(String srcPath, String embeddedFilename, String destPath) {
    return chilkatJNI.CkGzip_CompressFile2(swigCPtr, this, srcPath, embeddedFilename, destPath);
  }

  public boolean CompressFileToMem(String inFilename, CkByteData outData) {
    return chilkatJNI.CkGzip_CompressFileToMem(swigCPtr, this, inFilename, CkByteData.getCPtr(outData), outData);
  }

  public boolean CompressMemToFile(CkByteData inData, String destPath) {
    return chilkatJNI.CkGzip_CompressMemToFile(swigCPtr, this, CkByteData.getCPtr(inData), inData, destPath);
  }

  public boolean CompressMemory(CkByteData inData, CkByteData outData) {
    return chilkatJNI.CkGzip_CompressMemory(swigCPtr, this, CkByteData.getCPtr(inData), inData, CkByteData.getCPtr(outData), outData);
  }

  public boolean CompressString(String inStr, String destCharset, CkByteData outBytes) {
    return chilkatJNI.CkGzip_CompressString(swigCPtr, this, inStr, destCharset, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean CompressStringENC(String strIn, String charset, String encoding, CkString outStr) {
    return chilkatJNI.CkGzip_CompressStringENC(swigCPtr, this, strIn, charset, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String compressStringENC(String strIn, String charset, String encoding) {
    return chilkatJNI.CkGzip_compressStringENC(swigCPtr, this, strIn, charset, encoding);
  }

  public boolean CompressStringToFile(String inStr, String destCharset, String destPath) {
    return chilkatJNI.CkGzip_CompressStringToFile(swigCPtr, this, inStr, destCharset, destPath);
  }

  public boolean Decode(String str, String encoding, CkByteData outBytes) {
    return chilkatJNI.CkGzip_Decode(swigCPtr, this, str, encoding, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean DeflateStringENC(String strIn, String charset, String encoding, CkString outStr) {
    return chilkatJNI.CkGzip_DeflateStringENC(swigCPtr, this, strIn, charset, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String deflateStringENC(String strIn, String charset, String encoding) {
    return chilkatJNI.CkGzip_deflateStringENC(swigCPtr, this, strIn, charset, encoding);
  }

  public boolean Encode(CkByteData byteData, String encoding, CkString outStr) {
    return chilkatJNI.CkGzip_Encode(swigCPtr, this, CkByteData.getCPtr(byteData), byteData, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String encode(CkByteData byteData, String encoding) {
    return chilkatJNI.CkGzip_encode(swigCPtr, this, CkByteData.getCPtr(byteData), byteData, encoding);
  }

  public boolean ExamineFile(String inGzPath) {
    return chilkatJNI.CkGzip_ExamineFile(swigCPtr, this, inGzPath);
  }

  public boolean ExamineMemory(CkByteData inGzData) {
    return chilkatJNI.CkGzip_ExamineMemory(swigCPtr, this, CkByteData.getCPtr(inGzData), inGzData);
  }

  public CkDateTime GetDt() {
    long cPtr = chilkatJNI.CkGzip_GetDt(swigCPtr, this);
    return (cPtr == 0) ? null : new CkDateTime(cPtr, true);
  }

  public boolean InflateStringENC(String strIn, String charset, String encoding, CkString outStr) {
    return chilkatJNI.CkGzip_InflateStringENC(swigCPtr, this, strIn, charset, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String inflateStringENC(String strIn, String charset, String encoding) {
    return chilkatJNI.CkGzip_inflateStringENC(swigCPtr, this, strIn, charset, encoding);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkGzip_IsUnlocked(swigCPtr, this);
  }

  public boolean ReadFile(String path, CkByteData outBytes) {
    return chilkatJNI.CkGzip_ReadFile(swigCPtr, this, path, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean SetDt(CkDateTime dt) {
    return chilkatJNI.CkGzip_SetDt(swigCPtr, this, CkDateTime.getCPtr(dt), dt);
  }

  public boolean UnTarGz(String gzFilename, String destDir, boolean bNoAbsolute) {
    return chilkatJNI.CkGzip_UnTarGz(swigCPtr, this, gzFilename, destDir, bNoAbsolute);
  }

  public boolean UncompressFile(String srcPath, String destPath) {
    return chilkatJNI.CkGzip_UncompressFile(swigCPtr, this, srcPath, destPath);
  }

  public boolean UncompressFileToMem(String inFilename, CkByteData outData) {
    return chilkatJNI.CkGzip_UncompressFileToMem(swigCPtr, this, inFilename, CkByteData.getCPtr(outData), outData);
  }

  public boolean UncompressFileToString(String inFilename, String inCharset, CkString outStr) {
    return chilkatJNI.CkGzip_UncompressFileToString(swigCPtr, this, inFilename, inCharset, CkString.getCPtr(outStr), outStr);
  }

  public String uncompressFileToString(String inFilename, String inCharset) {
    return chilkatJNI.CkGzip_uncompressFileToString(swigCPtr, this, inFilename, inCharset);
  }

  public boolean UncompressMemToFile(CkByteData inData, String destPath) {
    return chilkatJNI.CkGzip_UncompressMemToFile(swigCPtr, this, CkByteData.getCPtr(inData), inData, destPath);
  }

  public boolean UncompressMemory(CkByteData inData, CkByteData outData) {
    return chilkatJNI.CkGzip_UncompressMemory(swigCPtr, this, CkByteData.getCPtr(inData), inData, CkByteData.getCPtr(outData), outData);
  }

  public boolean UncompressString(CkByteData inData, String inCharset, CkString outStr) {
    return chilkatJNI.CkGzip_UncompressString(swigCPtr, this, CkByteData.getCPtr(inData), inData, inCharset, CkString.getCPtr(outStr), outStr);
  }

  public String uncompressString(CkByteData inData, String inCharset) {
    return chilkatJNI.CkGzip_uncompressString(swigCPtr, this, CkByteData.getCPtr(inData), inData, inCharset);
  }

  public boolean UncompressStringENC(String strIn, String charset, String encoding, CkString outStr) {
    return chilkatJNI.CkGzip_UncompressStringENC(swigCPtr, this, strIn, charset, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String uncompressStringENC(String strIn, String charset, String encoding) {
    return chilkatJNI.CkGzip_uncompressStringENC(swigCPtr, this, strIn, charset, encoding);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkGzip_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean WriteFile(String path, CkByteData binaryData) {
    return chilkatJNI.CkGzip_WriteFile(swigCPtr, this, path, CkByteData.getCPtr(binaryData), binaryData);
  }

  public boolean XfdlToXml(String xfdl, CkString outStr) {
    return chilkatJNI.CkGzip_XfdlToXml(swigCPtr, this, xfdl, CkString.getCPtr(outStr), outStr);
  }

  public String xfdlToXml(String xfdl) {
    return chilkatJNI.CkGzip_xfdlToXml(swigCPtr, this, xfdl);
  }

}
