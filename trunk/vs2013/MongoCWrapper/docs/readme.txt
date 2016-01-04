===============
mongo-c-wrapper
===============

Task TODO
=========
x1. invisilbe mongolibc function, so avoid client to use raw mogolic data.
    reject: too complex
v2. merge ConstBson to AutoBson
  const: const AutoBson
  if destroy: AutoBson::isDestroy. use flag to indicate if destroy bson_t.
  parse bson error indicator. use flag to indicate bson -> value failure.
  realized in template
v3. check function & parameter const property
x4. every function: working fine with nullptr parameter, or null Auto object, 
  return false if invalid parameter
  operator! check
  rejected: too complex
v5. AutoCmd ? how & when to use.
	support $set, $orderby, $query QueryBson
v6. error msg collector ( with tag: )
7. more sample & test case
v8. more help function, template non-member (like QueryLoad, etc...)  AccessBase.h
v9. AutoBson:: AddDoc AddArray in parameter bson_t* -> AutoBson (AutoBson::IsFailed)
v10. remove inline keyword
v11. AutoPoolColl::Find / Count parameter seq, make easier to use. 
 reneme some class.
 modify in BS proj
v12. remove BsonParser::operator BsonT* () & check in derived.

Known problem
=============

MongoClient:
 ctor: mongoc_init()
 dtor: mongoc_cleanup()
 may cause strange problem when application starts & exits if init & cleanup got panic.
 not encountered yet

inline:
 because compile will auto inline with optimization, most functions is not inline.
 

About
=====

mongo-c-wrapper is a c++ wrapper class of mongo-c-driver for convenient.
use RAII class for resource manager (see MongoAuto.h)

mongo-c-wrapper depends on mongo-c-wrapper

Support / Feedback / Bug-report
===============================
this src is priveded 'as-is'. use at your own risk.

Enviroment
==========

mongo-c-driver-1.2.0.tar

windows:
cmake-3.3.2-win32-x86
win7 x64 sp1
VS2013 w update 4

Linux: 
Centos 7 x64 with dev
gcc: 4.8.2

How-to
======
1. build mongo-c-driver 1.2.0. you can get src from mongodb.org.
   after build, you will get pkgconfig file for how to use the driver, including lib / include path, lib to link.
2. involve src files in your project, include MongoClient.h in your src.

Folder structure
================
build:
Makefile for CentOS 7 x64 and solution file for VS2013 in WIN7 for simple test program.

docs:
Readme file

lib64mongoc:
CentOS 7 x64 built mongo c driver lib, test program will use this to run. You can change this in build/centos/Makefile
copy libbson-1.0.so.0 & libmongoc-1.0.so.0 here after mongo-c-driver built.

samples:
sample for how to use mongo-c-wrapper. Student & StudentAccess are used only in MSVC because MFC class member CString.

src:
mongo-c-wrapper source code.

win32libmongc:
VS2013 x32 built mongo c driver lib. used for test program compiling & running.
copy bin, include, lib filder here after mongo-c-driver built. usually entire CMAKE_INSTALL_PREFIX assigned to cmake -DCMAKE_INSTALL_PREFIX parameter when building mongo c driver.
