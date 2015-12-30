#include "stdafx.h"
#include "QuickFind.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif


QuickFind::QuickFind(int n)
	: UF(n)
{
}


QuickFind::~QuickFind()
{
}


void QuickFind::Union(int p, int q)
{
	int pi = Find(p);
	int qi = Find(q);
	if (pi == qi)
	{
		return;
	}

	for (int ii = 0; ii < len; ++ii)
	{
		if (id[ii] == pi)
		{
			id[ii] = qi;
		}
	}
	--group;
}


int  QuickFind::Find(int p)
{
	return id[p];
}
