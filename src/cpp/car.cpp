#include <iostream>
#include "car.h"
using namespace std;

	void car::beep()
	{
		cout << "Beep! Beep!" << endl;
	}

	void car::setValue(float carValue)
	{
		value = carValue;
	}

	float car::getValue()
	{
		return value;
	}
