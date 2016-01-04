#include "mfcafx.h"

#include "TestFunc.h"
#include "MongocHelp.h"
#include "MongoAuto.h"

#include "mfcnew.h"

#include <algorithm>
#include <vector>
#include <deque>
#include <list>
#include <queue>
#include <stack>
#include <string>

#ifdef _MSC_VER
	#pragma comment(lib, "bson-1.0.lib")
	#pragma comment(lib, "mongoc-1.0.lib")
#endif // _MSC_VER

using namespace std;
using namespace MongoClib;

vector<string> vtSrc;


template<class IterInserter, class Trans>
void Transaorm(IterInserter inster, Trans transfunc)
{
	for (auto it : vtSrc)
	{
		*inster = transfunc(it);
	}
};


// auto fa = [](const std::string& str)->std::string { return str; };
// auto fb = [](const std::string& str)->std::wstring { return DecUtf8(str); };
// auto fc = [](const std::string& str)->CString { return DecUtf8MS(str); };

template<class Contrainer, class Trans>
void TranCntr(Contrainer& cntr, Trans transfunc)
{
	auto inserter = std::back_inserter(cntr);
	for (auto it : vtSrc)
	{
		*inserter = transfunc(it);
		++inserter;
	}
}


int main(void)
{
	TestMongo();

	for (int ii = 0; ii < 10; ++ii)
	{
		stringstream ss;
		ss << "Src_" << ii;
		vtSrc.push_back(ss.str());
	}


// 	string strc = fa("a");
// 	wstring stra = fb("a");
// 	CString strb = fc("a");
// 
// 	vector<string> vt1;
// 	deque<string> vt2;
// 	vector<wstring> vt3;
// 	deque<wstring> vt4;
// 	vector<CString> vt5;
// 	deque<CString> vt6;

// 	TranCntr(vt1, fa);
// 	TranCntr(vt2, fa);
// 	TranCntr(vt3, fb);
// 	TranCntr(vt4, fb);
// 	TranCntr(vt5, fc);
// 	TranCntr(vt6, fc);



	return 0;
}