#include <iostream>
#include <string>
#include <vector>
#include <sstream>
#include "item.h"
#include "vending_machine.h"

void Vending_Machine::add(std::string name, int price)
{
    Item item{price, name};
    items.push_back(item); //this is right, vs code is just tripping
}

void Vending_Machine::buy(int index)
{
    std::cout << "#### Buying " << items[index].to_string() << '\n';
}

std::string Vending_Machine::menu()
{
    std::stringstream menuList;
    for(int i = 0; i < items.size(); ++i )
    {
        menuList << i << ") " << items[i].to_string() << std::endl;
    }
    return menuList.str();
}