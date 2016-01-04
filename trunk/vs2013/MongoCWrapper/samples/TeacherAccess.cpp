#ifdef _MSC_VER
#pragma warning(disable: 4324)
#endif // _MSC_VER

#include "TeacherAccess.h"

using namespace MongoClib;

TeacherAccess::TeacherAccess()
	: AccessBase("test")
{
}


TeacherAccess::~TeacherAccess()
{
}


// template<class EmplaceBackCntr>
// bool TeacherAccess::Load(EmplaceBackCntr& objects)
// {
// 	AutoBson query;
// 	return QueryLoad(objects);
// }


bool TeacherAccess::ParseBson(Teacher& obj, const MongoClib::AutoCursor& /*cursor*/)
{
	obj.idx = 0;
	obj.name = "asdf";
	return true;
}