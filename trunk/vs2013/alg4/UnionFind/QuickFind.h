#ifndef QuickFind_h__
#define QuickFind_h__


#include "UF.h"


class QuickFind :
	public UF
{
public:
	QuickFind(int n);
	~QuickFind();

	void Union(int p, int q);
	int  Find(int p);
};

#endif // QuickFind_h__
