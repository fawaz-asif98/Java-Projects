#include <string>
#include <vector>
#include "item.h"
#ifndef _VENDING_MACHINE_H
#define _VENDING_MACHINE_H

class Vending_Machine
{
    public:
        void add(std::string name, int price);
        void buy(int index);
        std::string menu();

    private:
        std::vector < Item > items;

};
#endif