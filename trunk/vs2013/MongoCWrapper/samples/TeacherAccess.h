#ifndef TeacherAccess_h__
#define TeacherAccess_h__

#include "AccessBase.h"
#include "Teacher.h"
#include <deque>

class TeacherAccess : public AccessBase<Teacher>
{
public:
	TeacherAccess();
	~TeacherAccess();

	template<class EmplaceBackCntr>
	bool Load(EmplaceBackCntr& objects)
	{
		AutoBson query;
		return QueryLoad(objects);
	}

private:
	bool ParseBson(Teacher& obj, const MongoClib::AutoCursor& cursor);
};

#endif // TeacherAccess_h__
