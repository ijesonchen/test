#ifndef AccessBase_h__
#define AccessBase_h__

#include "MongoClient.h"

// EmplaceBackCntr is STL container supports emplace_back
// Object is access target class

template<class Object>
class AccessBase
{
	const std::string m_collname;

	AccessBase(AccessBase& rhs) = delete;
	AccessBase(AccessBase&& rhs) = delete;
	AccessBase& operator = (AccessBase& rhs) = delete;
	AccessBase& operator = (AccessBase&& rhs) = delete;
public:
	AccessBase(const std::string& collname) : m_collname(collname) {};
	virtual ~AccessBase() {};

protected:
	template<class EmplaceBackCntr>
	bool QueryLoad(EmplaceBackCntr& objects, const bson_t* query, int nMax = 0)
	{
		AutoCursor cursor(m_collname, query, nMax);
		if (!cursor)
		{
			return false;
		}

		while (cursor.Next()) {
			objects.emplace_back();
			if (!ParseBson(objects.back(), cursor))
			{
				return false;
			}
		}

		return true;
	}

	template<class EmplaceBackCntr>
	bool QueryLoad(EmplaceBackCntr& objects, int nMax = 0)
	{
		MongoClib::AutoBson query;
		return QueryLoad(objects, query, nMax);
	}
	
	virtual bool ParseBson(Object&, const MongoClib::AutoCursor&) = 0;
};

#endif // AccessBase_h__
