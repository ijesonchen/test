#ifdef _MSC_VER
	#pragma warning(disable: 4324 4189)
#endif // _MSC_VER

#include "TestFunc.h"
#include "TestObs.h"

void main(void)
{
	// main test code
	TestMongo();
	TestObs();
	// this code is used to check if memory leak detect is activated.
	char* p = new char[1234];
}