#ifndef QuickUnion_h__
#define QuickUnion_h__

#include "UF.h"


class QuickUnion :
	public UF
{
public:
	QuickUnion(int n);
	~QuickUnion();

	void Union(int p, int q);
	int  Find(int p);
};

#endif // QuickUnion_h__
