#ifndef UF_h__
#define UF_h__

#include <memory>
#include <array>

class UF
{
public:
	UF(int n)
		: id(new int[n])
		, len(n)
		, group(n)
	{
		upid.reset(id);
	};

	virtual ~UF() = 0
	{} ;

public:
	bool Connected(int p, int q)
	{
		return Find(p) == Find(q);
	}

	int  Count(void)
	{
		return group;
	}

	//////////////////////////////////////////////////////////////////////////
	// interface
public:
	virtual void Union(int p, int q) = 0;
	virtual int  Find(int p) = 0;
protected:
	// managed by upid
	int* const id = nullptr;
	int len = 0;
	int group = 0;
	std::unique_ptr<int, std::default_delete<int[]>> upid;
};

#endif // UF_h__
