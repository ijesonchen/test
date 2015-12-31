#ifndef WightedQuickFind_h__
#define WightedQuickFind_h__

#include "UF.h"


class WightedQuickFind :
	public UF
{
public:
	WightedQuickFind(int n);
	~WightedQuickFind();

	void Union(int p, int q);
	int  Find(int p);
};

#endif // WightedQuickFind_h__
