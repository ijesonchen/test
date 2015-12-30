#include "stdafx.h"
#include "QuickUnion.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif


QuickUnion::QuickUnion(int n)
	: UF(n)
{
}



QuickUnion::~QuickUnion()
{
}


void QuickUnion::Union(int p, int q)
{
	int proot = Find(p);
	int qroot = Find(q);
	if (proot == qroot)
	{
		return;
	}
	id[proot] = qroot;
	--group;
}


int  QuickUnion::Find(int p)
{
	while (p != id[p])
	{
		p = id[p];
	}
	return p;
}
