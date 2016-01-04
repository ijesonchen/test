#ifndef Teacher_h__
#define Teacher_h__

#include <string>
#include <vector>

class Teacher
{
	struct Lesson
	{
		std::string title;
		int hours = 0;
	};
public:
	Teacher();
	~Teacher();
	int idx;
	std::string name;
	std::wstring wname;
	std::vector<std::string> students;
	std::vector<Lesson> lessons;
	std::string binData;
};

#endif // Teacher_h__
